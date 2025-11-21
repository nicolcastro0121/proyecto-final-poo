
package Clinica;

import GestionClinica.GestionConsultorio;
import GestionClinica.GestionEmpleado;
import InterfacesClinica.Reporte;
public class Administrador extends Empleado implements Reporte{
     private GestionEmpleado gestionEmpleado;
     private GestionConsultorio gestionConsultorio;

    public Administrador(String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado);
        
    }
    
    public void generarReportes() {

        GestionConsultorio reporteConsultorios = new GestionConsultorio();
        System.out.println(reporteConsultorios.generarReporteDetallado());
    }

    @Override
    public String generarReporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String generarReporteDetallado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] obtenerDatosReporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
