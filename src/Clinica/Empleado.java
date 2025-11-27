package Clinica;

public class Empleado extends Usuario {
    protected String dni;
    protected String nombres;
    protected String apellidos;
    protected String telf;
    protected String email;

    public Empleado(String dni, String nombres, String apellidos, String telf, String email, String pUserName, String pPassword, String pRol) {
        super(pUserName, pPassword, pRol);
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telf = telf;
        this.email = email;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getEspecialidad() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}