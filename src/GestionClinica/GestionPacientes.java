/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionClinica;

import Clinica.Paciente;
 
import Clinica.Paciente;

public class GestionPacientes {
    private Paciente[] pacientes;
    private int cantidad;

    public GestionPacientes() {
        this.pacientes = new Paciente[100];
        this.cantidad = 0;
    }
    
    public void agregar(Paciente paciente) {
        if (cantidad < pacientes.length) {
            pacientes[cantidad] = paciente;
            cantidad++;
            System.out.println("Paciente agregado: " + paciente.getNombres());
        } else {
            System.out.println("No hay espacio para más pacientes");
        }
    }
    
    public void modificar(int indice, Paciente nuevoPaciente) {
        if (indice >= 0 && indice < cantidad) {
            pacientes[indice] = nuevoPaciente;
            System.out.println("Paciente modificado en posición: " + indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public void eliminar(int indice) {
        if (indice >= 0 && indice < cantidad) {
            System.out.println("Paciente eliminado: " + pacientes[indice].getNombres());
            for (int i = indice; i < cantidad - 1; i++) {
                pacientes[i] = pacientes[i + 1];
            }
            pacientes[cantidad - 1] = null;
            cantidad--;
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public void ver() {
        System.out.println("=== LISTA DE PACIENTES ===");
        System.out.println("Total de pacientes: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            Paciente paciente = pacientes[i];
            System.out.println((i+1) + ". " + paciente.getNombres() + " " + paciente.getApellidos() + 
                             " - DNI: " + paciente.getDni() + " - Tel: " + paciente.getTelefono());
        }
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    
}

