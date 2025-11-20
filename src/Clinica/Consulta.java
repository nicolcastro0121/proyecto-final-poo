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

    public void abrir() {
        this.estado = "Abierta";
        System.out.println("Consulta abierta para: " + cita.getPaciente().getNombres());
    }
    
    public void cerrar() {
        this.estado = "Cerrada";
        System.out.println("Consulta cerrada");
    }
    
    public void agregarReceta(Receta nuevaReceta) {
        this.receta = nuevaReceta;
        System.out.println("Receta agregada a la consulta");
    }
    
    public void agregarOrden(Orden orden) {
        if (cantidadOrdenes < ordenes.length) {
            ordenes[cantidadOrdenes] = orden;
            cantidadOrdenes++;
            System.out.println("Orden agregada: " + orden.getNombre());
        } else {
            System.out.println("No se pueden agregar más órdenes");
        }
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(String signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getExamenesFisicos() {
        return examenesFisicos;
    }

    public void setExamenesFisicos(String examenesFisicos) {
        this.examenesFisicos = examenesFisicos;
    }

    public String getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(String diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Orden[] getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(Orden[] ordenes) {
        this.ordenes = ordenes;
    }

    public int getCantidadOrdenes() {
        return cantidadOrdenes;
    }

    public void setCantidadOrdenes(int cantidadOrdenes) {
        this.cantidadOrdenes = cantidadOrdenes;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
    
    
}

