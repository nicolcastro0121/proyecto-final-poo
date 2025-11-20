
package GestionClinica;

import Clinica.Consulta;

public class GestionConsulta {
    private Consulta[] consultas;
    private int cantidad;
    
    public GestionConsulta() {
        this.consultas = new Consulta[100];
        this.cantidad = 0;
    }
    
    public void agregar(Consulta consulta) {
        if (cantidad < consultas.length) {
            consultas[cantidad] = consulta;
            cantidad++;
            System.out.println("Consulta agregada para el paciente: " + consulta.getCita().getPaciente().getNombres());
        } else {
            System.out.println("No hay espacio para más consultas");
        }
    }
    
    public void modificar(int indice, Consulta nuevaConsulta) {
        if (indice >= 0 && indice < cantidad) {
            consultas[indice] = nuevaConsulta;
            System.out.println("Consulta modificada en posición: " + indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public Consulta buscar(int indice) {
        if (indice >= 0 && indice < cantidad) {
            System.out.println("Consulta encontrada: " + consultas[indice].getCita().getPaciente().getNombres());
            return consultas[indice];
        } else {
            System.out.println("Consulta no encontrada en el índice: " + indice);
            return null;
        }
    }

    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
