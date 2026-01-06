package persistencia;

import java.util.ArrayList;
import java.util.List;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    public ControladoraPersistencia() {
    }
    
    //--------------------------------------------------------
    HorarioJpaController horarioJPA = new HorarioJpaController();
    //--------------------------------------------------------
    OdontologoJpaController odontologoJPA = new OdontologoJpaController();
    //--------------------------------------------------------
    PacienteJpaController pacienteJPA = new PacienteJpaController();
    //--------------------------------------------------------
    ResponsableJpaController resposableJPA = new ResponsableJpaController();
    //--------------------------------------------------------
    SecretarioJpaController secretarioJPA = new SecretarioJpaController();
    //--------------------------------------------------------
    TurnoJpaController turnoJPA = new TurnoJpaController();
    //--------------------------------------------------------
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    
    public void crearUsuario(Usuario usu) {
        usuarioJPA.create(usu);
    }
    public List<Usuario> getUsuarios() {
        return usuarioJPA.findUsuarioEntities();
    }
    public void eliminarUsuario(int eliminarUsuario) throws NonexistentEntityException {
        usuarioJPA.destroy(eliminarUsuario);
    }
      public Usuario traerUsuario(int id) {
        return usuarioJPA.findUsuario(id);
    }
      
    public void editarUsuario(Usuario usu) throws Exception {
         usuarioJPA.edit(usu);
    }
    
    //--------------------------------------------------------

    


    
    
    
}
