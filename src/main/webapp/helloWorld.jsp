<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld testing page</title>
</head>
<body>

    <h1>Congrats! You have finally done something correctly.</h1>
    <h2><%= request.getAttribute("model") %></h2>

</body>
</html>