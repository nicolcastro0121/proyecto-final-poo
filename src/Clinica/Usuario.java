
package Clinica;

public class Usuario {
    protected String userName;
    protected String password;
    private Empleado empleado;
    protected String Rol;
    public int getRol;

    public Usuario(String userName, String password, Empleado empleado, String Rol) {
        this.userName = userName;
        this.password = password;
        this.empleado = empleado;
        this.Rol = Rol;
    }
    
    public Usuario(String pUserName, String pPassword, String pRol) {
        this.userName = pUserName;
        this.password = pPassword;
        this.Rol = pRol;
        this.empleado = null; 
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }




    

}
