
/**
 * PooEjercicioArrays5.java
 *
 * @version: 26/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class PooEjercicioArrays5 {
    public static void main(String[] args) {
        // Var declarations
        int option;
        Item[] store;
        final int N = 1000;

        // Var init
        store = new Item[N];
        for (int i = 0; i < N; i++)
            store[i] = new Item();

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        initialData(store);

        do {
            printMenu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    listItems(store, sc, N);
                    break;
                case 2:
                    newItem(store, sc, N);
                    break;
                case 3:
                    deleteItem(store, sc, N);
                    break;
                case 4:
                    modifyItem(store, sc, N);
                    break;
                case 5:
                    introItem(store, sc, N);
                    break;
                case 6:
                    outputItem(store, sc, N);
                    break;
            }
        } while (option != 7);

        // Close scanner
        sc.close();
    }

    public static void listItems(Item[] store, Scanner sc, int N) {
        clearScreen();
        System.out.println("****************************************************************************");
        System.out.println("*                            Listado de artículos                          *");
        System.out.println("****************************************************************************");
        System.out.println(store[0].printListHeader());
        for (int i = 0; i < N; i++)
            if (store[i].getName() != null)
                System.out.println(store[i]);
        sc.nextLine();
        pause("", sc);
    }

    public static void initialData(Item[] store) {
        store[0] = new Item(1001, "Martillo", 12.25, 4);
        store[1] = new Item(1002, "Destornillador de estrella", 3.75, 2);
        store[2] = new Item(1003, "Sierra de calar 350W", 24.95, 4);
        store[3] = new Item(1004, "Amoladora 750W 7500rpm", 125.25, 1);
    }

    public static void printMenu() {
        clearScreen();
        System.out.println("***************************");
        System.out.println("*   G E S T I S I M A L   *");
        System.out.println("***************************");
        System.out.println("* 1. Listado              *");
        System.out.println("* 2. Alta                 *");
        System.out.println("* 3. Baja                 *");
        System.out.println("* 4. Modificación         *");
        System.out.println("* 5. Entrada de mercancía *");
        System.out.println("* 6. Salida de mercancía  *");
        System.out.println("* 7. Salir                *");
        System.out.println("***************************");
    }

    public static Item[] newItem(Item[] store, Scanner sc, int N) {
        int code;
        String name;
        double price;
        int units;

        clearScreen();
        System.out.println("***************************");
        System.out.println("*    Alta de artículos    *");
        System.out.println("***************************");
        System.out.println();
        System.out.print("Introduce el código: ");
        code = sc.nextInt();
        System.out.print("Introduce el nombre: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Introduce el precio: ");
        price = sc.nextFloat();
        System.out.print("Introduce el stock actual: ");
        units = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (store[i].getName() == null) {
                store[i].setCode(code);
                store[i].setName(name);
                store[i].setPrice(price);
                store[i].setStock(units);
                break;
            }
        }
        sc.nextLine();
        pause("Artículo dado de alta correctamente", sc);
        return store;
    }

    public static Item[] deleteItem(Item[] store, Scanner sc, int N) {
        int code;
        boolean find = false;
        String option;

        clearScreen();
        System.out.println("***************************");
        System.out.println("*    Baja de artículos    *");
        System.out.println("***************************");
        System.out.println();
        System.out.print("Introduce el código: ");
        code = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (store[i].getCode() == code) {
                find = true;
                System.out.println("\n" + store[i].printListHeader());
                System.out.println(store[i]);
                System.out.print("\n¿Desea eliminar este artículo? (s/n): ");
                sc.nextLine();
                option = sc.nextLine();
                if (option.equals("s") || option.equals("S")) {
                    store[i].setCode(0);
                    store[i].setName(null);
                    store[i].setPrice(0);
                    store[i].setStock(0);
                    pause("Artículo eliminado correctamente", sc);
                } else {
                    pause("Eliminación cancelada", sc);
                }
            }
        }
        if (!find) {
            sc.nextLine();
            pause("No se ha encontrado el artículo", sc);
        }
        return store;
    }

    public static Item[] modifyItem(Item[] store, Scanner sc, int N) {
        int code;
        String name;
        double price;
        int units;
        boolean find = false;
        String option;

        clearScreen();
        System.out.println("*****************************");
        System.out.println("* Modificación de artículos *");
        System.out.println("*****************************");
        System.out.println();
        System.out.print("Introduce el código: ");
        code = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (store[i].getCode() == code) {
                find = true;
                System.out.println("\n" + store[i].printListHeader());
                System.out.println(store[i]);
                System.out.print("\n¿Desea modificar este artículo? (s/n): ");
                sc.nextLine();
                option = sc.nextLine();
                if (option.equals("s") || option.equals("S")) {
                    System.out.print("Introduce el código: ");
                    code = sc.nextInt();
                    System.out.print("Introduce el nombre: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("Introduce el precio: ");
                    price = sc.nextFloat();
                    System.out.print("Introduce el stock actual: ");
                    units = sc.nextInt();
                    store[i].setCode(code);
                    store[i].setName(name);
                    store[i].setPrice(price);
                    store[i].setStock(units);
                    sc.nextLine();
                    pause("Artículo modificado correctamente", sc);
                    break;
                } else {
                    pause("Modificación cancelada", sc);
                }
            }
        }
        if (!find) {
            sc.nextLine();
            pause("No se ha encontrado el artículo", sc);
        }
        return store;
    }

    public static Item[] introItem(Item[] store, Scanner sc, int N) {
        int code;
        int units;
        boolean find = false;
        String option;

        clearScreen();
        System.out.println("*****************************");
        System.out.println("*   Entrada de artículos    *");
        System.out.println("*****************************");
        System.out.println();
        System.out.print("Introduce el código: ");
        code = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (store[i].getCode() == code) {
                find = true;
                System.out.println("\n" + store[i].printListHeader());
                System.out.println(store[i]);
                System.out.print("\n¿Desea introducir unidades para este artículo? (s/n): ");
                sc.nextLine();
                option = sc.nextLine();
                if (option.equals("s") || option.equals("S")) {
                    System.out.print("Introduce las unidades de entrada: ");
                    units = sc.nextInt();
                    store[i].setUnits(units);
                    sc.nextLine();
                    pause("Entrada de unidades dadas de alta correctamente", sc);
                    break;
                } else {
                    pause("Entrada de unidades cancelada", sc);
                }
            }
        }
        if (!find) {
            sc.nextLine();
            pause("No se ha encontrado el artículo", sc);
        }
        return store;
    }

    public static Item[] outputItem(Item[] store, Scanner sc, int N) {
        int code;
        int units;
        boolean find = false;
        String option;

        clearScreen();
        System.out.println("*****************************");
        System.out.println("*    Salida de artículos    *");
        System.out.println("*****************************");
        System.out.println();
        System.out.print("Introduce el código: ");
        code = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (store[i].getCode() == code) {
                find = true;
                System.out.println("\n" + store[i].printListHeader());
                System.out.println(store[i]);
                System.out.print("\n¿Desea sacar unidades para este artículo? (s/n): ");
                sc.nextLine();
                option = sc.nextLine();
                if (option.equals("s") || option.equals("S")) {
                    System.out.print("Introduce las unidades de salida: ");
                    units = sc.nextInt();
                    sc.nextLine();
                    if (units > store[i].getStock()) {
                        pause("Hay un total de " + store[i].getStock() + " unidades en stock.\nNo puedes sacar " + units
                                + " unidades.", sc);
                    } else {
                        store[i].setUnits(units * (-1));
                        pause("Salida de unidades registrada correctamente", sc);
                        break;
                    }
                } else {
                    pause("Salida de unidades cancelada", sc);
                }
            }
        }
        if (!find) {
            sc.nextLine();
            pause("No se ha encontrado el artículo", sc);
        }
        return store;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void pause(String phrase, Scanner sc) {
        String y = "\033[0;33m";
        String r = "\033[0m";
        System.out.println("\n" + phrase);
        System.out.println(y + "\nPulse una tecla para continuar" + r);
        sc.nextLine();
    }
}
