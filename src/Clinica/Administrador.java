
package Clinica;
import GestionClinica.GestionConsulta;
import GestionClinica.GestionConsultorio;
import GestionClinica.GestionEmpleado;
import InterfacesClinica.Reporte;

public class Administrador extends Empleado{
     private GestionEmpleado gestionEmpleado;
     private GestionConsultorio gestionConsultorio;
     private GestionConsulta gestionconsulta;

    public Administrador(String dni, String nombres, String apellidos, String telf, String email, String userName, String password, Empleado empleado, String Rol) {
        super(dni, nombres, apellidos, telf, email, userName, password, empleado, Rol);
        this.gestionConsultorio = gestionConsultorio;
        this.gestionEmpleado = gestionEmpleado;
        this.gestionconsulta =gestionconsulta;
    }

    
    
    public String generarReporteGeneral(int totalEmpleados, int totalConsultorios, int totalCitas, int totalFacturas) {
        return "=== REPORTE GENERAL ===\n" +
               "Total empleados: " + totalEmpleados + "\n" +
               "Total consultorios: " + totalConsultorios + "\n" +
               "Total citas: " + totalCitas + "\n" +
               "Total facturas: " + totalFacturas;
    }

    public void generarReporteOcupacion(String[] datosConsultorios) {
        System.out.println("=== OCUPACIÓN DE CONSULTORIOS ===");
        for (String dato : datosConsultorios) {
            System.out.println(dato);
        }
    }

    

}
