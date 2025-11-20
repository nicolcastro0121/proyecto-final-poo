
package Clinica;

public class Administrador extends Empleado{

    public Administrador(String dni, String nombre, String apellido, String telf, String email, String id, String usuario, String password, String estado) {
        super(dni, nombre, apellido, telf, email, id, usuario, password, estado);
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
    
    public String generarReportes() {
        return "Reporte generado por administrador " + nombre;
    }
}
