<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Iniciar Sesi�n</title>
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
    </head>
    <body>
        <div class="container">
            <section class="main-content">
                <h1>Iniciar Sesi�n</h1>
                <form action="../ProcesarLogin" method="post">
                    <label for="nomUsuario">Nombre de usuario:</label>
                    <input type="text" id="nomUsuario" name="nomUsuario" required>
                    <label for="contrasena">Contrase�a:</label>
                    <input type="password" id="contrasena" name="contrasena" required>
                    <button type="submit">Iniciar Sesi�n</button>
                    <% if (request.getAttribute("error") != null) { %>
                    <div style="color: red;">
                        <p><%= request.getAttribute("error") %></p>
                    </div>
                    <% } %>
                </form>
            </section>
        </div>
    </body>
</html>