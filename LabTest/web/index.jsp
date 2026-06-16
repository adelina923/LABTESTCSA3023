<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>DriveSmart Academy</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        .container {
            margin-top: 60px;
        }

        h2 {
            margin-bottom: 30px;
        }

        .menu a {
            display: inline-block;
            width: 250px;
            margin: 15px;
            padding: 15px;
            text-decoration: none;
            background-color: #007BFF;
            color: white;
            border-radius: 8px;
            font-size: 18px;
        }

        .menu a:hover {
            opacity: 0.9;
        }
    </style>
</head>
<body>

    <!-- Include Header -->
    <%@ include file="header.html" %>

    <div class="container">

        <h2>Welcome to DriveSmart Academy</h2>

        <p>Please choose a module below:</p>

        <div class="menu">

            <!-- Booking Form -->
            <a href="book_session.jsp">
                Book Training Session
            </a>

            <!-- Schedule Dashboard -->
            <a href="ScheduleServlet">
                View Training Schedule
            </a>

        </div>

    </div>

    <!-- Include Footer -->
    <%@ include file="footer.jsp" %>

</body>
</html>