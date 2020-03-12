/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victor.logics;

import DB.ConnectionUser;
import com.victor.Obj.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SRY
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int cCode = Integer.parseInt(request.getParameter("computerCode"));
        String password = request.getParameter("password");
        String type = request.getParameter("type");
        User user = null;
        HttpSession session = request.getSession();
        try {
            ConnectionUser CU = new ConnectionUser();
            String fName = "", mName = "", lName = "";
            ResultSet rs;
            switch (type) {
                case "Student":
                    rs = CU.checkStudent(cCode);
                    while (rs.next()) {
                        fName = rs.getString("F_Name");
                        mName = rs.getString("M_Name");
                        lName = rs.getString("L_Name");
                        System.out.println(password + " " + rs.getString("password"));
                        if (password.equals(rs.getString("password"))) {
                            user = new User(fName, mName, lName, cCode, false);
                        } else {
                            response.sendRedirect("#");
                        }
                    }
                    break;
                case "Faculties":
                    rs = CU.checkFaculties(cCode);
                    while (rs.next()) {
                        fName = rs.getString("F_Name");
                        mName = rs.getString("M_Name");
                        lName = rs.getString("L_Name");
                        System.out.println(password.equals(rs.getString("password")));
                        if (password.equals(rs.getString("password"))) {
                            user = new User(fName, mName, lName, cCode, false);

                        } else {
                            response.sendRedirect("#");
                        }
                    }
                    break;
                case "Admin":
                    if ((cCode == 0614) && (password == "lol")) {
                        user = new User("Victor", null, "", cCode, true);
                    } else {
                        response.sendRedirect("#");
                    }
                    break;
            }
            /*session.setAttribute("user", user);*/
            session.setAttribute("uid", cCode);
            session.setAttribute("uName", user.getUname());
            session.setAttribute("edit", user.getEditRight());
            session.setAttribute("logIn", true);
            response.sendRedirect("JSP/SelectTopicPage.jsp");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
