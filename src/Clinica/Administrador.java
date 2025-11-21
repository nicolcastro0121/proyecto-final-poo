
package Clinica;

import GestionClinica.GestionConsultorio;
import GestionClinica.GestionEmpleado;
import InterfacesClinica.Reporte;
public class Administrador extends Empleado{
     private GestionEmpleado gestionEmpleado;
     private GestionConsultorio gestionConsultorio;

    public Administrador(GestionEmpleado gestionEmpleado, GestionConsultorio gestionConsultorio, String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado, String Rol) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado, Rol);
        this.gestionEmpleado = gestionEmpleado;
        this.gestionConsultorio = gestionConsultorio;
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
