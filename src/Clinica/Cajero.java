package Clinica;
import InterfacesClinica.FacturarTotal;
import GestionClinica.GestionFactura;
import GestionClinica.GestionConsulta;
import InterfacesClinica.Imprimible;
import java.util.Random;

public class Cajero extends Empleado implements Imprimible {

    private GestionFactura gestionFactura;
    private GestionConsulta gestionConsulta;

    public Cajero(String dni, String nombres, String apellidos, String telf, String email, String pUserName, String pPassword, String pRol) {
        super(dni, nombres, apellidos, telf, email, pUserName, pPassword, pRol);
    }

    



    public double calcularTotal(Consulta consulta) {
        double total = consulta.getPrecio();

        for (int i = 0; i < consulta.getCantidadOrdenes(); i++) {
            Orden orden = consulta.getOrdenes()[i];
            if (orden != null) {
                total += orden.getPrecio();
            }
        }

        System.out.println("Total calculado: $" + total + " para paciente: "
                + consulta.getCita().getPaciente().getNombres());
        return total;
    }

    public void generarComprobante(Consulta consulta) {
        Random rd = new Random();
        double total = calcularTotal(consulta);
        int numeroFactura = rd.nextInt(1000, 9999);

        Factura factura = new Factura(numeroFactura,
                "Consulta médica y servicios asociados",
                total);

        gestionFactura.crearFactura(factura);
    }

    
     @Override
    public String generarDocumento() {
        Random rd = new Random();
        int numeroFactura = rd.nextInt(1000, 9999);
        double montoEjemplo = 150.0;
        
        // Si Factura espera int, String, double
        Factura factura = new Factura(numeroFactura,
                "Factura de servicios médicos",
                montoEjemplo);
        
        gestionFactura.crearFactura(factura);
        
        return "FACTURA #" + numeroFactura + 
               "\nDescripción: Factura de servicios médicos" +
               "\nMonto: $" + montoEjemplo +
               "\nEmitida por: " + getNombres() + " " + getApellidos();
    }

 
}
