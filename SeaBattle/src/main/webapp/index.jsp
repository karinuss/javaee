<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>SeaBattle</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
        <script type="text/javascript" src="js/battleService.js"></script>
	<%-- <link rel="shortcut icon" type="image/png" href="/favicon.png"/>--%>
</head>
<body>
<div class="game">
    <p class="header">Welcome to SeaBattle!</p>
    <div style="width: 100%">
        <div class="game_field" id="user">user</div>
        <div class="game_field" id="computer">computer</div>
        <div style="clear: both;"></div>
    </div>
    <div class="buttons">
        <label for="x">X: </label><input type="text" value="1" name="x" id="x">
        <label for="y">Y: </label><input type="text" value="1" name="y" id="y">
        <input type="button" value="Fire!" name="fire" id="fire">
    </div>
    <br>
    <div class="buttons">
        <input type="button" value="New game" name="new_game">
    </div>
</div>
</body>
</html>