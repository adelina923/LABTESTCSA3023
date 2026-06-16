/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.DAO.SessionDAO;
import com.model.SessionBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookSessionServlet {
    
    private SessionDAO sessionDAO;

    public void init() {
        SessionDAO = new SessionDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("student_name");
        String location = request.getParameter("branch_location");
        String type = request.getParameter("lesson_type");
        String status = request.getParameter("status");
        
        Session newSession = new Session(student_name, branch_location, lesson_type, status);
        sessionDAO.insertSession(newSession); // Panggil DAO, bukan JDBC
        
        response.sendRedirect("ScheduleServlet");
    }
}
  

