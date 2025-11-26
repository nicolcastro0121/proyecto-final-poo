package Principal;

import Clinica.Empleado;
import Clinica.Usuario;
import GestionClinica.GestionCita;
import GestionClinica.GestionConsulta;
import GestionClinica.GestionConsultorio;
import GestionClinica.GestionEmpleado;
import GestionClinica.GestionFactura;
import GestionClinica.GestionPacientes;
import InterfacesClinica.Reporte;

public class Sistema {

    public static Usuario usuarioActual;
    static GestionPacientes gestionPacientes;
    static GestionEmpleado gestionEmpleados;
    static GestionCita gestionCitas;
    static GestionConsulta gestionConsultas;
    static GestionConsultorio gestionConsultorios;
    static GestionFactura gestionFacturas;
    static Usuario[] usuarios;
    static int cantidadUsuarios;

    public Sistema() {
        this.gestionPacientes = new GestionPacientes();
        this.gestionEmpleados = new GestionEmpleado();
        this.gestionCitas = new GestionCita();
        this.gestionConsultas = new GestionConsulta();
        this.gestionConsultorios = new GestionConsultorio();
        this.gestionFacturas = new GestionFactura();
        this.usuarios = new Usuario[50];
        this.cantidadUsuarios = 0;
    }

    public void setUsuarioActual(Usuario u) {
        this.usuarioActual = u;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void AgregarUsuario(String userName, String password, String rol, Empleado empleado) {
    Usuario nuevoUsuario = new Usuario(userName, password, rol);
    nuevoUsuario.setEmpleado(empleado); 
    }

    public void eliminarUsuario(String id) {
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (usuarios[i].getUserName().equals(id)) {
                System.out.println("Usuario eliminado: " + usuarios[i].getUserName());
                for (int j = i; j < cantidadUsuarios - 1; j++) {
                    usuarios[j] = usuarios[j + 1];
                }
                usuarios[cantidadUsuarios - 1] = null;
                cantidadUsuarios--;
                return;
            }
        }
        System.out.println("Usuario no encontrado con ID: " + id);
    }

    public void modificarUsuario(String id, Usuario nuevoUsuario) {
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (usuarios[i].getUserName().equals(id)) {
                usuarios[i].setUserName(nuevoUsuario.getUserName());
                usuarios[i].setPassword(nuevoUsuario.getPassword());
                System.out.println("Usuario modificado: " + id);
                return;
            }
        }
        System.out.println("Usuario no encontrado con ID: " + id);
    }

    public Usuario buscarUsuario(String id) {
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (usuarios[i].getUserName().equals(id)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public void verUsuarios() {
        System.out.println("=== LISTA DE USUARIOS ===");
        System.out.println("Total de usuarios: " + cantidadUsuarios);
        for (int i = 0; i < cantidadUsuarios; i++) {
            Usuario user = usuarios[i];
        }
    }

    public GestionPacientes getGestionPacientes() {
        return gestionPacientes;
    }

    public GestionEmpleado getGestionEmpleados() {
        return gestionEmpleados;
    }

    public GestionCita getGestionCitas() {
        return gestionCitas;
    }

    public GestionConsulta getGestionConsultas() {
        return gestionConsultas;
    }

    public GestionConsultorio getGestionConsultorios() {
        return gestionConsultorios;
    }

    public GestionFactura getGestionFacturas() {
        return gestionFacturas;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

}
