
package GestionClinica;

import Clinica.Empleado;

public class GestionEmpleado {
    private Empleado[] empleados;
    private int cantidad;

    public GestionEmpleado() {
        this.empleados = new Empleado[50];
        this.cantidad = 0;
    }
    
    public void agregar(Empleado empleado) {
        if (cantidad < empleados.length) {
            empleados[cantidad] = empleado;
            cantidad++;
            System.out.println("Empleado agregado: " + empleado.getNombre());
        } else {
            System.out.println("No hay espacio para más empleados");
        }
    }
    
    public void modificar(int indice, Empleado nuevoEmpleado) {
        if (indice >= 0 && indice < cantidad) {
            empleados[indice] = nuevoEmpleado;
            System.out.println("Empleado modificado en posición: " + indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public void eliminar(int indice) {
        if (indice >= 0 && indice < cantidad) {
            System.out.println("Empleado eliminado: " + empleados[indice].getNombre());
            for (int i = indice; i < cantidad - 1; i++) {
                empleados[i] = empleados[i + 1];
            }
            empleados[cantidad - 1] = null;
            cantidad--;
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public void ver() {
        System.out.println("=== LISTA DE EMPLEADOS ===");
        System.out.println("Total de empleados: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            Empleado empleado = empleados[i];
            System.out.println((i+1) + ". " + empleado.getNombre() + " " + empleado.getApellido() + 
                             " - DNI: " + empleado.getDni());
        }
    }
    
}
