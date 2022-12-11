/**
 * Piramide.class
 *
 * @version: 11/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Piramide {
    private int height;
    private static int totalPiramides;

    public Piramide(int height) {
        this.height = height;
        totalPiramides++;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.height; i++) {
            for (int j = this.height - 1 - i; j > 0; j--) {
                res += " ";
            }
            for (int j = 0; j <= i * 2; j++) {
                res += "*";
            }
            res += "\n";
        }
        return res;
    }

    /**
     * getPiramidesCreadas Devuelve el total de pirámides creadas
     *
     * @return total de pirámides creadas
     */
    public static int getPiramidesCreadas() {
        return totalPiramides;
    }
}