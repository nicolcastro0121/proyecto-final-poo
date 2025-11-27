
package GestionClinica;

import Clinica.Factura;


public class GestionFactura {
    private Factura[] facturas;
    private int cantidad;

    public GestionFactura() {
        this.facturas = new Factura[200];
        this.cantidad = 0;
    }
    
    public boolean crearFactura(Factura factura) {
        if (cantidad < facturas.length) {
            facturas[cantidad] = factura;
            cantidad++;
            return true;
        }
        return false;
    }
    
     public boolean eliminarFactura(int indice) {
        if (indice < 0 || indice >= cantidad) {
            return false;
        }

        for (int j = indice; j < cantidad - 1; j++) {
            facturas[j] = facturas[j + 1];
        }

        facturas[cantidad - 1] = null;
        cantidad--;
        return true;
    }

    public Factura buscar(int posicionconsulta) {
        if (posicionconsulta >= 0 && posicionconsulta < cantidad) {
            return facturas[posicionconsulta];
        }
        return null;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
