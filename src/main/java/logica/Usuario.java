
package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_ususario;
    private String nombreUsuario; 
    private String contra; 
    private String rol;

    public Usuario() {
    }

    public Usuario(int id_ususario, String nombreUsuario, String contra, String rol) {
        this.id_ususario = id_ususario;
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
        this.rol = rol;
    }

    public int getId_ususario() {
        return id_ususario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContra() {
        return contra;
    }

    public String getRol() {
        return rol;
    }

    public void setId_ususario(int id_ususario) {
        this.id_ususario = id_ususario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
