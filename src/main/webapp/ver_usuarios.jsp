<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <%@ include file="componentes/head.jsp"%>
    <body id="page-top">
        <div id="wrapper">
            <%@ include file="componentes/sidebar.jsp"%>
            <div id="content-wrapper" class="d-flex flex-column">
                <div id="content">

                    <%@ include file="componentes/toopBar.jsp"%>

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <h1 class="h3 mb-2 text-gray-800">Ver usuarios disponibles</h1>
                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <h6 class="m-0 font-weight-bold text-primary">Datos de usuarios</h6>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>Nombre del usuario</th>
                                                <th>Contra</th>
                                                <th>Rol</th>
                                                <th style="width:110px"> Accion</th>
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                                <th>ID</th>
                                                <th>Nombre del usuario</th>
                                                <th>Contra</th>
                                                <th>Rol</th>
                                                <th style="width:110px"> Accion</th>
                                            </tr>
                                        </tfoot>
                                        <%
                                            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                                        %>
                                        <tbody>
                                            <% for (Usuario usu : listaUsuarios) {%>
                                            <tr>
                                                <td><%=usu.getId_ususario()%></td>
                                                <td><%=usu.getNombreUsuario()%></td>
                                                <td><%=usu.getContra()%></td>
                                                <td><%=usu.getRol()%></td>
                                                <td style="display: flex; width: 130px;">
                                                    <form name="eliminar" action="SvElimUsuarios" method="POST"> 
                                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right: 5px;">
                                                            <i class="fas fa-trash-alt"></i>
                                                        </button>
                                                        <input type="hidden" name="id" value="<%=usu.getId_ususario()%>"> 
                                                    </form>

                                                    <form name="editar" action="SvEditUsuarios" method="GET"> 
                                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left: 5px;">
                                                            <i class="fas fa-pencil-alt"></i>
                                                        </button>
                                                        <input type="hidden" name="id" value="<%=usu.getId_ususario()%>"> 
                                                    </form>
                                                </td>

                                                <%}%>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /.container-fluid -->

                </div>
            </div>

            <%@ include file="componentes/modal.jsp"%>
            <%@ include file="componentes/boostrapCoreJsp.jsp"%>
            <!-- Bootstrap core JavaScript-->
            <script src="vendor/jquery/jquery.min.js"></script>
            <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

            <!-- Core plugin JavaScript-->
            <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

            <!-- Custom scripts for all pages-->
            <script src="js/sb-admin-2.min.js"></script>

            <!-- Page level plugins -->
            <script src="vendor/datatables/jquery.dataTables.min.js"></script>
            <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

            <!-- Page level custom scripts -->
            <script src="js/demo/datatables-demo.js"></script>
    </body>
</html>