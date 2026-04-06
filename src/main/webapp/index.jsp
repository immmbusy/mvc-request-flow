<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>MVC Request Flow - Input</title>
</head>
<body>
<h1>User Information Form</h1>

<form action="process" method="post">
    <p>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
    </p>

    <p>
        <label for="favoriteFood">Favorite Food:</label>
        <input type="text" id="favoriteFood" name="favoriteFood" required>
    </p>

    <p>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>
    </p>

    <p>
        <button type="submit">Submit</button>
    </p>
</form>
</body>
</html>