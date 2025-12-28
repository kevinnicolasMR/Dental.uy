package logica;

import jakarta.persistence.Entity;
import java.util.Date;

@Entity
public class Responsable extends Persona {
    //private int id_responsable;
    private String tipoResposabilidad;

    public Responsable() {
    }

    public Responsable(String tipoResposabilidad, int id, String nombre, String apellido, int telefono, String direccion, Date fecha_nac) {
        super(id, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipoResposabilidad = tipoResposabilidad;
    }

    

   
    public String getTipoResposabilidad() {
        return tipoResposabilidad;
    }

   

    public void setTipoResposabilidad(String tipoResposabilidad) {
        this.tipoResposabilidad = tipoResposabilidad;
    }
    
    
}
