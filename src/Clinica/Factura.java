
package Clinica;

public class Factura {
    private int numero;
    private String descripcion;
    private double monto;

    public Factura(int numero, String descripcion, double monto) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    public void emitirFactura(){
        System.out.println("\nFactura emitida:" + this.numero + "\nDescripcion:" + this.descripcion + "\nMonto: " + this.monto);
    }
}
