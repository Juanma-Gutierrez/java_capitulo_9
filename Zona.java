/**
 * Zona.java
 *
 * @version: 27/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Zona {
    private int entradasPorVender;

    public Zona(int n) {
        entradasPorVender = n;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    /**
     * Vende un número de entradas.
     * Comprueba si quedan entradas libres antes de realizar la venta.
     *
     * @param n número de entradas a vender
     */
    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("\nLo siento, las entradas para esa zona están agotadas.\n");
        } else if (this.entradasPorVender < n) {
            System.out.println("\nSólo me quedan " + this.entradasPorVender
                    + " entradas para esa zona.\n");
        }
        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.println("\nAquí tiene sus " + n + " entradas, gracias.\n");
        }
    }
}
