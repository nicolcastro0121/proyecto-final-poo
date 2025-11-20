
package Clinica;

public class Recepcionista extends Empleado {
    public Recepcionista(String id, String usuario, String password, String estado,
                        String dni, String nombre, String apellido, String direccion,
                        String telf, String email) {
        super(id, usuario, password, estado, dni, nombre, apellido, direccion, telf, email);
    }

    @Override
    public boolean login() {
        System.out.println("Recepcionista " + nombre + " ha iniciado sesión");
        return true;
    }

    @Override
    public void salir() {
        System.out.println("Recepcionista " + nombre + " ha cerrado sesión");
    }
    
    public void crearCita() {
        System.out.println("Cita creada por recepcionista");
    }
    
    public void modificarCita() {
        System.out.println("Cita modificada por recepcionista");
    }
}