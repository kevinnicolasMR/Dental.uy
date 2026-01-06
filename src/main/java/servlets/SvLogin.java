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

@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {
    
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("password");
        
        boolean validarIngreso = false;
        
        validarIngreso = control.validarIngreso(usuario,pass);
        
        if(validarIngreso == true){
        HttpSession mysession = request.getSession(true);
        mysession.setAttribute("usuario", usuario);
        response.sendRedirect("index.jsp");
        }else{
        response.sendRedirect("login_error.jsp");

        }
    }

   @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
