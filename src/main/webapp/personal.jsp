<%@page import="jakarta.servlet.http.Cookie"%>
<%@page import="jakarta.servlet.http.HttpServletRequest"%>
<%@page import="Model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        
        .container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        
        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        
        label {
            font-weight: bold;
            margin-top: 10px;
            display: block;
            color: #555;
        }
        
        input[type="text"], input[type="email"], input[type="password"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
        
        .errorMessage {
            color: red;
            text-align: center;
        }
    </style>
</head>
<body>



<div class="container">
    <h2>Edit Profile</h2>
    
<form action="update" method="post">
      <label for="Id">Enter your ID:</label>
    <input type="text" name="id" value="${user.id}"> <!-- Hidden field for user ID -->

    <label for="customerName">Name:</label>
    <input type="text" id="customerName" name="customerName" required>

    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required>

    <label for="phoneNumber">Phone Number:</label>
    <input type="text" id="phoneNumber" name="phoneNumber" required>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" required>

    <input type="submit" value="Update">
</form>
</div>

</body>
</html>
