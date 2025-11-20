
package Clinica;


public class Consultorio {
    private String idconsul;
    private String nombre;
    private String estado;

    public Consultorio(String idconsul, String nombre, String estado) {
        this.idconsul = idconsul;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public void verificarEstado() {
        System.out.println("Consultorio " + nombre + " estado: " + estado);
    }

    public String getIdconsul() {
        return idconsul;
    }

    public void setIdconsul(String idconsul) {
        this.idconsul = idconsul;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
