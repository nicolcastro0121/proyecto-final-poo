/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionClinica;

import Clinica.Empleado;
import Clinica.Usuario;
import Principal.GestorEmpleados;

/**
 *
 * @author Nicol
 */
public class GestorUsuarios {
    private Usuario[] listaUsuarios;
    private int numUsuario;
    
    public GestorUsuarios(){
        this.listaUsuarios = new Usuario[20];
        this.numUsuario = 0;
    }
    
    public void AgregarUsuario(String pUserName, String pPassword, String pRol){
        this.listaUsuarios[this.numUsuario] = new Usuario(pUserName, pPassword, pRol);
        this.numUsuario++;
    }
    
    public Usuario ValidarUsuario(String pUserName, String pPassword){
        for (int i = 0; i < this.numUsuario; i++) {
            if (this.listaUsuarios[i].getUserName().equals(pUserName) && this.listaUsuarios[i].getPassword().equals(pPassword)) {
                return this.listaUsuarios[i];
            }
        }
        return null;
    }
}
