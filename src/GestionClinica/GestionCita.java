package GestionClinica;

import Clinica.Cita;

public class GestionCita {
    private Cita[] citas;
    private int cantidad;
    
    public GestionCita() {
        this.citas = new Cita[200]; // preguntar en claseee
        this.cantidad = 0;
    }
    
    public void agregar(Cita cita) {
        if (cantidad < citas.length) {
            citas[cantidad] = cita;
            cantidad++;
            System.out.println("Cita agregada para: " + cita.getPaciente().getNombres());
        } else {
            System.out.println("No hay espacio para más citas en el sistema");
        }
    }
    
     public void modificar(int indice, Cita nuevaCita) {
        if (indice >= 0 && indice < cantidad) {
            citas[indice] = nuevaCita;
            System.out.println("Cita modificada en posición: " + indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
     
     public void eliminar(int index) {
        if (index >= 0 && index < cantidad) {
            System.out.println("Cita eliminada: " + citas[index].getPaciente().getNombres());
            for (int i = index; i < cantidad - 1; i++) {
                citas[i] = citas[i + 1];
            }
            citas[cantidad - 1] = null;
            cantidad--;
        } else {
            System.out.println("Índice inválido");
        }
    }
     
     public void ver() {
        System.out.println("=== LISTA DE CITAS ===");
        System.out.println("Total de citas: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            Cita cita = citas[i];
            System.out.println((i+1) + ". " + cita.getPaciente().getNombres() + 
                             " - " + cita.getFechaHora() + 
                             " - " + cita.getEstado());
        }
    }

    public Cita[] getCitas() {
        return citas;
    }

    public int getCantidad() {
        return cantidad;
    }
     
     
}
