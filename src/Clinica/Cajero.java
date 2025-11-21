
package Clinica;
import GestionClinica.GestionFactura;
import GestionClinica.GestionConsulta;
import InterfacesClinica.Imprimible;
import java.util.Random;

public class Cajero extends Empleado implements Imprimible{
    private GestionFactura gestionFactura;
    private GestionConsulta gestionConsulta;

    public Cajero(String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado);
        
    }
    

    
    
    public double calcularTotal(Consulta consulta) {
        double total = consulta.getPrecio();
        
        for (int i = 0; i < consulta.getCantidadOrdenes(); i++) {
            Orden orden = consulta.getOrdenes()[i];
            if (orden != null) {
                total += orden.getPrecio();
            }
        }
        
        System.out.println("Total calculado: $" + total + " para paciente: " + 
                          consulta.getCita().getPaciente().getNombres());
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
        factura.imprimir();
        
    }

    @Override
    public String generarDocumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void imprimir() {
        
    }

    
    

    
    
}
