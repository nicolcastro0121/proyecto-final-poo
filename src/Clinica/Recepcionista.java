
package Clinica;

import GestionClinica.GestionPacientes;
import GestionClinica.GestionCita;
import GestionClinica.GestionFactura;
import GestionClinica.GestionConsulta;
import GestionClinica.GestionConsultorio;

public class Recepcionista extends Empleado {
    private GestionPacientes gestionPacientes;
    private GestionCita gestionCitas;
    private GestionFactura gestionFacturas;
    private GestionConsulta gestionConsultas;
    private GestionConsultorio gestionConsultorios;

    public Recepcionista(String dni, String nombres, String apellidos, String telf, String email, String pUserName, String pPassword, String pRol) {
        super(dni, nombres, apellidos, telf, email, pUserName, pPassword, pRol);
        this.gestionPacientes = gestionPacientes;
        this.gestionCitas = gestionCitas;
        this.gestionFacturas = gestionFacturas;
        this.gestionConsultas = gestionConsultas;
        this.gestionConsultorios = gestionConsultorios;
    }




    public void admitir(Cita cita) {
        cita.marcarEnSala();
        System.out.println("Paciente admitido: " + cita.getPaciente().getNombres());
    } 
    
    public void darAlta(Cita cita) {
        System.out.println("Paciente dado de alta: " + cita.getPaciente().getNombres());
    }
    
    public void agregarPaciente(Paciente paciente) {
        gestionPacientes.agregar(paciente);
    }
    
    public void modificarPaciente(String dni, Paciente pacienteModificado) {
        gestionPacientes.modificar(dni, pacienteModificado);
    }
    
    public void eliminarPaciente(String dni) {
        gestionPacientes.eliminar(dni);
    }
    
    public void crearCita(Paciente paciente, Medico medico, Consultorio consultorio, String fechaHora, String modalidad) {
        Cita nuevaCita = new Cita(fechaHora, modalidad, "Programada", paciente, medico, consultorio);
        gestionCitas.agregar(nuevaCita);
        System.out.println("Cita creada para: " + paciente.getNombres());
    }
    
    public void modificarCita(int indice, Cita citaModificada) {
        gestionCitas.modificar(indice, citaModificada);
    }
    
    public boolean validarDisponibilidadCita(Cita nuevaCita, Cita[] citasExistentes, int cantidadCitas) {
        for (int i = 0; i < cantidadCitas; i++) {
            Cita citaExistente = citasExistentes[i];
            if (citaExistente.getFechaHora().equals(nuevaCita.getFechaHora())) {
                if (citaExistente.getMedico().equals(nuevaCita.getMedico())) {
                    return false;
                }
                if (citaExistente.getConsultorio().equals(nuevaCita.getConsultorio())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void buscarCitasPorMedico(String nombreMedico, Cita[] citas, int cantidadCitas) {
        System.out.println("=== CITAS DEL MÉDICO: " + nombreMedico + " ===");
        for (int i = 0; i < cantidadCitas; i++) {
            if (citas[i].getMedico().getNombres().equalsIgnoreCase(nombreMedico)) {
                System.out.println("- " + citas[i].getFechaHora() + " - " + 
                                 citas[i].getPaciente().getNombres() + " - " + 
                                 citas[i].getEstado());
            }
        }
    }
    
    public void crearCita() {
        System.out.println("Cita creada por recepcionista");
    }
    
    public void modificarCita() {
        System.out.println("Cita modificada por recepcionista");
    }
}