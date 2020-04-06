/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.victor.Obj.InterviewQues;
import com.victor.Obj.InterviewQuesAns;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SRY
 */
public class ConnectionInterviewDB {

    static Connection con = null;
    static PreparedStatement ps = null;
    static Statement st = null;
    static ResultSet rs = null;

    public ConnectionInterviewDB() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver lol");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/placementtalksqanda", "root", "root");
            System.out.println("db lol");
            /*ps=con.prepareStatement("");*/
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
    }

    public InterviewQues[] getInterviewQuestion() throws SQLException {
        ArrayList<InterviewQues> tempIQue = new ArrayList<>();
        int Qid;
        String Question;
        InterviewQuesAns[] ansArray;
        int helpfull;
        String topicTag;
        try {
            rs = st.executeQuery("Select * from interviewquestion;");
            while (rs.next()) {
                Qid = rs.getInt("Qid");
                Question = rs.getString("Question");
                ansArray = getInterviewQuesAns(Qid);
                helpfull = rs.getInt("helpfull");
                topicTag = rs.getString("topicTag");
                tempIQue.add(new InterviewQues(Qid, Question, helpfull, ansArray, topicTag));
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        InterviewQues[] interviewQuestions=new InterviewQues[tempIQue.size()];
        interviewQuestions=tempIQue.toArray(interviewQuestions);
        return interviewQuestions;
    }

    private InterviewQuesAns[] getInterviewQuesAns(int Qid)  throws SQLException {
        ResultSet trs;
        int ansId;
        String ans;
        int helpfull;
        ArrayList<InterviewQuesAns> tempinterviewQuesAns=new ArrayList<>();
        try{
            trs=st.executeQuery("select * from interviewquesans where Qid = '"+Qid+"';");
            while(trs.next()){
                ansId=trs.getInt("AId");
                ans=trs.getString("Ans");
                helpfull=trs.getInt("helpfull");
                tempinterviewQuesAns.add(new InterviewQuesAns(ansId, ans, helpfull));
            }
        } catch(SQLException e){
            System.out.println(e);
        }
        InterviewQuesAns[] interviewQuesAnses=new InterviewQuesAns[tempinterviewQuesAns.size()];
        interviewQuesAnses=tempinterviewQuesAns.toArray(interviewQuesAnses);
        return interviewQuesAnses;
    }
    public boolean addInterviewQuestion(String Question,int helpfull,InterviewQuesAns[] ansArry,String topicTag) throws SQLException {
        try{
            ps=con.prepareStatement("Insert into interviewquestion (Question,helpfull,topicTag) values('"+Question+"',"+helpfull+",'"+topicTag+"');");
            int result=ps.executeUpdate();
            if(result<1){
                return false;
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    public boolean addInterviewQuesAns(String ans,int helpfull,String Qid ,String uid,String uname ,String date) throws SQLException {
        System.out.println("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
        try{
            String str="Insert into interviewquesans VALUES (NULL,'"+ans+"','"+Qid+"','"+uid+"','"+uname+"','"+helpfull+"','"+date+"');";
            System.out.println(str);
            ps=con.prepareStatement(str);
            int result=ps.executeUpdate();
            System.out.println(result);
        if(result<1){
                return false;
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return false;
        }
        return true;
    }
}
/*
mysql> ALTER TABLE interviewquesans ADD constraint qid FOREIGN KEY (QId) REFERENCES interviewquestion(Qid);*/