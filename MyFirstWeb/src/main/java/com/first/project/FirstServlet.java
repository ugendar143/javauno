package com.first.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class FirstServelt
 */
@WebServlet({ "/FirstServlet", "/first" })
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("user_name");
        Connection con = null;
        PreparedStatement pstmt = null;
        PrintWriter pwriter = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_web_app", "root", "ugendar@143");
            pstmt = con.prepareStatement("INSERT INTO user (user_name) VALUES (?)");
            pstmt.setString(1, username);
            int result = pstmt.executeUpdate();
            if (result > 0) {
                response.setContentType("text/html");
                pwriter.print("<p style='font_size:25px;color:green'>Data Inserted successfully</p>");
                pwriter.print("<p style='font_size:20 px;color:blue'>Name:" + username + "</p>");
            } else {
                response.setContentType("text/html");
                pwriter.print("<p style='font_size:25px;color:Red'>Data cannot be Inserted</p>");
                pwriter.print("<p style =' font_size:20px;color:blue'>Name:" + username + "</p>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
                pwriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
