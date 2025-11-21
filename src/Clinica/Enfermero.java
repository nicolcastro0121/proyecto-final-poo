/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica;

/**
 *
 * @author Nicol
 */
public class Enfermero extends Empleado{

    public Enfermero(String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado);
    }
    
    public void admitirPaciente(Cita cita) {
        if (cita != null) {
            cita.marcarEnSala();
            System.out.println("Paciente " + cita.getPaciente().getNombres() + 
                             " admitido en consultorio: " + cita.getConsultorio().getCodigo());
        } else {
            System.out.println("Error: Cita no válida para admisión");
        }
    }
    
    public void darAltaPaciente(Consulta consulta) {
        if (consulta != null && "Cerrada".equals(consulta.getEstado())) {
            System.out.println("Paciente " + consulta.getCita().getPaciente().getNombres() + 
                             " dado de alta. Recetas y órdenes entregadas.");
            
   
            consulta.getCita().setEstado("Completada");
        } else {
            System.out.println("Error: La consulta no está cerrada o no es válida");
        }
    }
    

    public void registrarSignosVitales(Consulta consulta, String signosVitales) {
        if (consulta != null) {
            consulta.setSignosVitales(signosVitales);
            System.out.println("Signos vitales registrados para paciente: " + 
                             consulta.getCita().getPaciente().getNombres());
        } else {
            System.out.println("Error: Consulta no válida");
        }
    }
    
   public void ejecutarOrden(Orden orden) {
        if (orden != null) {
            orden.ActualizarEstado("En proceso");
            System.out.println("Orden en proceso: " + orden.getNombre() + 
                             " - Tipo: " + orden.getDescripcion()); 
        } else {
            System.out.println("Error: Orden no válida");
        }
    }

    public void registrarResultadoOrden(Orden orden, String resultado) {
        if (orden != null) {
            orden.RegistrarResultado(resultado);
            System.out.println("Resultado registrado para orden: " + orden.getNombre());
        } else {
            System.out.println("Error: Orden no válida");
        }
    }

    @Override
    public boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    
}
