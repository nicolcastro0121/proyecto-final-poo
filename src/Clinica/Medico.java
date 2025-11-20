
package Clinica;
public class Medico extends Empleado {
    
    private String especialidad;

    public Medico(String dni, String nombres, String apellidos, String telefono, String email,
                  String usuario, String password, 
                  String especialidad) { 
        super(dni, nombres, apellidos, telefono, email, usuario, password, "MEDICO");
            this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public String toString() {
        return super.toString() + " - " + especialidad;
    }
}
