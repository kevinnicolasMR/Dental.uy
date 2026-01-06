<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <%@ include file="componentes/head.jsp"%>
    <body id="page-top">
        <div id="wrapper">
            <%@ include file="componentes/sidebar.jsp"%>
            <div id="content-wrapper" class="d-flex flex-column">
                <div id="content">

                    <%@ include file="componentes/toopBar.jsp"%>

                    <h1>Editar usuario</h1>

                    <%
                    Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");
                    %>
                    <form class="user" action="SvEditUsuarios" method="POST">
                        <div class="form-group col">
                            <div class="col-sm-6 mb-3 ">
                                <input type="text" class="form-control form-control-user" id="nombreusu"
                                       value="<%=usu.getNombreUsuario()%>" name="nombreusu">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="password" class="form-control form-control-user" id="contrasenia"
                                       value="<%=usu.getContra()%>" name="contrasenia">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="rol"
                                       value="<%=usu.getRol()%>" name="rol">
                            </div>
                        </div>

                        <button class="btn btn-primary btn-user ml-3" type="submit">
                            Editar al Usuario
                        </button>

                    </form>

                </div>
            </div>
            <%@ include file="componentes/modal.jsp"%>
            <%@ include file="componentes/boostrapCoreJsp.jsp"%>
    </body>
</html>