/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.victor.Obj.InterviewQues;
import com.victor.Obj.InterviewQuesAns;
import com.victor.Obj.User;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class ConnectionUser {
    static Connection con = null;
    static PreparedStatement ps = null;
    static Statement st = null;
    static ResultSet rs = null;
    public ConnectionUser() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver lol");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPPUserDB", "root", "root");
            System.out.println("db PPPUserDB lol");
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
    }
    
    public static ResultSet checkStudent(int C_Code){
        String F_Name,M_Name,L_Name;
        User cur_User;
        try {
            rs=st.executeQuery("Select * from Student where C_Code = "+C_Code);
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return rs;
    }
    public static ResultSet checkFaculties(int C_Code){
        String F_Name,M_Name,L_Name;
        User cur_User;
        try {
            rs=st.executeQuery("Select * from Faculties where C_Code = "+C_Code);
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return rs;
    }
}
