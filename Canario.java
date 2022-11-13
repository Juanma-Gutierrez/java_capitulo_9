/**
 * Canario.java PooEjercicio3.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Canario extends Ave {
    private String color;
    private String favouriteFood;

    public Canario(String color, String favouriteFood) {
        this.color = color;
        this.favouriteFood = favouriteFood;
    }

    public void vuela() {
        System.out.println(getName() + " esta volando");
    }

    public void canta() {
        System.out.println("Piopiopioooooo  piiipiiipiiipiopiopio");
    }

    public void pia() {
        System.out.println("Pio pio");
    }

    public String getData() {
        String res = "Color: " + this.color + "\nComida favorita: " + this.favouriteFood;
        return res;
    }
}
