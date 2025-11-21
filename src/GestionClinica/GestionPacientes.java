
package GestionClinica;

import Clinica.Paciente;
 
import Clinica.Paciente;

public class GestionPacientes {
    private Paciente[] pacientes;
    private int cantidad;

    public GestionPacientes() {
        this.pacientes = new Paciente[100];
        this.cantidad = 0;
    }
    
    public boolean agregar(Paciente paciente) {
        if (cantidad < pacientes.length) {
            pacientes[cantidad] = paciente;
            cantidad++;
            return true;
        }
        return false;
    }
    
   public boolean modificar(String dni, Paciente nuevoPaciente) {
        for (int i = 0; i < cantidad; i++) {
            if (pacientes[i].getDni().equals(dni)) {
                pacientes[i] = nuevoPaciente;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String dni) {
    for (int i = 0; i < cantidad; i++) {
        if (pacientes[i].getDni().equals(dni)) {
            for (int j = i; j < cantidad - 1; j++) {
                pacientes[j] = pacientes[j + 1];
            }
            pacientes[cantidad - 1] = null;
            cantidad--;
            return true;
        }
    }
    return false;
}
    
    public void ver() {
        System.out.println("=== LISTA DE PACIENTES ===");
        System.out.println("Total de pacientes: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            Paciente paciente = pacientes[i];
            System.out.println((i+1) + ". " + paciente.getNombres() + " " + paciente.getApellidos() + 
                             " - DNI: " + paciente.getDni() + " - Tel: " + paciente.getTelefono());
        }
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    
}

