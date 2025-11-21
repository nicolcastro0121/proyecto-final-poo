
package Clinica;

public abstract class Usuario {
    protected String id;
    protected String usuario;
    protected String password;
    protected String estado;
    protected String Rol;

    public Usuario(String id, String usuario, String password, String estado, String Rol) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.estado = estado;
        this.Rol = Rol;
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

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
    

}
