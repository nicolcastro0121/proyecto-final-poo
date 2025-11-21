package GestionClinica;

import Clinica.Consulta;

public class GestionConsulta {

    private Consulta[] consultas;
    private int cantidad;

    public GestionConsulta() {
        this.consultas = new Consulta[100];
        this.cantidad = 0;
    }

    public boolean agregar(Consulta consulta) {
        if (cantidad < consultas.length) {
            consultas[cantidad] = consulta;
            cantidad++;
            return true;
        }
        return false;
    }

    public boolean modificar(int indice, Consulta nuevaConsulta) {
        if (indice >= 0 && indice < cantidad) {
            consultas[indice] = nuevaConsulta;
            return true;
        }
        return false;
    }

    public Consulta buscar(int indice) {
        if (indice >= 0 && indice < cantidad) {
            return consultas[indice];
        }
        return null;
    }

    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
