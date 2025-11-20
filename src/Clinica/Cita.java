
package Clinica;

public class Cita {
    private String fechaHora;
    private String estado;
    private String motivo;
    private Consultorio consultorio;
    private Medico medico;
    private Paciente paciente;

    public Cita(String fechaHora, String estado, String motivo, 
                Consultorio consultorio, Medico medico, Paciente paciente) {
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.motivo = motivo;
        this.consultorio = consultorio;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    public void confirmaCita() {
        this.estado = "Confirmada";
        System.out.println("Cita confirmada para: " + fechaHora);
    }
    
    public void modificarCita() {
        System.out.println("Cita modificada");
    }
    
    public void cancelarCita() {
        this.estado = "Cancelada";
        System.out.println("Cita cancelada");
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
