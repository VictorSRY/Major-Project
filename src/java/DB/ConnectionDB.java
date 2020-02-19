package DB;

import com.victorObj.Questions;
import com.victorObj.Topic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.Cookie;

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

    public Topic[] getTopicsAndTypes() {
        Topic[] topicsTypes;
        ArrayList<Topic> tempTopics = new ArrayList<>();
        try {
            rs = st.executeQuery("select * from TopicTypes");
            while (rs.next()) {
                String type = rs.getString(1);
                tempTopics.add(new Topic(type, getTopic(type)));
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
        topicsTypes = new Topic[tempTopics.size()];
        topicsTypes = tempTopics.toArray(topicsTypes);
        return topicsTypes;
    }

    public String[] getTopic(String type) {
        ArrayList<String> allTopic = new ArrayList<>();
        try {
            rs = st.executeQuery("select * from " + type);
            while (rs.next()) {
                allTopic.add(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
        String[] topicArray = new String[allTopic.size()];
        topicArray = allTopic.toArray(topicArray);
        return topicArray;
    }

    public Questions[] getMock() {
        ArrayList<Questions> tempQues = new ArrayList<>();
        int qid;
        String question;
        String a, b, c, d, ans;
        boolean rand;
        try {
            Topic[] topics = this.getTopicsAndTypes();
            int topicsSize = topics.length;
            for (int i = 0; i < topicsSize; i++) {
                String[] topicNames = topics[i].getTopics();
                int topicNamesSize = topicNames.length;
                for (int j = 0; j < topicNamesSize; j++) {
                    String topic = topicNames[i];
                    int wait = 0;
                    rs = st.executeQuery("SELECT wait FROM MockWait where mockTopic = " + topic);
                    while (rs.next()) {
                        wait = rs.getInt(wait);
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
        }
        Questions[] mockQues = new Questions[tempQues.size()];
        return mockQues;
    }
}
