/**
 * Lagarto.java PooEjercicio3.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Lagarto extends Animal {
    private String color;

    public Lagarto(String color) {
        this.color = color;
    }

    public void tomaElSol() {
        System.out.println("Que bien se esta aqui, tomando el sol como los lagartos");
    }

    public void reproducete() {
        System.out.println("He puesto un monton de huevos");
    }

    public String getData() {
        return this.color;
    }
}
