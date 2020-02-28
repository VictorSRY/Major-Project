package DB;

import com.victor.Obj.Questions;
import com.victor.Obj.Topic;
import com.victor.Obj.TopicTypes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author VictorMiles@14feb.lol
 */
public class ConnectionDB {

    static Connection con = null;
    static PreparedStatement ps = null;
    static Statement st = null;
    static ResultSet rs = null;

    public ConnectionDB() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver lol");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/placementtalks", "root", "root");
            System.out.println("db lol");
            /*ps=con.prepareStatement("");*/
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
    }

    /*public Connection getConnection(){
        
        return con;
    }*/
    public Questions[] getQues(String topic) throws SQLException {
        System.out.println("getQue "+topic+" 48");
        ArrayList<Questions> tempQues = new ArrayList<>();
        int qid;
        String question;
        String a, b, c, d, ans;
        boolean rand;
        try {
            rs = st.executeQuery("Select Qno,Question,a,b,c,d,ans,rand from " + topic/* + topic +*/);
            while (rs.next()) {
                qid = rs.getInt("Qno");
                question = rs.getString("Question");
                a = rs.getString("a");
                b = rs.getString("b");
                c = rs.getString("c");
                d = rs.getString("d");
                ans = rs.getString("ans");
                rand = rs.getBoolean("rand");
                tempQues.add(new Questions(qid, question, a, b, c, d, ans, rand));
                System.out.println(question + " " + a);
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
        Questions[] ques = new Questions[tempQues.size()];
        ques = tempQues.toArray(ques);
        return ques;
    }

    public TopicTypes[] getTopicsAndTypes() {
        System.out.println("lol getTopicAndType"+" 77");
        TopicTypes[] topicsTypes;
        ArrayList<TopicTypes> tempTopics = new ArrayList<>();
        try {
            ResultSet rsTopicType = st.executeQuery("select * from TopicTypes");
            while (rsTopicType.next()) {
                String type = rsTopicType.getString("Sname");
                System.out.println(type+" 84");
                tempTopics.add(new TopicTypes(type));
            }
        } catch (SQLException e) {
            System.out.print(e +"lol 88");
        }
        int limit=tempTopics.size();
        for (int i = 0; i < limit; i++) {
            TopicTypes temp=tempTopics.get(i);
            System.out.println(temp.getType()+" ");
            temp.setTopics(getTopic(temp.getType()));
        }
        topicsTypes = new TopicTypes[limit];
        topicsTypes = tempTopics.toArray(topicsTypes);
        return topicsTypes;
    }

    public Topic[] getTopic(String type) {
        System.out.println("lol getTopic " +type +" 96");
        ResultSet rsTopic;
        ArrayList<Topic> allTopic = new ArrayList<>();
        try {
            rsTopic = st.executeQuery("select * from " + type +";");
            while (rsTopic.next()) {
                allTopic.add(new Topic(rsTopic.getString("topicName"), rsTopic.getInt("wait")));
                System.out.println("lol "+rsTopic.getString("topicName")+" "+ rsTopic.getInt("wait"));
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
        Topic[] topicArray = new Topic[allTopic.size()];
        topicArray = allTopic.toArray(topicArray);
        return topicArray;
    }

    public Questions[] getMock() throws SQLException {
        System.out.println("lol getMock");
        ArrayList<Questions> tempQues = new ArrayList<>();
        int qid;
        String question;
        String a, b, c, d, ans;
        boolean rand;
        TopicTypes[] topics = this.getTopicsAndTypes();
        System.out.println("lol topic sucess 127");
        int topicsSize = topics.length;
        for (TopicTypes tt : topics) {
            for (Topic t : tt.getTopics()) {
                String name = t.getName();
                int wait = t.getWait();
                try {
                    System.out.println("lol "+name+" 134");
                    rs = st.executeQuery("SELECT * FROM " + name + " ORDER BY RAND() LIMIT " + wait);
                    while (rs.next()) {
                        qid = rs.getInt("Qno");
                        question = rs.getString("Question");
                        a = rs.getString("a");
                        b = rs.getString("b");
                        c = rs.getString("c");
                        d = rs.getString("d");
                        ans = rs.getString("ans");
                        rand = rs.getBoolean("rand");
                        tempQues.add(new Questions(qid, question, a, b, c, d, ans, rand));
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
        /*String[] topicNames = topics[i].getTopics();
                int topicNamesSize = topicNames.length;
                    
        try {
                for (int j = 0; j < topicNamesSize; j++) {
                    String topic = topicNames[i];
                    int wait = 0;
                    rs = st.executeQuery("SELECT wait FROM MockWait where mockTopic = " + topic);
                    while (rs.next()) {
                        wait = rs.getInt("wait");
                    }
                    rs = st.executeQuery("SELECT * FROM " + topic + " ORDER BY RAND() LIMIT " + wait);
                    while (rs.next()) {
                        qid = rs.getInt("Qno");
                        question = rs.getString("Question");
                        a = rs.getString("a");
                        b = rs.getString("b");
                        c = rs.getString("c");
                        d = rs.getString("d");
                        ans = rs.getString("ans");
                        rand = rs.getBoolean("rand");
                        tempQues.add(new Questions(qid, question, a, b, c, d, ans, rand));
                        System.out.println(question + " " + a);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.print(e);
        }*/
        Questions[] mockQues = new Questions[tempQues.size()];
        mockQues = tempQues.toArray(mockQues);
        return mockQues;
    }
}
