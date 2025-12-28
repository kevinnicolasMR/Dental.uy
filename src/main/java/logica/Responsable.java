package logica;

import java.util.Date;

public class Responsable extends Persona {
    private int id_responsable;
    private String tipoResposabilidad;

    public Responsable() {
    }

    public Responsable(int id_responsable, String tipoResposabilidad, String nombre, String apellido, int telefono, String direccion, Date fecha_nac) {
        super(nombre, apellido, telefono, direccion, fecha_nac);
        this.id_responsable = id_responsable;
        this.tipoResposabilidad = tipoResposabilidad;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public String getTipoResposabilidad() {
        return tipoResposabilidad;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public void setTipoResposabilidad(String tipoResposabilidad) {
        this.tipoResposabilidad = tipoResposabilidad;
    }
    
    
}
