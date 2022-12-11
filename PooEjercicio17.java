/**
 * PooEjercicio17.java
 *
 * @version: 11/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Implementa las clases Piramide y Rectangulo. Sobre una pirámide se debe saber
 * su altura y sobre un rectángulo se debe saber tanto la base como la altura.
 * Cada una de las clases debe tener un atributo de clase (static) que lleve la
 * cuenta de las pirámides y de los rectángulos creados respectivamente. El
 * siguiente código que va dentro del main genera la salida que se indica.
 * 
 * Programa principal:
 * Piramide p = new Piramide(4);
 * Rectangulo r1 = new Rectangulo(4, 3);
 * Rectangulo r2 = new Rectangulo(6, 2);
 * System.out.println(p);
 * System.out.println(r1);
 * System.out.println(r2);
 * System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
 * System.out.println("Rectángulos creados: " +
 * Rectangulo.getRectangulosCreados());
 * Salida:
 * 
 * ___X
 * __XXX
 * _XXXXX
 * XXXXXXX
 * 
 * XXXX
 * XXXX
 * XXXX
 * 
 * XXXXXX
 * XXXXXX
 * 
 * Pirámides creadas: 1
 * Rectángulos creados: 2
 */

public class PooEjercicio17 {
    public static void main(String[] args) {
        Piramide p = new Piramide(4);
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
        System.out.println("Rectángulos creados: " +
                Rectangulo.getRectangulosCreados());
    }
}
