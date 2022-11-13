/**
 * Perro.java PooEjercicio3.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Perro extends Mamifero {
    private String breed;
    private String favouriteFood;

    public Perro(String breed, String favouriteFood) {
        this.breed = breed;
        this.favouriteFood = favouriteFood;
    }

    public void tomaComida(String food) {
        if (food.equals("carne"))
            System.out.println("Mmmm, me encanta la carne");
        else
            System.out.println("Puagh, eso no me gusta, quiero carne");
    }

    public void dameLaPatita() {
        System.out.println("Aquí tienes mi patita");
    }

    public void ladra() {
        System.out.println("Guauuu, guauuu");
    }

    public String getData() {
        String res = "Raza: " + this.breed + "\nComida favorita: " + this.favouriteFood;
        return res;
    }
}
