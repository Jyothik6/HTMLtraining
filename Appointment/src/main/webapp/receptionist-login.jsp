<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Receptionist Login</title>

    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        h2 {
            background-color: #E91E63;
            color: #fff;
            text-align: center;
            padding: 15px 0;
            margin: 0;
        }

        form {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 400px;
            margin: 20px auto;
        }

        label {
            display: block;
            margin: 10px 0;
            color: #333;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"] {
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
    </style>
</head>
<body>
    <h2>Receptionist Login</h2>

    <form action="/receptionist/login" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="user" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="pass" required>
        </div>
        <div>
            <button type="submit">Login</button>
        </div>
    </form>
</body>
</html>
