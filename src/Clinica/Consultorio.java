package Clinica;


public class Consultorio {
    private String codigo;
    private String especialidad;
    private String estado;
    private Cita[] citas;
    private Medico medicoAsignado;
    private String[] horariosAsignados;
    
    public Consultorio(String codigo, String especialidad, String estado) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;
        this.citas = citas;
        
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
    
    public String getHorariosParaTabla() {
        if (horariosAsignados == null || horariosAsignados.length == 0) {
            return "Sin configurar";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < horariosAsignados.length; i++) {
            sb.append(horariosAsignados[i]);
            if (i < horariosAsignados.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
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

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public String[] getHorariosAsignados() {
        return horariosAsignados;
    }

    public void setHorariosAsignados(String[] horariosAsignados) {
        this.horariosAsignados = horariosAsignados;
    }
    
    

}
