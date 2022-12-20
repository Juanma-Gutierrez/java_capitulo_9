
/**
 * PooEjercicioArrays1.java
 *
 * @version: 20/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los
 * datos de cada uno de ellos mediante un bucle. Muestra a continuación los
 * datos de todos los gatos utilizando también un bucle.
 */

import java.util.Scanner;

public class PooEjercicioArrays1 {
    public static void main(String[] args) {
        // Var declarations
        Gato[] gatos;
        String input;

        // Var init
        gatos = new Gato[4];
        Scanner sc = new Scanner(System.in);

        // Process
        for (int i = 0; i < 4; i++) {
            gatos[i] = new Gato();
            System.out.print("Introduce el nombre del gato " + (i + 1) + ": ");
            input = sc.nextLine();
            gatos[i].setName(input);
            System.out.print("Introduce el sexo: ");
            input = sc.nextLine();
            gatos[i].setSex(input);
            System.out.print("Introduce la raza: ");
            input = sc.nextLine();
            gatos[i].setBreed(input);
            System.out.print("Introduce la comida favorita: ");
            input = sc.nextLine();
            gatos[i].setFavouriteFood(input);
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(gatos[i]);
        }

        // Close scanner
        sc.close();
    }
}
