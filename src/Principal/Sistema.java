/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import InterfacesClinica.Imprimible;
import InterfacesClinica.Reporte;
import InterfacesClinica.Validable;



public class Sistema {
    public void imprimirDocumento(Imprimible documento) {
        documento.imprimir();
    }

    
    public void generarReporteCompleto(Reporte reporte) {
        System.out.println(reporte.generarReporteDetallado());
    }


    public boolean validarObjeto(Validable objeto) {
        if (!objeto.validar()) {
            String[] errores = objeto.obtenerErrores();
            System.out.println("Errores de validación:");
            for (String error : errores) {
                System.out.println("- " + error);
            }
            return false;
        }
        return true;
    }
}
