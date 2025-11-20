
package Clinica;

public abstract class Empleado extends Persona {
    
    protected String usuario;
    protected String password;
    protected String rol; 

    
    public Empleado(String dni, String nombres, String apellidos, String telefono, String email,
                    String usuario, String password, String rol) {
        
        super(dni, nombres, apellidos, telefono, email); 
        this.usuario = usuario;
        this.password = password;
        this.rol = rol; 
    }

   
    public boolean login(String user, String pass) {
        return this.usuario.equals(user) && this.password.equals(pass);
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
   

    
}