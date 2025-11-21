
package Clinica;
public class Medico extends Empleado {
    private String especialidad;

    public Medico(String especialidad, String dni, String nombre, String apellido, String direccion, String telf, String email, String id, String usuario, String password, String estado, String Rol) {
        super(dni, nombre, apellido, direccion, telf, email, id, usuario, password, estado, Rol);
        this.especialidad = especialidad;
    }
    
    public Consulta abrirConsulta(Cita cita, String motivo, String antecedentes) {
        Consulta consulta = new Consulta(motivo, 50.0, "Abierta", antecedentes, 
                                        "", "", "", new Receta(), new Orden[10], 0, "", cita);
        cita.setEstado("En atención");
        System.out.println("Consulta abierta para: " + cita.getPaciente().getNombres());
        return consulta;
    }
    
    public void cerrarConsulta(Consulta consulta, String diagnostico, String plan) {
        consulta.setDiagnosticos(diagnostico);
        consulta.setPlan(plan);
        consulta.setEstado("Cerrada");
        consulta.getCita().setEstado("Atendida");
        System.out.println("Consulta cerrada - Diagnóstico: " + diagnostico);
    }
    
    public void emitirReceta(Consulta consulta, Receta receta) {
        consulta.setReceta(receta);
        System.out.println("Receta emitida para: " + consulta.getCita().getPaciente().getNombres());
        receta.ver();
    }
    
    public void agregarOrden(Consulta consulta, Orden orden) {
        consulta.agregarOrden(orden);
        System.out.println("Orden médica agregada: " + orden.getNombre());
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
