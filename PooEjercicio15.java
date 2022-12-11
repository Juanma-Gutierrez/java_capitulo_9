/**
 * PooEjercicio15.java
 *
 * @version: 11/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
 * forma aleatoria, que encajen bien y que estén bien colocadas según el juego
 * del dominó. No hay que controlar si se repiten o no las fichas.
 *
 * ```
 * Ejemplo:
 * [6|1][1|4][4|4][4| ][ |3][3|2][2|6][6|5]
 * ```
 */

public class PooEjercicio15 {
    public static void main(String[] args) {
        // Var declarations
        int cant;

        // Var init
        cant = 7;

        // Ficha1 creation
        FichaDomino ficha1;
        int num1;
        int num2;
        num1 = (int) (Math.random() * 7);
        num2 = (int) (Math.random() * 7);
        ficha1 = new FichaDomino(num1, num2);
        System.out.print(ficha1);
        do {
            FichaDomino ficha2;
            boolean correcto;
            do {
                correcto = false;
                num1 = (int) (Math.random() * 7);
                num2 = (int) (Math.random() * 7);
                ficha2 = new FichaDomino(num1, num2);
                if (ficha1.getSide2() == ficha2.getSide1())
                    correcto = true;
                else if (ficha1.getSide2() == ficha2.getSide2()) {
                    correcto = true;
                    ficha2.voltea();
                }
            } while (!correcto);
            System.out.print(ficha2);
            ficha1.setSide1(ficha2.getSide1());
            ficha1.setSide2(ficha2.getSide2());
            cant--;
        } while (cant > 0);
    }
}
