package Principal;

import Clinica.Cita;
import Clinica.Empleado;
import Clinica.Medico;
import Clinica.Paciente;
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
        this.cargarDatosPrueba();
    }
    
    public void cargarDatosPrueba() {
        try {
            // 1. CARGAR MÉDICOS SI NO EXISTEN
            if (gestionEmpleados.getCantidad() == 0) {
                Medico med1 = new Medico("Cardiología", "11111111", "Juan", "Perez", "999999", "juan@mail.com", "medico1", "1234", "Médico");
                Medico med2 = new Medico("Pediatría", "22222222", "Ana", "Gomez", "888888", "ana@mail.com", "medico2", "1234", "Médico");

                gestionEmpleados.crearEmpleado(med1);
                gestionEmpleados.crearEmpleado(med2);

                // Agregar usuarios también
                AgregarUsuario("medico1", "1234", "Médico", med1);
                AgregarUsuario("medico2", "1234", "Médico", med2);
            }

            // 2. CARGAR PACIENTES SI NO EXISTEN
            if (gestionPacientes.getCantidad() == 0) {
                Paciente paciente1 = new Paciente("74839201", "María Fernanda", "López Rivas", "2004-03-22", "F", "987654321", "Jr. Las Gardenias 221", "Carlos López - 987112233");
                Paciente paciente2 = new Paciente("87654321", "Carlos", "Gómez", "1990-01-10", "M", "111111111", "Av. Siempre Viva 123", "999888777");

                gestionPacientes.agregar(paciente1);
                gestionPacientes.agregar(paciente2);
            }

            // 3. CARGAR CONSULTORIOS SI NO EXISTEN
            if (gestionConsultorios.getCantidad() == 0) {
                Clinica.Consultorio consultorio1 = new Clinica.Consultorio("C-001", "Cardiología", "Disponible");
                Clinica.Consultorio consultorio2 = new Clinica.Consultorio("C-002", "Pediatría", "Disponible");

                gestionConsultorios.agregar(consultorio1);
                gestionConsultorios.agregar(consultorio2);
            }

            // 4. CARGAR CITAS SI NO EXISTEN
            if (gestionCitas.getCantidad() == 0) {
                // Buscar médicos y pacientes
                Medico med1 = null, med2 = null;
                Paciente paciente1 = null, paciente2 = null;
                Clinica.Consultorio consultorio1 = null, consultorio2 = null;

                // Buscar médicos
                for (int i = 0; i < gestionEmpleados.getCantidad(); i++) {
                    if (gestionEmpleados.getEmpleados()[i] instanceof Medico) {
                        Medico m = (Medico) gestionEmpleados.getEmpleados()[i];
                        if ("Juan".equals(m.getNombres())) med1 = m;
                        if ("Ana".equals(m.getNombres())) med2 = m;
                    }
                }

                // Buscar pacientes
                for (int i = 0; i < gestionPacientes.getCantidad(); i++) {
                    Paciente p = gestionPacientes.getPaciente(i);
                    if ("María Fernanda".equals(p.getNombres())) paciente1 = p;
                    if ("Carlos".equals(p.getNombres())) paciente2 = p;
                }

                // Buscar consultorios
                for (int i = 0; i < gestionConsultorios.getCantidad(); i++) {
                    Clinica.Consultorio c = gestionConsultorios.getConsultorios()[i];
                    if ("C-001".equals(c.getCodigo())) consultorio1 = c;
                    if ("C-002".equals(c.getCodigo())) consultorio2 = c;
                }

                // Crear citas
                if (med1 != null && paciente1 != null && consultorio1 != null) {
                    Cita cita1 = new Cita("2024-01-15 10:00", "Presencial", "Pendiente", 
                                         paciente1, med1, consultorio1);
                    gestionCitas.agregar(cita1);

                    Cita cita2 = new Cita("2024-01-15 14:00", "Teleconsulta", "Pendiente", 
                                         paciente2, med1, consultorio1);
                    gestionCitas.agregar(cita2);
                }

                if (med2 != null && paciente2 != null && consultorio2 != null) {
                    Cita cita3 = new Cita("2024-01-16 09:00", "Presencial", "Pendiente", 
                                         paciente2, med2, consultorio2);
                    gestionCitas.agregar(cita3);
                }
            }

            System.out.println("Datos de prueba cargados correctamente en Sistema");

        } catch (Exception e) {
            System.out.println("Error al cargar datos de prueba: " + e.getMessage());
        }
    }
    
    public void setUsuarioActual(Usuario u) {
        this.usuarioActual = u;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void AgregarUsuario(String userName, String password, String rol, Empleado empleado) {
        if (cantidadUsuarios < usuarios.length) {
            Usuario nuevoUsuario = new Usuario(userName, password, rol);
            nuevoUsuario.setEmpleado(empleado);
            usuarios[cantidadUsuarios] = nuevoUsuario;
            cantidadUsuarios++;
        }
    }
    
    public void AgregarUsuario(String userName, String password, String rol) {
        if (cantidadUsuarios < usuarios.length) {
            Usuario nuevoUsuario = new Usuario(userName, password, rol);
            usuarios[cantidadUsuarios] = nuevoUsuario;
            cantidadUsuarios++;
        }
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
