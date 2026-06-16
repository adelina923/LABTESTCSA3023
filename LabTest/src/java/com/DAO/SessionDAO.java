/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.model.SessionBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
        
public class SessionDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/drivesmart_db";
    private String jdbcUsername = "root";
    private String jdbcPassword = "admin";


protected Connection getConnection() {
    Connection connection = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(jdbcURL,
        jdbcUsername, jdbcPassword);
    }  catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return connection;
}

public void InsertSession(Session session) {
    String sql = "INSERT INTO Training_Sessions (student_name, branch_location, lesson_type, status) VALUES (?, ?, ?, ?)";
    try (Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, session.getName());
        pstmt.setString(2, session.getLocation());
        pstmt.setString(3, session.getType());
        pstmt.setString(4, session.getStatus());
        pstmt.executeUpdate();
    
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public List<SessionBean> selectAllSessions() {
    List<SessionBean> sessions = new ArrayList<>();
    String sql = "SELECT * FROM Training_Session";
    try (Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("session_id");
            
            String name = rs.getString("student_name");
            String location = rs.getString("branch_location");
            String type = rs.getString("lesson_type");
            String status = rs.getString("status");
            sessions.add(new Session(session_id, student_name, branch_location, lesson_type, status));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return sessions;
}
}

