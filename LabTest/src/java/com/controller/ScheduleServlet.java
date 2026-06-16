/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.DAO.SessionDAO;
import com.model.SessionBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScheduleServlet {

@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private SessionDAO sessionDAO;

    @Override
    public void init() {
        sessionDAO = new SessionDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Call DAO method to get all sessions
        List<SessionBean> list =
                sessionDAO.selectAllSessions();

        // Set request attribute
        request.setAttribute("sessionList", list);

        // Forward request to schedule.jsp
        RequestDispatcher dispatcher =
                request.getRequestDispatcher("schedule.jsp");

        dispatcher.forward(request, response);
    }
}
}