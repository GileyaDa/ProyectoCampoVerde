<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Principal - Administrador</title>
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/stylep.css">
    </head>
    <body>
        <header>
            <div class="logo">
                <img src="../images/Logo.png" alt="Logo">
            </div>
            <nav>
                <ul>
                    <li><a href="administracion.jsp">Panel de Administraci�n</a></li>
                    <li><a href="inventario.jsp">Gesti�n de Inventario</a></li>
                    <li><a href="gestionUsuario.jsp">Gesti�n de Usuarios</a></li>
                    <li><a href="cerrarSesion.jsp">Cerrar Sesi�n</a></li>
                </ul>
            </nav>
        </header>

        <div class="container">
            <section class="section principal">
                <h2>Bienvenido, Administrador</h2>
            </section>
        </div>

        <footer>
            <div class="contacto">
                <p>Correo: correo@dominio.com</p>
            </div>
            <div class="contacto">
                <p>Tel�fono: +123456789</p>
            </div>
            <div class="contacto">
                <p>S�guenos en:</p>
                <a href="https://www.facebook.com/Grupo-Campo-Verde-248454588690184/"><img src="../images/Facebook.png" alt=""></a>
            </div>
        </footer>
    </body>
</html>