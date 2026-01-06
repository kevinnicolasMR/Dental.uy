<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <%@ include file="componentes/head.jsp"%>
    <body id="page-top">
        <div id="wrapper">
            <%@ include file="componentes/sidebar.jsp"%>
            <div id="content-wrapper" class="d-flex flex-column">
                <div id="content">

                    <%@ include file="componentes/toopBar.jsp"%>

                    <h1>Dar de alta un nuevo Odontologo</h1>


                    <form class="user">
                        <div class="form-group col">
                            <div class="col-sm-6 mb-3 ">
                                <input type="text" class="form-control form-control-user" id="cedula"
                                       placeholder="Cedula">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="nombre"
                                       placeholder="Nombre">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="apellido"
                                       placeholder="Apellido">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="telefono"
                                       placeholder="Teléfono">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="direccion"
                                       placeholder="Dirección">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="fecha-nacimiento"
                                       placeholder="Fecha de Nacimiento">
                            </div>
                            <hr>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="especialidad"
                                       placeholder="Especialidad">
                            </div>
                        </div>

                        <a href="index.jsp" class="btn btn-primary btn-user ml-3">
                            Registrar nuevo Odontologo
                        </a>

                    </form>

                </div>
            </div>
            <%@ include file="componentes/modal.jsp"%>
            <%@ include file="componentes/boostrapCoreJsp.jsp"%>
    </body>
</html>