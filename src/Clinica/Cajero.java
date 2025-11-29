package Clinica;

import GestionClinica.GestionFactura;
import GestionClinica.GestionConsulta;
import java.util.Random;

public class Cajero extends Empleado {

    private GestionFactura gestionFactura;
    private GestionConsulta gestionConsulta;

    public Cajero(String dni, String nombres, String apellidos, String telf, String email, String pUserName, String pPassword, String pRol) {
        super(dni, nombres, apellidos, telf, email, pUserName, pPassword, pRol);
        this.gestionFactura = gestionFactura;
        this.gestionConsulta = gestionConsulta;
    }

    public double calcularTotal(Consulta consulta) {
        double total = consulta.getPrecio();

        for (int i = 0; i < consulta.getCantidadOrdenes(); i++) {
            Orden orden = consulta.getOrdenes()[i];
            if (orden != null) {
                total += orden.getPrecio();
            }
        }
       
        String nombrePac = (consulta.getCita().getPaciente() != null) ? consulta.getCita().getPaciente().getNombres() : "Desconocido";
        System.out.println("Total calculado: $" + total + " para paciente: " + nombrePac);
        
        return total;
    }

    public void generarComprobante(Consulta consulta) {
        Random rd = new Random();
        double total = calcularTotal(consulta);
        int numeroFactura = rd.nextInt(1000, 9999);

        Paciente pacienteReal = consulta.getCita().getPaciente();

        Factura factura = new Factura(numeroFactura,
                "Consulta médica y servicios asociados",
                total, pacienteReal); 

        gestionFactura.crearFactura(factura);
    }

}   