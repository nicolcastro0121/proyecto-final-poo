
package Clinica;
import GestionClinica.GestionConsulta;
import GestionClinica.GestionConsultorio;
import GestionClinica.GestionEmpleado;

public class Administrador extends Empleado{
     private GestionEmpleado gestionEmpleado;
     private GestionConsultorio gestionConsultorio;
     private GestionConsulta gestionconsulta;

    public Administrador(String dni, String nombres, String apellidos, String telf, String email, String pUserName, String pPassword, String pRol) {
        super(dni, nombres, apellidos, telf, email, pUserName, pPassword, pRol);
        this.gestionEmpleado = gestionEmpleado;
        this.gestionConsultorio = gestionConsultorio;
        this.gestionconsulta = gestionconsulta;
    }




    public void crearEmpleado(Empleado empleado) {
        gestionEmpleado.crearEmpleado(empleado);
    }

    public void modificarEmpleado(String id, Empleado empleadoModificado) {
        gestionEmpleado.modificar(id, empleadoModificado);
    }
    
    public void eliminarEmpleado(String id) {
        gestionEmpleado.eliminar(id);
    }
    
    
    public void registrarConsultorio(Consultorio consultorio) {
        gestionConsultorio.agregar(consultorio);
    }
    
    public void modificarConsultorio(String indice, Consultorio consultorioModificado) {
        gestionConsultorio.modificar(indice, consultorioModificado);
    }
    
    public void eliminarConsultorio(String codigo) {
        gestionConsultorio.eliminar(codigo);
    }
    
     public void generarReporteConsultorio() {
        System.out.println("=== REPORTE DE CONSULTORIOS ===");
        gestionConsultorio.ver();
    }
     
    public void generarReporteIngresos() {
        System.out.println("=== REPORTE DE INGRESOS ===");
        System.out.println("Reporte de ingresos generado");
    }
     
    public String generarReporteGeneral(int totalEmpleados, int totalConsultorios, int totalCitas, int totalFacturas) {
        return "=== REPORTE GENERAL ===\n" +
               "Total empleados: " + totalEmpleados + "\n" +
               "Total consultorios: " + totalConsultorios + "\n" +
               "Total citas: " + totalCitas + "\n" +
               "Total facturas: " + totalFacturas;
    }

    public void generarReporteOcupacion(String[] datosConsultorios) {
        System.out.println("=== OCUPACIÓN DE CONSULTORIOS ===");
        for (String dato : datosConsultorios) {
            System.out.println(dato);
        }
    }

    public GestionEmpleado getGestionEmpleado() {
        return gestionEmpleado;
    }

    public void setGestionEmpleado(GestionEmpleado gestionEmpleado) {
        this.gestionEmpleado = gestionEmpleado;
    }

    public GestionConsultorio getGestionConsultorio() {
        return gestionConsultorio;
    }

    public void setGestionConsultorio(GestionConsultorio gestionConsultorio) {
        this.gestionConsultorio = gestionConsultorio;
    }

    public GestionConsulta getGestionconsulta() {
        return gestionconsulta;
    }

    public void setGestionconsulta(GestionConsulta gestionconsulta) {
        this.gestionconsulta = gestionconsulta;
    }
    
    

}
