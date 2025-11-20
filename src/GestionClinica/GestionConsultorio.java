
package GestionClinica;
import Clinica.Consultorio;
public class GestionConsultorio {
    private Consultorio[] consultorios;
    private int cantidad;

    public GestionConsultorio() {
        this.consultorios = new Consultorio[50];
        this.cantidad = 0;
    }
    public void agregar(Consultorio consultorio) {
        if (cantidad < consultorios.length) {
            consultorios[cantidad] = consultorio;
            cantidad++;
            System.out.println("Consultorio agregado: " + consultorio.getCodigo());
        } else {
            System.out.println("No hay espacio para más consultorios");
        }
    }
    
    public void modificar(int indice, Consultorio nuevoConsultorio) {
        if (indice >= 0 && indice < cantidad) {
            consultorios[indice] = nuevoConsultorio;
            System.out.println("Consultorio modificado en posición: " + indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
    
     public void eliminar(String codigo) {
        for (int i = 0; i < cantidad; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {
                System.out.println("Consultorio eliminado: " + consultorios[i].getCodigo());
                
                for (int j = i; j < cantidad - 1; j++) {
                    consultorios[j] = consultorios[j + 1];
                }
                consultorios[cantidad - 1] = null;
                cantidad--;
                return;
            }
        }
        System.out.println("Consultorio no encontrado con código: " + codigo);
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
    
    
}
