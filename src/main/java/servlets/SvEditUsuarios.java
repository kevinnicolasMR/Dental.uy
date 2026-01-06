package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Usuario;


@WebServlet(name = "SvEditUsuarios", urlPatterns = {"/SvEditUsuarios"})
public class SvEditUsuarios extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Usuario usu = control.traerUsuario(id);
        
        HttpSession mysession = request.getSession();
        mysession.setAttribute("usuEditar",usu);
       
        response.sendRedirect("editar_usuario.jsp"); 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsu = request.getParameter("nombreusu");
        String contraseniaUsu = request.getParameter("contrasenia");
        String rolUsu = request.getParameter("rol");
        Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");

        usu.setNombreUsuario(nombreUsu);
        usu.setContra(contraseniaUsu);
        usu.setRol(rolUsu);
        
        try {
            control.editarUsuario(usu);
        } catch (Exception ex) {
            System.getLogger(SvEditUsuarios.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        response.sendRedirect("SvUsuarios");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
