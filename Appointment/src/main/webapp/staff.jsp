<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>KTHJ Hospital</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background: url('hospital-image.jpg') no-repeat center center fixed;
            background-size: cover;
        }

        h1 {
            background-color: #3F51B5; /* Royal blue background */
            color: #fff; /* White heading text */
            text-align: center;
            padding: 30px 0; /* Larger padding for the heading */
            margin: 0;
            font-size: 60px; /* Larger font size for the heading */
            font-family: 'Verdana', 'Geneva', sans-serif; /* Clean and modern font */
            border-top: 5px solid #E91E63; /* Pink top border for a vibrant touch */
        }

        .button-container {
            text-align: center;
            margin-top: 30px;
        }

        .login-button {
            background-color: #E91E63; /* Pink button background */
            color: #fff; /* White button text */
            padding: 15px 30px; /* Larger padding for buttons */
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            margin: 15px;
            display: inline-block;
            font-size: 24px; /* Larger font size for buttons */
            transition: background-color 0.3s; /* Smooth hover effect */
        }

        .login-button:hover {
            background-color: #D81B60; /* Darker pink on hover */
        }
    </style>
</head>
<body>
    <h1>KTHJ Hospital</h1>
    <div class="button-container">
        <a class="login-button" href="/receptionist/login">Receptionist Login</a>
        <a class="login-button" href="/login">Doctor Login</a>
        <a class="login-button" href="/administrator/login">Admin Login</a>
    </div>
</body>
</html>
