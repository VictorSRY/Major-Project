/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class conn {
    static Connection con=null;
    static Statement st=null;
    static ResultSet rs=null;
    public static void main (String args[]){
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("driver lol");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/majorpro", "root", "root");
        System.out.println("db lol");
        st=con.createStatement();
        rs=st.executeQuery("select * from topic");
        while(rs.next())
        {
            System.out.println(rs.getString(1));
        }
    }
        
    catch(Exception e){
            System.out.println(e);
    }
    }
}
