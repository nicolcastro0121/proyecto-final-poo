/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica;

/**
 *
 * @author Nicol
 */
public abstract class Usuario {
    protected String id;
    protected String usuario;
    protected String password;
    protected String estado;

    public Usuario(String id, String usuario, String password, String estado) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.estado = estado;
    }
    
    public abstract boolean login();
    public abstract void salir();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

}
