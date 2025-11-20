package Clinica;

public class Consulta {
    private String idcons;
    private String diagnostico;
    private String sintomas;
    private String tratamiento;
    private String observaciones;
    private Orden[] ordenes;
    private Paciente paciente;
    private Medico medico;
    private Cita cita;

    public Consulta(String idcons, String diagnostico, String sintomas, String tratamiento,
                   String observaciones, Paciente paciente, Medico medico, Cita cita) {
        this.idcons = idcons;
        this.diagnostico = diagnostico;
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
        this.paciente = paciente;
        this.medico = medico;
        this.cita = cita;
        this.ordenes = new Orden[10]; // Arreglo de órdenes
    }
}

