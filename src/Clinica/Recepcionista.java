
package Clinica;

public class Recepcionista extends Empleado {

    public Recepcionista(String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado);
    }
    
    
    
    public void crearCita() {
        System.out.println("Cita creada por recepcionista");
    }
    
    public void modificarCita() {
        System.out.println("Cita modificada por recepcionista");
    }
}