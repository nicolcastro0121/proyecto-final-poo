
package GestionClinica;

import Clinica.Empleado;

public class GestionEmpleado {
    private Empleado[] empleados;
    private int cantidad;

    public GestionEmpleado() {
        this.empleados = new Empleado[20];
        this.cantidad = 0;
    }
    
    public void AgregarEmpleado(String dni, String nombres, String apellidos, String telf, String email, String userName, String password, Empleado empleado, String Rol){
        if (this.cantidad < this.empleados.length) {
            this.empleados[this.cantidad] = new Empleado(dni, nombres, apellidos, telf, email, userName, password, empleado, Rol){
                
            };
            this.cantidad++;
        }else{
             System.out.println("No se pueden agregar más empleados. Límite alcanzado.");
                    
        }
    }
    
    public Empleado ValidarEmpleado(String dni, String nombres, String apellidos, String telf, String email, String userName, String password, Empleado empleado, String Rol){
        for (int i = 0; i < this.cantidad; i++) {
            if (this.empleados[i].getUserName().equals(userName)&& this.empleados[i].getPassword().equals(password)) {
                return this.empleados[i];
            }
        }
        return null;
    }
    
    /*
    public void modificar(int DNI, Empleado nuevoEmpleado) {
        if () {
            empleados[indice] = nuevoEmpleado;
            System.out.println("Empleado modificado en posición: " + indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
    */
    public void eliminar(int indice) {
        if (indice >= 0 && indice < cantidad) {
            System.out.println("Empleado eliminado: " + empleados[indice].getNombres());
            for (int i = indice; i < cantidad - 1; i++) {
                empleados[i] = empleados[i + 1];
            }
            empleados[cantidad - 1] = null;
            cantidad--;
        } else {
            System.out.println("Índice inválido");
        }
    }
    

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
