
/**
 * PooEjercicioArrays4.java
 *
 * @version: 25/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class PooEjercicioArrays4 {
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
        clearScreen();
        sc.nextLine();
        System.out.println("***********************");
        System.out.println("*     CREAR DISCO     *");
        System.out.println("***********************");
        addDisk(collection, sc);
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
        int option;
        boolean find = false;
        clearScreen();
        System.out.println("**************************");
        System.out.println("*    LISTAR COLECCIÓN    *");
        System.out.println("**************************");
        System.out.println("* 1. Listado completo    *");
        System.out.println("* 2. Listar por autor    *");
        System.out.println("* 3. Listar por género   *");
        System.out.println("* 4. Listar por duración *");
        System.out.println("*                        *");
        System.out.println("* 9. Salir               *");
        System.out.println("**************************");
        option = sc.nextInt();
        switch (option) {
            case 1:
                clearScreen();
                for (int i = 0; i < N; i++)
                    if (collection[i].getAuthor() != null)
                        System.out.print(collection[i]);
                sc.nextLine();
                pause("", sc);
                break;
            case 2:
                String author;
                System.out.print("Introduce el autor: ");
                sc.nextLine();
                author = sc.nextLine();
                clearScreen();
                for (int i = 0; i < N; i++)
                    if (collection[i].getAuthor() != null && collection[i].getAuthor().equals(author)) {
                        System.out.print(collection[i]);
                        find = true;
                    }
                if (find)
                    pause("", sc);
                else
                    pause("No se ha encontrado ningún disco de: " + author, sc);
                break;
            case 3:
                String genre;
                find = false;
                System.out.print("Introduce el género: ");
                sc.nextLine();
                genre = sc.nextLine();
                clearScreen();
                for (int i = 0; i < N; i++)
                    if (collection[i].getGenre() != null && collection[i].getGenre().equals(genre)) {
                        System.out.print(collection[i]);
                        find = true;
                    }
                if (find)
                    pause("", sc);
                else
                    pause("No se ha encontrado ningún disco del género: " + genre, sc);
                break;
            case 4:
                int min;
                int max;
                find = false;
                sc.nextLine();
                System.out.print("Introduce la duración mínima: ");
                min = sc.nextInt();
                System.out.print("Introduce la duración máxima: ");
                max = sc.nextInt();
                clearScreen();
                for (int i = 0; i < N; i++)
                    if (collection[i].getDuration() >= min && collection[i].getDuration() <= max) {
                        System.out.print(collection[i]);
                        find = true;
                    }
                sc.nextLine();
                if (find)
                    pause("", sc);
                else {
                    pause("No se ha encontrado ningún disco en ese rango de duración.", sc);
                }
                break;
        }
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

    public static Disk[] addDisk(Disk[] collection, Scanner sc) {
        int i = 0;
        boolean find = false;

        while (i < collection.length && !find) {
            if (collection[i].getAuthor() == null) {
                System.out.println();
                System.out.print("Introduce el autor del disco: ");
                collection[i].setAuthor(sc.nextLine());
                System.out.print("Introduce el título del disco: ");
                collection[i].setTitle(sc.nextLine());
                System.out.print("Introduce el género del disco: ");
                collection[i].setGenre(sc.nextLine());
                System.out.print("Introduce la duración del disco: ");
                collection[i].setDuration(sc.nextInt());
                find = true;
                sc.nextLine();
                pause("Disco grabado correctamente", sc);
            }
            i++;
        }
        if (!find)
            pause("La base de datos está completa, por favor, elimine alguno de los registros para introducir un nuevo disco",
                    sc);
        return collection;
    }

    public static Disk[] modifyDisk(int code, Disk[] collection, Scanner sc) {
        boolean find = false;
        boolean confirm = false;
        for (int i = 0; i < collection.length; i++) {
            Disk modifiedDisk = new Disk();
            String author;
            String title;
            String genre;
            int duration;
            if (collection[i].getCode() == code) {
                find = true;
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
                if (confirm) {
                    collection[i] = modifiedDisk;
                    sc.nextLine();
                    pause("Modificación realizada correctamente", sc);
                } else {
                    sc.nextLine();
                    pause("Modificación cancelada", sc);
                }
            }
        }
        if (!find) {
            sc.nextLine();
            pause("No se ha encontrado el disco con el código indicado", sc);
        }
        return collection;

    }

    public static Disk[] deleteDisk(int code, Disk[] collection, Scanner sc) {
        boolean confirm = false;
        boolean find = false;
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].getCode() == code && collection[i].getAuthor() != null) {
                find = true;
                confirm = confirm("eliminar", collection[i], sc);
                if (confirm) {
                    collection[i].eraseDisk();
                    sc.nextLine();
                    pause("Disco eliminado correctamente", sc);
                } else {
                    sc.nextLine();
                    pause("Eliminación de disco cancelada", sc);
                }
            }
        }
        if (!find) {
            sc.nextLine();
            pause("No se ha encontrado el registro indicado", sc);
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