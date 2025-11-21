
package GestionClinica;
import Clinica.Consultorio;
import InterfacesClinica.Reporte;


public class GestionConsultorio implements Reporte{
    private Consultorio[] consultorios;
    private int cantidad;

    public GestionConsultorio() {
        this.consultorios = new Consultorio[50];
        this.cantidad = 0;
    }
    public boolean agregar(Consultorio consultorio) {
        if (cantidad < consultorios.length) {
            consultorios[cantidad] = consultorio;
            cantidad++;
            return true; 
        }
        return false; 
    }
    
    public boolean modificar(String codigo, Consultorio nuevoConsultorio) {
        for (int i = 0; i < cantidad; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {
                consultorios[i] = nuevoConsultorio;
                return true; 
            }
        }
        return false; 
    }
    
     public boolean eliminar(String codigo) {
        for (int i = 0; i < cantidad; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {
                for (int j = i; j < cantidad - 1; j++) {
                    consultorios[j] = consultorios[j + 1];
                }
                consultorios[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }
    public void ver() {
        System.out.println("=== LISTA DE CONSULTORIOS ===");
        System.out.println("Total de consultorios: " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            Consultorio consultorio = consultorios[i];
            System.out.println((i+1) + ". Código: " + consultorio.getCodigo() + 
                             " - Especialidad: " + consultorio.getEspecialidad() +
                             " - Estado: " + consultorio.getEstado());
        }
    }

    public Consultorio[] getConsultorios() {
        return consultorios;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String generarReporte() {
        return "Reporte de Consultorios: Total=" + this.cantidad;
    }

    @Override
    public String generarReporteDetallado() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("=== REPORTE DETALLADO DE CONSULTORIOS ===\n");
        for (int i = 0; i < cantidad; i++) {
            reporte.append("Consultorio: ").append(consultorios[i].getCodigo())
                   .append(" - Especialidad: ").append(consultorios[i].getEspecialidad())
                   .append(" - Estado: ").append(consultorios[i].getEstado()).append("\n");
        }
        return reporte.toString();
    }

    @Override
    public Object[] obtenerDatosReporte() {
        return this.consultorios;
    }
    
    
}
