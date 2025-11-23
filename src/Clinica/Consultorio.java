
package Clinica;


public class Consultorio {
    private String codigo;
    private String especialidad;
    private String estado;
    private Cita[] citas;
    private String medicoAsignado;
    
    public Consultorio(String codigo, String especialidad, String estado, Cita[] citas, String medico) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;
        this.citas = citas;
        this.medicoAsignado = medico;
    }
    public void cambiarEstado() {
        if (estado.equalsIgnoreCase("Disponible")) {
            estado = "Ocupado";
        } else if (estado.equalsIgnoreCase("Ocupado")) {
            estado = "Mantenimiento";
        } else {
            estado = "Disponible";
        }
        System.out.println("Estado del consultorio " + codigo + " cambiado a: " + estado);
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cita[] getCitas() {
        return citas;
    }

    public void setCitas(Cita[] citas) {
        this.citas = citas;
    }
    public String getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(String medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

}
