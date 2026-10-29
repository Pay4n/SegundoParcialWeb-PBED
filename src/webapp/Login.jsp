<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Iniciar sesión</title>
</head>
<body>

    <h2>Iniciar sesión</h2>

    <form action="${pageContext.request.contextPath}/LoginServlet" method="post">

    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required>

<br><br>

    <label for="contrasena">Contraseña:</label>
    <input type="password" id="contrasena" name="contrasena" required>

<br><br>

<button type="submit">Iniciar sesión</button>

</form>

</body>
</html>