
package Clinica;

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
