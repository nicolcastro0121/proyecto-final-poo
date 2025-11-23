
package GestionClinica;

import Clinica.Empleado;
import Clinica.Usuario;
import Principal.Gestor_Empleados;

public class GestorUsuarios {
    private Usuario[] listaUsuarios;
    private int numUsuario;
    
    public GestorUsuarios(){
        this.listaUsuarios = new Usuario[20];
        this.numUsuario = 0;
    }
    
    public void AgregarUsuario(String pUserName, String pPassword, String pRol, Empleado emp){
        this.listaUsuarios[this.numUsuario] = new Usuario(pUserName, pPassword, emp, pRol);
        this.numUsuario++;
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
