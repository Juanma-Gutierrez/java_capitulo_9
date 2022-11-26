/**
 * PooEjercicio7.java
 *
 * @version: 26/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas
 * disponibles, la zona de compra-venta con 200 entradas disponibles y la zona
 * vip con 25 entradas disponibles. Hay que controlar que existen entradas antes
 * de venderlas. La clase Zona con sus atributos y métodos se muestra a
 * continuación:
 *
 * public class Zona {
 * private int entradasPorVender;
 * public Zona(int n){
 * entradasPorVender = n;
 * }
 * public int getEntradasPorVender() {
 * return entradasPorVender;
 * }
 *
 * public void vender(int n){
 * if (this.entradasPorVender == 0){
 * System.out.println("Lo siento, las entradas para esa zona están agotadas.");
 * }else if (this.entradasPorVender < n){
 * System.out.println("Sólo me quedan " + this.entradasPorVender +
 * " entradas para esa zona.");
 * }
 * if(this.entradasPorVender >= n){
 * entradasPorVender -= n;
 * System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
 * }}}
 *
 * El menú del programa debe ser el que se muestra a continuación.Cuando
 * elegimos la opción 2,se nos debe preguntar para qué zona queremos las
 * entradas y cuántas queremos. Lógicamente,el programa debe controlar que no se
 * puedan vender más entradas de la cuenta.
 *
 * 1. Mostrar número de entradas libres
 * 2. Vender entradas
 * 3. Salir
 *
 */

import java.util.Scanner;

public class PooEjercicio7 {
    public static void main(String[] args) {
        // Var declarations
        int opt;
        int opt2;
        int numEntradas;
        Zona salaPrincipal;
        Zona salaCompraVenta;
        Zona salaVip;

        // Var init
        salaPrincipal = new SalaPrincipal(1000);
        salaCompraVenta = new SalaPrincipal(200);
        salaVip = new SalaPrincipal(25);

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        do {
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.printf("--------------------------------\n");
                    System.out.println("El número de entradas libres es:");
                    System.out.printf("--------------------------------\n");
                    System.out.printf("Sala Principal:             %4d\n", salaPrincipal.getEntradasPorVender());
                    System.out.printf("Sala Compra-Venta:          %4d\n", salaCompraVenta.getEntradasPorVender());
                    System.out.printf("Sala Vip:                   %4d\n", salaVip.getEntradasPorVender());
                    System.out.printf("--------------------------------\n");
                    System.out.printf("Total entradas disponibles: %4d\n", (salaPrincipal.getEntradasPorVender()
                            + salaCompraVenta.getEntradasPorVender() + salaVip.getEntradasPorVender()));
                    System.out.println();
                    break;
                case 2:
                    System.out.print("¿Cuántas entradas vas a querer?: ");
                    numEntradas = sc.nextInt();
                    do {
                        System.out.println("¿Para qué zona quieres las entradas?");
                        System.out.printf("1. Sala Principal (%d)\n", salaPrincipal.getEntradasPorVender());
                        System.out.printf("2. Compra-Venta (%d)\n", salaCompraVenta.getEntradasPorVender());
                        System.out.printf("3. Vip (%d)\n", salaVip.getEntradasPorVender());
                        opt2 = sc.nextInt();
                    } while (opt2 < 1 && opt2 > 3);
                    switch (opt2) {
                        case 1:
                            salaPrincipal.vender(numEntradas);
                            break;
                        case 2:
                            salaCompraVenta.vender(numEntradas);
                            break;
                        case 3:
                            salaVip.vender(numEntradas);
                            break;
                    }
            }
        } while (opt != 3);

        // Close scanner
        sc.close();
    }

}
