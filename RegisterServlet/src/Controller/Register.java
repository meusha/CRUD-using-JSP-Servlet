package Controller;


import DbHandler.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by User on 4/21/2017.
 */

public class Register extends HttpServlet {

   Connection con=DbConnection.getConnection();

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();


        String name= request.getParameter("Name");
        String email=request.getParameter("Email");
        String password= request.getParameter("Password");


        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO register values (?,?,?)");
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,password);

            int status=ps.executeUpdate();
            if (status>0){

                out.println("You are Successfully Registered");

            }
            else{
                out.println("Registration failed");
            }
        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
