<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor's Dashboard</title>

    <!-- Include jQuery -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    <!-- Include jQuery UI CSS and JavaScript -->
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            color: #333;
        }

        h2 {
            background-color: #2196F3;
            color: #fff;
            text-align: center;
            padding: 15px 0;
            margin: 0;
        }

        h3 {
            margin: 20px 0;
            color: #333;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        th, td {
            text-align: left;
            padding: 12px;
        }

        th {
            background-color: #007BFF;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        form {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin: 20px 0;
        }

        label {
            display: block;
            margin: 10px 0;
            color: #333;
            font-weight: bold;
        }

        input[type="text"],
        input[type="text"],
        input[type="number"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button {
            background-color: #E91E63;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #D81B60;
        }

        a {
            display: block;
            text-align: center;
            color: #E91E63;
            text-decoration: none;
            margin-top: 20px;
        }

        a:hover {
            text-decoration: underline;
        }

        .welcome-doctor {
            background-color: #556B2F;
            color: #fff;
            text-align: center;
            padding: 15px 0;
            margin: 0;
        }
    </style>

    <script>
        $(function () {
            $("#leaveStartDate").datepicker({
                dateFormat: 'yy-mm-dd'
            });

            $("#leaveEndDate").datepicker({
                dateFormat: 'yy-mm-dd'
            });
        });

        function displayMessage(message) {
            alert(message);
        }
    </script>
</head>
<body>
    <h2 class="welcome-doctor">Welcome ${loggedInDoctor.fullName}</h2>

    <h3>Patients Assigned to You:</h3>
    <table border="1">
        <tr>
            <th>Patient Name</th>
            <th>Age</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Appointment Date</th>
            <th>Appointment Time</th>
        </tr>
        <c:forEach items="${patients}" var="patient">
            <c:if test="${patient.doctor.id == loggedInDoctor.id}">
                <tr>
                    <td>${patient.patientName}</td>
                    <td>${patient.age}</td>
                    <td>${patient.address}</td>
                    <td>${patient.phoneNumber}</td>
                    <td>${patient.appointmentDate}</td>
                    <td>${patient.appointmentTime}</td>
                </tr>
            </c:if>
        </c:forEach>
    </table>

    <h3>Leave Request</h3>
    <form method="post" action="/doctor/request-leave">
        <div>
            <label for="leaveStartDate">From Date:</label>
            <input type="text" id="leaveStartDate" name="leaveStartDate" required>
        </div>
        <div>
            <label for="leaveEndDate">To Date:</label>
            <input type="text" id="leaveEndDate" name="leaveEndDate" required>
        </div>
        <button type="submit" onclick="displayMessage('Leave request applied successfully.');">Request Leave</button>
    </form>

    <h3>Cancel Appointment</h3>
    <form method="post" action="/doctor/cancel-leave">
        <button type="submit" onclick="displayMessage('Appointment cancelled successfully.');">Cancel Appointment</button>
    </form>

    <a href="/login">Logout</a>

</body>
</html>
