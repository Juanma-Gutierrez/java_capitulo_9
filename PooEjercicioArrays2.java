
/**
 * PooEjercicioArrays2.java
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

public class PooEjercicioArrays2 {
    public static void main(String[] args) {
        // Var declarations
        Gato[] gatos;
        String nombre;
        String sexo;
        String raza;
        String comida;

        // Var init
        gatos = new Gato[4];
        Scanner sc = new Scanner(System.in);

        // Process
        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce el nombre del gato " + (i + 1) + ": ");
            nombre = sc.nextLine();
            System.out.print("Introduce el sexo: ");
            sexo = sc.nextLine();
            System.out.print("Introduce la raza: ");
            raza = sc.nextLine();
            System.out.print("Introduce la comida favorita: ");
            comida = sc.nextLine();
            gatos[i] = new Gato(nombre, sexo, raza, comida);
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(gatos[i]);
        }

        // Close scanner
        sc.close();
    }
}
