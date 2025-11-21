
package Clinica;
import GestionClinica.GestionFactura;
import GestionClinica.GestionConsulta;
import java.util.Random;

public class Cajero extends Empleado {
    private GestionFactura gestionFactura;
    private GestionConsulta gestionConsulta;

    public Cajero(GestionFactura gestionFactura, GestionConsulta gestionConsulta, String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado);
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
        
        System.out.println("=== COMPROBANTE DE PAGO ===");
        System.out.println("Factura Nº: " + numeroFactura);
        System.out.println("Paciente: " + consulta.getCita().getPaciente().getNombres() + 
                          " " + consulta.getCita().getPaciente().getApellidos());
        System.out.println("Motivo: " + consulta.getMotivo());
        System.out.println("Total: $" + total);
        System.out.println("============================");
    }

    @Override
    public boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    

    
    
}
