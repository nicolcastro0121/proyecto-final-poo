
package Clinica;


public class Consultorio {
    private String codigo;
    private String especialidad;
    private String estado;
    private Cita[] citas;

    public Consultorio(String codigo, String especialidad, String estado, Cita[] citas) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;
        this.citas = new Cita[20];
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
    
    
    
    
}
