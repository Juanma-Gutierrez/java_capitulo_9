/**
 * Rectangulo.java
 *
 * @version: 11/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Rectangulo {
    private int height;
    private int width;
    private static int totalRectangulos;

    public Rectangulo(int width, int height) {
        this.height = height;
        this.width = width;
        totalRectangulos++;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++)
                res += "*";
            res += "\n";
        }
        return res;
    }

    /**
     * getRectangulosCreados Devuelve el total de rectángulos creados
     *
     * @return total de rectángulos creados
     */
    public static int getRectangulosCreados() {
        return totalRectangulos;
    }
}
