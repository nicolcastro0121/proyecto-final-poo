
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
    
     public boolean eliminarFactura(int idFactura) {
        for (int i = 0; i < cantidad; i++) {
            if (facturas[i].getNumero() == idFactura) {
                for (int j = i; j < cantidad - 1; j++) {
                    facturas[j] = facturas[j + 1];
                }
                facturas[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
