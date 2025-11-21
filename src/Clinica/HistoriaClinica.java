
package Clinica;

public class HistoriaClinica {
    private Consulta[] consultas;
    private int cantidad;
    private Paciente paciente;
    
    public HistoriaClinica(Paciente paciente) {
        this.consultas = new Consulta[100];
        this.cantidad = 0;
        this.paciente = paciente;
    }

    HistoriaClinica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public void agregar(Consulta consulta) {
        if (cantidad < consultas.length) {
            consultas[cantidad] = consulta;
            cantidad++;
            System.out.println("Consulta agregada a historia clínica de: " + paciente.getNombres());
        } else {
            System.out.println("No hay espacio para más consultas");
        }
    }
    
    public void modificar(int indice, Consulta nuevaConsulta) {
        if (indice >= 0 && indice < cantidad) {
            consultas[indice] = nuevaConsulta;
            System.out.println("Consulta modificada en historia clínica en posición: " + indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public void eliminar(int indice) {
        if (indice >= 0 && indice < cantidad) {
            System.out.println("Consulta eliminada de historia clínica: " + consultas[indice].getMotivo());
            for (int i = indice; i < cantidad - 1; i++) {
                consultas[i] = consultas[i + 1];
            }
            consultas[cantidad - 1] = null;
            cantidad--;
            } else {
                System.out.println("Índice inválido");
            }
    }
    
    public void ver() {
        System.out.println("=== HISTORIA CLÍNICA DE: " + paciente.getNombres() + " " + paciente.getApellidos() + " ===");
        System.out.println("DNI: " + paciente.getDni());
        System.out.println("Total de consultas: " + cantidad);
        
        for (int i = 0; i < cantidad; i++) {
            Consulta consulta = consultas[i];
            System.out.println("\n--- Consulta " + (i + 1) + " ---");
            System.out.println("Fecha: " + consulta.getCita().getFechaHora());
            System.out.println("Médico: " + consulta.getCita().getMedico().getNombre());
            System.out.println("Motivo: " + consulta.getMotivo());
            System.out.println("Diagnóstico: " + consulta.getDiagnosticos());
            System.out.println("Estado: " + consulta.getEstado());
        }
    }
}


