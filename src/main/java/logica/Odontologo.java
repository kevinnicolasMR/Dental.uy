package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Odontologo extends Persona implements Serializable{
    //private int id_odontologo; 
    private String especialidad;
    @OneToMany(mappedBy="odonto")   
    private List<Turno> listaTurnos;
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario unUsuario, Horario unHorario, int id, String nombre, String apellido, int telefono, String direccion, Date fecha_nac) {
        super(id, nombre, apellido, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    

   

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }


    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
    
    
    
}
