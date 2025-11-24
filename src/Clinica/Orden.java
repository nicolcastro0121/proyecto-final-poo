
package Clinica;

public class Orden {
    private String nombre;
    private String descripcion;
    private double precio;
    private String estado; 
    private String resultado;
    private Paciente paciente;

    public Orden(String nombre, String descripcion, double precio, Paciente paciente) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = "Pendiente";
        this.resultado = "";
        this.paciente = paciente;
    }

    public void ActualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    
    public void RegistrarResultado(String resultado) {
        this.resultado = resultado;
        this.estado = "Con resultado";
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    

    
    
    
}
