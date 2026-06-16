<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.model.SessionBean" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Training Schedule</title>
    
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin: auto;
        }

        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }

        h2 {
            text-align: center;
        }
    </style>
</head>
<body>

    <h2>Centralized Training Schedule</h2>

    <table>
        <tr>
            <th>Student Name</th>
            <th>Branch Location</th>
            <th>Lesson Type</th>
        </tr>

        <%
            List<SessionBean> sessionList = 
                (List<SessionBean>) request.getAttribute("sessionList");

            if (sessionList != null) {
                for (Session session : sessionList) {
        %>

        <tr>
            <td><%= session.getStudentName() %></td>
            <td><%= session.getBranchLocation() %></td>
            <td><%= session.getLessonType() %></td>
        </tr>

        <%
                }
            }
        %>

    </table>

</body>
</html>

}