package GestionClinica;

import Clinica.Cita;

public class GestionCita {
    private Cita[] citas;
    private int cantidad;
    
    public GestionCita() {
        this.citas = new Cita[200]; 
        this.cantidad = 0;
    }
    
    public boolean agregar(Cita cita) {
        if (cantidad < citas.length) {
            citas[cantidad] = cita;
            cantidad++;
            return true;
        }
        return false;
    }
    
     public boolean modificar(int posicioncita, Cita nuevaCita) {
        if (posicioncita >= 0 && posicioncita < cantidad) {
            citas[posicioncita] = nuevaCita;
            return true;
        }
        return false;
    }
     
     public boolean eliminar(int indice) {
        if (indice >= 0 && indice < cantidad) {
            for (int i = indice; i < cantidad - 1; i++) {
                citas[i] = citas[i + 1];
            }   
            citas[cantidad - 1] = null;
            cantidad--;
            return true;
        }
        return false;
    }
     
     public void ver() {
        System.out.println("LISTA DE CITAS");
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
     
    public Cita buscar(int posicionconsulta) {
        if (posicionconsulta >= 0 && posicionconsulta < cantidad) {
            return citas[posicionconsulta];
        }
        return null;
    } 
}
