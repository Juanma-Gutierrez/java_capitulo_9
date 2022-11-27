/**
 * Ameba.java
 *
 * @version: 27/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + this.getPeso() + " microgramos.";
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int n) {
        this.peso = n;
    }

    /**
     * come: Realiza el acto de comer n, gastando 1 en el proceso
     *
     * @param n Cantidad comida
     */
    public void come(int n) {
        this.peso += n - 1;
    }

    /**
     * come: realiza el acto de comer una ameba. Su peso aumenta lo que pesaba la
     * anterior ameba -1 gastado en el proceso
     *
     * @param am Ameba que es comida
     */
    public void come(Ameba am) {
        this.peso += am.getPeso() - 1;
        am.setPeso(0);
    }
}
