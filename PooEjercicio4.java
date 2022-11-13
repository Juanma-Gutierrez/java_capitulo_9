/**
 * PooEjercicio4.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/*
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y
 * algunos de los métodos pueden ser invierte, simplifica, multiplica, divide,
 * etc.
 */

public class PooEjercicio4 {
    public static void main(String[] args) {
        // Var declarations
        Fraccion fraccion1;
        Fraccion fraccion2;
        float res;

        // Var init
        fraccion1 = new Fraccion(2, 5);
        fraccion2 = new Fraccion(3, 4);

        // Process
        System.out.print("Fracción 1: ");
        System.out.println(fraccion1.muestra());
        System.out.print("Fracción 2: ");
        System.out.println(fraccion2.muestra());

        res = fraccion1.multiplica(fraccion2.getNumerador(), fraccion2.getDenominador());
        System.out.println("Multiplicación de " + fraccion1.muestra() + " por " + fraccion2.muestra() + ": " + res);

        res = fraccion1.divide(fraccion2.getNumerador(), fraccion2.getDenominador());
        System.out.printf("División de %s entre %s: %.2f\n", fraccion1.muestra(), fraccion2.muestra(), res);

        System.out.printf("Inversión de la fracción %s: %.2f\n", fraccion1.muestra(), fraccion1.invierte());
        System.out.printf("Inversión de la fracción %s: %.2f\n", fraccion2.muestra(), fraccion2.invierte());

    }
}
