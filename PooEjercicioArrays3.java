
/**
 * PooEjercicioArrays3.java
 *
 * @version: 24/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class PooEjercicioArrays3 {
    public static void main(String[] args) {
        // Var declarations
        final int N = 100; // número máximo de elementos del listado
        int option;
        Disk[] collection;

        // Var init
        collection = new Disk[N];
        for (int i = 0; i < N; i++) {
            collection[i] = new Disk(i);
        }

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        collection = createBase(collection);

        do {
            option = 0;
            option = printMenu(sc, collection, N);
        } while (option != 9);

        // Close Scanner
        sc.close();
    }

    public static int printMenu(Scanner sc, Disk[] collection, int N) {
        // Var declaration
        int option;

        clearScreen();
        System.out.println("***********************");
        System.out.println("* COLECCIÓN DE DISCOS *");
        System.out.println("***********************");
        System.out.println("* 1. Crear Disco      *");
        System.out.println("* 2. Modificar Disco  *");
        System.out.println("* 3. Borrar Disco     *");
        System.out.println("* 4. Listar colección *");
        System.out.println("*                     *");
        System.out.println("* 9. Salir            *");
        System.out.println("***********************");
        option = sc.nextInt();
        switch (option) {
            case 1:
                createDisk(collection, sc);
                break;
            case 2:
                // aux = modifyDisk(sc);
                break;
            case 3:
                deleteDisk(collection, sc);
                break;
            case 4:
                listCollection(collection, sc, N);
                break;
        }
        return option;
    }

    public static Disk[] createDisk(Disk[] collection, Scanner sc) {
        String author;
        String title;
        String genre;
        int duration;
        clearScreen();
        sc.nextLine();
        System.out.println("***********************");
        System.out.println("*     CREAR DISCO     *");
        System.out.println("***********************");
        System.out.println();
        System.out.print("Introduce el autor del disco: ");
        author = sc.nextLine();
        System.out.print("Introduce el título del disco: ");
        title = sc.nextLine();
        System.out.print("Introduce el género del disco: ");
        genre = sc.nextLine();
        System.out.print("Introduce la duración del disco: ");
        duration = sc.nextInt();
        Disk res = new Disk(author, title, genre, duration);
        collection = addDisk(res, collection);
        return (collection);
    }

    public static void modifyDisk(Scanner sc) {
        clearScreen();
        System.out.println("Modificar Disco");
    }

    public static Disk[] deleteDisk(Disk[] collection, Scanner sc) {
        int code;
        clearScreen();
        sc.nextLine();
        System.out.println("***********************");
        System.out.println("*    BORRAR DISCO     *");
        System.out.println("***********************");
        System.out.println();
        System.out.print("Introduce el código del disco: ");
        code = sc.nextInt();
        collection = deleteDisk(code, collection, sc);
        return (collection);

    }

    public static void listCollection(Disk[] collection, Scanner sc, int N) {
        clearScreen();
        System.out.println("***********************");
        System.out.println("*  LISTAR COLECCIÓN   *");
        System.out.println("***********************");
        System.out.println();
        for (int i = 0; i < N; i++) {
            if (collection[i].getAuthor() != null)
                System.out.print(collection[i]);
        }

        System.out.println("\n9: Volver al menú");
        sc.nextInt();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static Disk[] createBase(Disk[] collection) {
        collection[0] = new Disk(
                "Metallica",
                "The black album",
                "Rock",
                63);
        collection[1] = new Disk(
                "The Doors",
                "Riders on the storm",
                "Rock",
                72);
        collection[2] = new Disk(
                "Queen",
                "Bohemian Rhapsody",
                "Rock",
                53);
        collection[3] = new Disk(
                "ACDC",
                "Thunderstruck",
                "Rock",
                58);
        return collection;
    }

    public static Disk[] addDisk(Disk newDisk, Disk[] collection) {
        int i = 0;
        boolean find = false;

        while (i < collection.length && !find) {
            if (collection[i].getAuthor() == null) {
                collection[i] = newDisk;
                find = true;
            }
            i++;
        }
        return collection;
    }

    public static Disk[] deleteDisk(int code, Disk[] collection, Scanner sc) {
        boolean confirm = false;
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].getCode() == code) {
                confirm = confirmDelete(collection[i], sc);
                if (confirm) {
                    collection[i].setAuthor(null);
                    collection[i].setTitle(null);
                    collection[i].setGenre(null);
                    collection[i].setDuration(0);
                }
                ;
            }
        }
        return collection;
    }

    public static boolean confirmDelete(Disk disk, Scanner sc) {
        String res;
        System.out.println("Se va a eliminar el siguiente registro:");
        System.out.println(disk);
        System.out.print("¿Está seguro? (s/n): ");
        res = sc.next();
        if (res.equals("s")||  res.equals("S")) {
            return true;
        } else {
            return false;
        }
    }

}