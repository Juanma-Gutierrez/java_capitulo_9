/**
 * Gato.java PooEjercicio3.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Gato extends Mamifero {
    private String breed;
    private String favouriteFood;

    public Gato(String breed, String favouriteFood) {
        this.breed = breed;
        this.favouriteFood = favouriteFood;
    }

    public void tomaComida(String food) {
        if (food.equals("pescado"))
            System.out.println("Mmmm, me encanta el pescado");
        else
            System.out.println("Puagh, eso no me gusta, quiero pescado");
    }

    public void ronronea() {
        System.out.println("Grrrrrr");
    }

    public void maulla() {
        System.out.println("Miaauuu, miiiiaaauuuuu");
    }

    public String getData() {
        String res = "Raza: " + this.breed + "\nComida favorita: " + this.favouriteFood;
        return res;
    }
}
