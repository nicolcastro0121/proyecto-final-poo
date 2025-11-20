
package Clinica;

public class Medicamento {
    private double dosis;
    private int frecuencia;
    private int duracion;
    private String nombre;
    private String marca;

    public Medicamento(double dosis, int frecuencia, int duracion, String nombre, String marca) {
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
        this.nombre = nombre;
        this.marca = marca;
    }
    

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
