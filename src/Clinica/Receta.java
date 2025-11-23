package Clinica;
import InterfacesClinica.Imprimible; 


public class Receta {

    private Medicamento[] medicamentos;
    private int cantidad;

    public Receta() {
        this.medicamentos = new Medicamento[10];
        this.cantidad = 0;
    }
    public String getContenido() {
        String texto = ""; // Empezamos con el texto vacío
        
        for (int i = 0; i < cantidad; i++) {
            Medicamento m = medicamentos[i];
            
            // Vamos pegando (concatenando) la información línea por línea
            texto = texto + "- " + m.getNombre() + " (" + m.getMarca() + ") | ";
            texto = texto + "Dosis: " + m.getDosis() + " mg | ";
            texto = texto + "Cada: " + m.getFrecuencia() + " hrs | ";
            texto = texto + "Por: " + m.getDuracion() + " días";
            
            
            texto = texto + "\n"; 
        }
        
        return texto; 
    }

    public void agregarMedicamento(Medicamento medicamento) {
        if (cantidad < medicamentos.length) {
            medicamentos[cantidad] = medicamento;
            cantidad++;
            System.out.println("Medicamento agregado: " + medicamento.getNombre());
        } else {
            System.out.println("No se pueden agregar más medicamentos");
        }
    }
    
    public void eliminar(int posicion) {
        if (posicion >= 0 && posicion < cantidad) {
            System.out.println("Medicamento eliminado: " + medicamentos[posicion].getNombre());
            for (int i = posicion; i < cantidad - 1; i++) {
                medicamentos[i] = medicamentos[i + 1];
            }
            medicamentos[cantidad - 1] = null;
            cantidad--;
        } else {
            System.out.println("Posición inválida");
        }
    }
    public void modificar(int posicion, Medicamento nuevoMedicamento) {
        if (posicion >= 0 && posicion < cantidad) {
            medicamentos[posicion] = nuevoMedicamento;
            System.out.println("Medicamento modificado en posición: " + posicion);
        } else {
            System.out.println("Posición inválida");
        }
    }
     public void ver() {
        System.out.println("=== RECETA MÉDICA ===");
        System.out.println("Cantidad de medicamentos: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            Medicamento med = medicamentos[i];
            System.out.println((i+1) + ". " + med.getNombre() + 
                             " - " + med.getMarca() +
                             " - Dosis: " + med.getDosis() +
                             " - Frecuencia: " + med.getFrecuencia() + " veces/día" +
                             " - Duración: " + med.getDuracion() + " días");
        }
    }

     
     
    public Medicamento[] getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamento[] medicamentos) {
        this.medicamentos = medicamentos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
     
     
}
