
package Clinica;

import InterfacesClinica.Validable;

public class Cita implements Validable{
    private String fechaHora;
    private String modalidad;
    private String estado;
    private Paciente paciente;
    private Medico medico;
    private Consultorio consultorio;

    public Cita(String fechaHora, String modalidad, String estado, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.fechaHora = fechaHora;
        this.modalidad = modalidad;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }
    
    public void confirmar() {
        this.estado = "Confirmada";
        System.out.println("Cita confirmada para: " + fechaHora);
    }
    
    public void cancelar() {
        this.estado = "Cancelada";
        System.out.println("Cita cancelada");
    }
    
    public void marcarEnSala() {
        this.estado = "En sala";
        System.out.println("Paciente en sala: " + paciente.getNombres());
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public boolean validar() {
        return true; //FALTA!!!
    }

    @Override
    public String[] obtenerErrores() {
        return new String[0];
    }

    @Override
    public boolean esValido() {
        return validar();
    }
    
    
}
