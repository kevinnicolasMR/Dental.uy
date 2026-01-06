package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraLogica {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(String nombreUsuario, String contra, String rol){
           
    Usuario usu = new Usuario();
    usu.setNombreUsuario(nombreUsuario);
    usu.setContra(contra);
    usu.setRol(rol);
    
    controlPersis.crearUsuario(usu); 
    }
    
    //------------------Validar el Ingreso-------------------------

    public boolean validarIngreso(String usuario, String pass) {
        boolean ingreso = false;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPersis.getUsuarios();
        
        for(Usuario usu: listaUsuarios){
           if(usu.getNombreUsuario().equals(usuario)){
              if(usu.getContra().equals(pass)){
                  ingreso = true;
              }else{
                  ingreso = false;
              }
             
           }
        }
        return ingreso;
    }
   
    //--------------------------------------------------------------
    
    public List<Usuario> getUsuario(){
      return controlPersis.getUsuarios();
    }

    public void eliminarUsuario(int eliminarUsuario) throws NonexistentEntityException {
        controlPersis.eliminarUsuario(eliminarUsuario);
    }

    public Usuario traerUsuario(int id){
        return controlPersis.traerUsuario(id);
        
    }
    public void editarUsuario(Usuario usu) throws Exception {
        controlPersis.editarUsuario(usu);
    }

}
