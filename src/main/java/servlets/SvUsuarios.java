package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import logica.ControladoraLogica;
import logica.Usuario;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    ControladoraLogica contLog = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios = contLog.getUsuario();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaUsuarios",listaUsuarios);
        
        
        System.out.println(listaUsuarios.get(0));
        response.sendRedirect("ver_usuarios.jsp");

    }
    
      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombreUsuario = request.getParameter("nombreusu");
        String contra = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
          
        contLog.crearUsuario(nombreUsuario,contra,rol);
        
        response.sendRedirect("index.jsp");
    }
    
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
