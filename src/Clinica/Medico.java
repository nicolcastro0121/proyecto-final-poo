
package Clinica;
public class Medico extends Empleado {
    private String especialidad;

    public Medico(String especialidad, String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado);
        this.especialidad = especialidad;
    }
    
    @Override
    public boolean login() {
        System.out.println("Médico " + nombre + " ha iniciado sesión");
        return true;
    }

    @Override
    public void salir() {
        System.out.println("Médico " + nombre + " ha cerrado sesión");
    }
    
    public void gestionarConsulta() {
        System.out.println("Médico gestionando consulta...");
    }
    
    public String crearReceta() {
        return "Receta creada por Dr. " + nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }



    
}
