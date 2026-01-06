<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <%@ include file="componentes/head.jsp"%>
    <body id="page-top">
        <div id="wrapper">
            <%@ include file="componentes/sidebar.jsp"%>
            <div id="content-wrapper" class="d-flex flex-column">
                <div id="content">

                    <%@ include file="componentes/toopBar.jsp"%>

                    <h1>Dar de alta un nuevo Usuario</h1>


                    <form class="user" action="SvUsuarios" method="POST">
                        <div class="form-group col">
                            <div class="col-sm-6 mb-3 ">
                                <input type="text" class="form-control form-control-user" id="nombreusu"
                                       placeholder="Nombre Usuario" name="nombreusu">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="password" class="form-control form-control-user" id="contrasenia"
                                       placeholder="Contraseña" name="contrasenia">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="rol"
                                       placeholder="Rol" name="rol">
                            </div>
                        </div>

                        <button class="btn btn-primary btn-user ml-3" type="submit">
                            Registrar nuevo Usuario
                        </button>

                    </form>

                </div>
            </div>
            <%@ include file="componentes/modal.jsp"%>
            <%@ include file="componentes/boostrapCoreJsp.jsp"%>
    </body>
</html>