package Clinica;

public class Consulta {
    private String motivo;
    private double precio;
    private String estado;
    private String antecedentes;
    private String signosVitales;
    private String examenesFisicos;
    private String diagnosticos;
    private Receta receta;
    private Orden[] ordenes;
    private int cantidadOrdenes;
    private String plan;
    private Cita cita;

    public Consulta(String motivo, double precio, String estado, String antecedentes, String signosVitales, String examenesFisicos, String diagnosticos, Receta receta, Orden[] ordenes, int cantidadOrdenes, String plan, Cita cita) {
        this.motivo = motivo;
        this.precio = precio;
        this.estado = estado;
        this.antecedentes = antecedentes;
        this.signosVitales = signosVitales;
        this.examenesFisicos = examenesFisicos;
        this.diagnosticos = diagnosticos;
        this.receta = receta;
        this.ordenes = ordenes;
        this.cantidadOrdenes = cantidadOrdenes;
        this.plan = plan;
        this.cita = cita;
    }

    
    
}

