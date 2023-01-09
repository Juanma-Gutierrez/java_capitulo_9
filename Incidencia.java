/**
 * Incidencia.java
 *
 * @version: 18/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Incidencia {
    private int numIncidencia;
    private int puesto;
    private String descripcionIncidencia;
    private String estado;

    private static int codigo = 1;
    private static int pendientes = 0;

    public Incidencia(int puesto, String descripcionIncidencia) {
        this.numIncidencia = codigo++;
        this.puesto = puesto;
        this.descripcionIncidencia = descripcionIncidencia;
        this.estado = "Pendiente";
        pendientes++;
    }

    @Override
    public String toString() {
        return "Incidencia " + this.getNumIncidencia() + " - Puesto: " + this.getPuesto() + " - "
                + this.getDescripcionIncidencia() + " - " + this.getEstado();
    }

    public int getNumIncidencia() {
        return this.numIncidencia;
    }

    public int getPuesto() {
        return this.puesto;
    }

    public String getDescripcionIncidencia() {
        return this.descripcionIncidencia;
    }

    public String getEstado() {
        return this.estado;
    }

    public void resuelve(String solucion) {
        this.estado = "Resuelta - " + solucion;
        pendientes--;
    }

    public static int getPendientes() {
        return pendientes;
    }
}
