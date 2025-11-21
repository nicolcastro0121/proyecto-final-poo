
package GestionClinica;

import Clinica.Empleado;

public class GestionEmpleado {
    private Empleado[] empleados;
    private int cantidad;

    public GestionEmpleado() {
        this.empleados = new Empleado[20];
        this.cantidad = 0;
    }
    
    public void AgregarEmpleado(String dni, String nombres, String apellidos, String telf, String email, String pUserName, String pPassword, Empleado empleado, String pRol){
        if (this.cantidad < this.empleados.length) {
            this.empleados[this.cantidad] = new Empleado( dni,  nombres,  apellidos,  telf,  email,  pUserName,  pPassword,  pRol){
                
            };
            this.cantidad++;
        }else{
             System.out.println("No se pueden agregar más empleados. Límite alcanzado.");
                    
        }
    }
    
     public void crearEmpleado(Empleado empleado) {
        if (cantidad < empleados.length) {
            empleados[cantidad] = empleado;
            cantidad++;
        } else {
            System.out.println("No hay espacio para más empleados");
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
    
   
    public boolean modificar(String DNI, Empleado nuevoEmpleado) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDni().equals(DNI)) {
                empleados[i] = nuevoEmpleado;
                return true; 
            }
        }
        return false; 
    }
    
    public boolean eliminar(String DNI) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDni().equals(DNI)) {
                for (int j = i; j < cantidad - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }
                empleados[cantidad - 1] = null;
                cantidad--;
                return true; 
            }
        }
        return false; 
    }
    

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
