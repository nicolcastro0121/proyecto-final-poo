
package Clinica;

import GestionClinica.GestionConsultorio;

public class Administrador extends Empleado{

    public Administrador(String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado);
    }

    


    @Override
    public boolean login() {
        System.out.println("Administrador " + nombre + " ha iniciado sesión");
        return true;
    }

    @Override
    public void salir() {
        System.out.println("Administrador " + nombre + " ha cerrado sesión");
    }
    
    public void generarReportes() {

        GestionConsultorio reporteConsultorios = new GestionConsultorio();
        System.out.println(reporteConsultorios.generarReporteDetallado());
    }
}
