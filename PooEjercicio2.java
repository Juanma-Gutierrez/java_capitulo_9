/**
 * PooEjercicio2.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
 *
 * VEHÍCULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8):
 */

import java.util.Scanner;

public class PooEjercicio2 {
    public static void main(String[] args) {
        // Var declarations
        Bicicleta orbea;
        Coche skoda;
        int option;

        // Var init
        orbea = new Bicicleta("Orbea");
        skoda = new Coche("Skoda");

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        System.out.println();
        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1: Anda con la bicicleta");
            System.out.println("2: Haz el caballito con la bicicleta");
            System.out.println("3: Anda con el coche");
            System.out.println("4: Quema rueda con el coche");
            System.out.println("5: Ver kilometraje de la bicicleta");
            System.out.println("6: Ver kilometraje del coche");
            System.out.println("7: Ver kilometraje total");
            System.out.println("8: Salir");
            System.out.println("Elige una opción (1-8):");
            option = sc.nextInt();
            System.out.println("\u001B[31m");

            switch (option) {
                case 1:
                    orbea.anda();
                    break;
                case 2:
                    orbea.hazElCaballito();
                    break;
                case 3:
                    skoda.anda();
                    break;
                case 4:
                    skoda.quemaRueda();
                    break;
                case 5:
                    System.out.println("Km totales recorridos en bicicleta: " + Vehiculo.getKmTotalBicicleta());
                    break;
                case 6:
                    System.out.println("Kilometros totales recorridos en coche: " + Vehiculo.getKmTotalCoche());
                    break;
                case 7:
                    System.out.println(
                            "Kilometros totales recorridos por todos los vehiculos: " + Vehiculo.getKmTotales());
                    break;
            }
            System.out.println("\u001B[0m");
        } while (option != 8);

        // Scanner close
        sc.close();
    }
}
