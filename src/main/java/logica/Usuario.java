
package logica;

public class Usuario {
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
