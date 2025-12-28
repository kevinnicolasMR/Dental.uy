package logica;

import java.util.Date;
import java.util.List;

public class Paciente extends Persona {
    
    private int id_paciente; 
    private boolean tiene_OS;
    private String tipoSanfre;
    private Responsable unResponsable;
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(int id_paciente, boolean tiene_OS, String tipoSanfre, Responsable unResponsable, List<Turno> listaTurnos, String nombre, String apellido, int telefono, String direccion, Date fecha_nac) {
        super(nombre, apellido, telefono, direccion, fecha_nac);
        this.id_paciente = id_paciente;
        this.tiene_OS = tiene_OS;
        this.tipoSanfre = tipoSanfre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    public int getId_paciente() {
        return id_paciente;
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

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
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
