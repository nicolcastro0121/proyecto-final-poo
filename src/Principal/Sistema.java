
package Principal;

import Clinica.Usuario;
import GestionClinica.GestionCita;
import GestionClinica.GestionConsulta;
import GestionClinica.GestionConsultorio;
import GestionClinica.GestionEmpleado;
import GestionClinica.GestionFactura;
import GestionClinica.GestionPacientes;
import InterfacesClinica.Reporte;




public class Sistema {
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

    
     public void agregarUsuario(Usuario usuario) {
        if (cantidadUsuarios < usuarios.length) {
            usuarios[cantidadUsuarios] = usuario;
            cantidadUsuarios++;
            System.out.println("Usuario agregado: " + usuario.getUsuario());
        } else {
            System.out.println("No hay espacio para más usuarios");
        }
    }
    
    public void eliminarUsuario(int indice) {
        if (indice >= 0 && indice < cantidadUsuarios) {
            System.out.println("Usuario eliminado: " + usuarios[indice].getUsuario());
            for (int i = indice; i < cantidadUsuarios - 1; i++) {
                usuarios[i] = usuarios[i + 1];
            }
            usuarios[cantidadUsuarios - 1] = null;
            cantidadUsuarios--;
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public void modificarUsuario(int indice, Usuario nuevoUsuario) {
        if (indice >= 0 && indice < cantidadUsuarios) {
            Usuario usuarioActual = usuarios[indice];
            usuarioActual.setId(nuevoUsuario.getId());
            usuarioActual.setUsuario(nuevoUsuario.getUsuario());
            usuarioActual.setPassword(nuevoUsuario.getPassword());
            usuarioActual.setEstado(nuevoUsuario.getEstado());
            System.out.println("Usuario modificado en posición: " + indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
    
    public Usuario buscarUsuarioPorCredenciales(String usuario, String password) {
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (usuarios[i].getUsuario().equals(usuario) && usuarios[i].getPassword().equals(password)) {
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
            System.out.println((i+1) + ". ID: " + user.getId() + 
                             " - Usuario: " + user.getUsuario() + 
                             " - Estado: " + user.getEstado());
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
