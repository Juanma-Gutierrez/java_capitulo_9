
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
            collection[i] = new Disk(i + 1);
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
                menuModifyDisk(collection, sc);
                break;
            case 3:
                menuDeleteDisk(collection, sc);
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

    public static Disk[] menuModifyDisk(Disk[] collection, Scanner sc) {
        int code;
        clearScreen();
        sc.nextLine();
        System.out.println("***********************");
        System.out.println("*   MODIFICAR DISCO   *");
        System.out.println("***********************");
        System.out.println();
        System.out.print("Introduce el código del disco: ");
        code = sc.nextInt();
        collection = modifyDisk(code, collection, sc);
        return (collection);
    }

    public static Disk[] menuDeleteDisk(Disk[] collection, Scanner sc) {
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
        collection[0].setAuthor("Metallica");
        collection[0].setTitle("The black album");
        collection[0].setGenre("Rock");
        collection[0].setDuration(63);

        collection[1].setAuthor("The Doors");
        collection[1].setTitle("Riders on the storm");
        collection[1].setGenre("Rock");
        collection[1].setDuration(72);

        collection[2].setAuthor("Queen");
        collection[2].setTitle("Bohemian Rhapsody");
        collection[2].setGenre("Rock");
        collection[2].setDuration(53);

        collection[3].setAuthor("ACDC");
        collection[3].setTitle("Thunderstruck");
        collection[3].setGenre("Rock");
        collection[3].setDuration(58);

        return collection;
    }

    public static Disk[] addDisk(Disk newDisk, Disk[] collection) {
        int i = 0;
        int code = 0;
        boolean find = false;

        while (i < collection.length && !find) {
            if (collection[i].getAuthor() == null) {
                code = collection[i].getCode();
                collection[i] = newDisk;
                collection[i].setCode(code);
                find = true;
            }
            i++;
        }
        return collection;
    }

    public static Disk[] modifyDisk(int code, Disk[] collection, Scanner sc) {
        boolean confirm = false;
        for (int i = 0; i < collection.length; i++) {
            Disk modifiedDisk = new Disk();
            String author;
            String title;
            String genre;
            int duration;
            if (collection[i].getCode() == code) {
                Disk disk = collection[i];
                System.out.println(disk);
                System.out.println("\nIntroduce las modificaciones que precises:");
                System.out.print("Autor (enter para no modificar): " + disk.getAuthor() + ": ");
                sc.nextLine(); // limpieza del buffer
                author = sc.nextLine();
                if (author == "")
                    author = disk.getAuthor();
                System.out.print("Título (enter para no modificar): " + disk.getTitle() + ": ");
                title = sc.nextLine();
                if (title == "")
                    title = disk.getTitle();
                System.out.print("Género (enter para no modificar): " + disk.getGenre() + ": ");
                genre = sc.nextLine();
                if (genre == "")
                    genre = disk.getGenre();
                System.out.print("Duración: " + disk.getDuration() + ": ");
                duration = sc.nextInt();
                modifiedDisk.setCode(disk.getCode());
                modifiedDisk.setAuthor(author);
                modifiedDisk.setTitle(title);
                modifiedDisk.setGenre(genre);
                modifiedDisk.setDuration(duration);
                confirm = confirm("modificar", modifiedDisk, sc);
                if (confirm)
                    collection[i] = modifiedDisk;
            }
        }
        return collection;
    }

    public static Disk[] deleteDisk(int code, Disk[] collection, Scanner sc) {
        boolean confirm = false;
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].getCode() == code) {
                confirm = confirm("eliminar", collection[i], sc);
                if (confirm) {
                    collection[i].eraseDisk();
                }
                ;
            }
        }
        return collection;
    }

    public static boolean confirm(String process, Disk disk, Scanner sc) {
        String res;
        System.out.println("Se va a " + process + " el siguiente registro:");
        System.out.println(disk);
        System.out.print("¿Está seguro? (s/n): ");
        res = sc.next();
        if (res.equals("s") || res.equals("S")) {
            return true;
        } else {
            return false;
        }
    }
}