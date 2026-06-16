<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Session</title>

    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .container {
            width: 400px;
            margin: 50px auto;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 8px;
        }

        h2 {
            text-align: center;
        }

        label {
            font-weight: bold;
        }

        input, select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 15px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            opacity: 0.9;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>DriveSmart Academy - Book Session</h2>

        <form method="POST" action="BookSessionServlet">

            <label for="student_name">Student Name:</label>
            <input type="text" id="student_name" 
                   name="student_name" required>

            <label for="branch_location">Branch Location:</label>
            <input type="text" id="branch_location" 
                   name="branch_location" required>

            <label for="lesson_type">Lesson Type:</label>
            <input type="text" id="lesson_type" 
                   name="lesson_type" required>

            <input type="submit" value="Book Session">

        </form>
    </div>

</body>
</html>