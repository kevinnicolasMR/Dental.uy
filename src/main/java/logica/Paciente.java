package logica;

import jakarta.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Paciente extends Persona {
    
    //private int id_paciente; 
    private boolean tiene_OS;
    private String tipoSanfre;
    private Responsable unResponsable;
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(boolean tiene_OS, String tipoSanfre, Responsable unResponsable, List<Turno> listaTurnos, int id, String nombre, String apellido, int telefono, String direccion, Date fecha_nac) {
        super(id, nombre, apellido, telefono, direccion, fecha_nac);
        this.tiene_OS = tiene_OS;
        this.tipoSanfre = tipoSanfre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

 

   

    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public String getTipoSanfre() {
        return tipoSanfre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

  

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public void setTipoSanfre(String tipoSanfre) {
        this.tipoSanfre = tipoSanfre;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    
    
    
}
