package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import java.util.Date;


@Entity
public class Secretario extends Persona {
    //private int id_secretario;
    private String sector;
    @OneToOne
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario unUsuario, int id, String nombre, String apellido, int telefono, String direccion, Date fecha_nac) {
        super(id, nombre, apellido, telefono, direccion, fecha_nac);
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

   

    

    public String getSector() {
        return sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }


    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
    
}
