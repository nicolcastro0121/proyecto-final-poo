/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionClinica;

import Clinica.Factura;


public class GestionFactura {
    private Factura[] facturas;
    private int cantidad;

    public GestionFactura() {
        this.facturas = new Factura[200];
        this.cantidad = 0;
    }
    
    public void crearFactura(Factura factura) {
        if (cantidad < facturas.length) {
            facturas[cantidad] = factura;
            cantidad++;
            System.out.println("Factura creada: " + factura.getNumero());
        } else {
            System.out.println("No hay espacio para más facturas");
        }
    }
    
    public void eliminarFactura(int idFactura) {
        for (int i = 0; i < cantidad; i++) {
            if (facturas[i].getNumero() == idFactura) {
                System.out.println("Factura eliminada: " + facturas[i].getNumero());
                for (int j = i; j < cantidad - 1; j++) {
                    facturas[j] = facturas[j + 1];
                }
                facturas[cantidad - 1] = null;
                cantidad--;
                return;
            }
        }
        System.out.println("Factura no encontrada con ID: " + idFactura);
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
