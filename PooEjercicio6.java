/**
 * PooEjercicio6.java
 *
 * @version: 15/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 */

public class PooEjercicio6 {
    public static void main(String[] arg) {
        // Var declarations
        Tiempo hora1;
        Tiempo hora2;
        Tiempo hora3;
        Tiempo hora4;

        // Var init
        hora1 = new Tiempo(0, 30, 40);
        hora2 = new Tiempo(0, 35, 20);
        hora3 = new Tiempo(5, 25, 10);
        hora4 = new Tiempo(3, 10, 5);

        System.out.println("Hora1: " + hora1);
        System.out.println("Hora2: " + hora2);
        System.out.println("Hora1 + hora2: " + hora1.suma(hora2));

        System.out.println("-------------------------");

        System.out.println("Hora3: " + hora3);
        System.out.println("Hora4: " + hora4);
        System.out.println("Hora3 - hora2: " + hora3.resta(hora4));

    }

}
