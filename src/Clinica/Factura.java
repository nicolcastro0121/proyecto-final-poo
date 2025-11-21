
package Clinica;

public class Factura {
    private int numero;
    private String descripcion;

    public Factura(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
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
    
    public void emitirFactura(){
        System.out.println("Factura emitida:" + this.numero + "Descripcion:" + this.descripcion);
    }
}
