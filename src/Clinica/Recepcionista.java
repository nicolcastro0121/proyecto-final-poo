
package Clinica;

public class Recepcionista extends Empleado {

    public Recepcionista(String dni, String nombres, String apellidos, String telf, String email, String userName, String password, Empleado empleado, String Rol) {
        super(dni, nombres, apellidos, telf, email, userName, password, empleado, Rol);
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