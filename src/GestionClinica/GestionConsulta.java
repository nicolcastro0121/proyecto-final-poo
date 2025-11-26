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

    public boolean modificar(int posi, Consulta nuevaConsulta) {
        if (posi >= 0 && posi < cantidad) {
            consultas[posi] = nuevaConsulta;
            return true;
        }
        return false;
    }

    public Consulta buscar(int posicionconsulta) {
        if (posicionconsulta >= 0 && posicionconsulta < cantidad) {
            return consultas[posicionconsulta];
        }
        return null;
    }
    
    public boolean eliminar(int posicion) {
        if (posicion >= 0 && posicion < cantidad) {
            for (int i = posicion; i < cantidad - 1; i++) {
                consultas[i] = consultas[i + 1];
            }
            consultas[cantidad - 1] = null;
            cantidad--;
            return true;
        }
        return false;
    }

    public Consulta[] getConsultas() {
        Consulta[] resultado = new Consulta[cantidad];
        for (int i = 0; i < cantidad; i++) {
            resultado[i] = consultas[i];
        }
        return resultado;
    }


    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }
    

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    

}
