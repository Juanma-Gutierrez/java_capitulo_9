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

    public Gato() {

    }

    /**
     * toString: muestra todos los datos del gato
     */
    public String toString() {
        String name;
        String sex;
        String breed;
        String favouriteFood;
        String ret;

        name = this.getName();
        sex = this.getSex();
        breed = this.breed;
        favouriteFood = this.favouriteFood;

        ret = "******************\n";
        ret += "* DATOS DEL GATO *\n";
        ret += "******************\n";
        ret += "Nombre: " + name + "\n";
        ret += "Sexo: " + sex + "\n";
        ret += "Raza: " + breed + "\n";
        ret += "Comida favorita: " + favouriteFood + "\n";
        return ret;
    }

    /**
     * setBreed: Asigna el valor breed a breed
     * 
     * @param breed Breed a asignar
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * setFavouriteFood:
     * 
     * @param favouriteFood Comida favorita a asignar
     */
    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    /**
     * tomaComida: Alimenta al gato y éste imprime si le gusta o no la comida
     * 
     * @param food Comida para alimentar al gato
     */
    public void tomaComida(String food) {
        if (food.equals("pescado"))
            System.out.println("Mmmm, me encanta el pescado");
        else
            System.out.println("Puagh, eso no me gusta, quiero pescado");
    }

    /**
     * ronronea: hace que el gato ronronee
     */
    public void ronronea() {
        System.out.println("Grrrrrr");
    }

    /**
     * maulla: hace que el gato maulle
     */
    public void maulla() {
        System.out.println("Miaauuu, miiiiaaauuuuu");
    }

    /**
     * getData: muestra raza y comida favoria del gato
     */
    public String getData() {
        String res = "Raza: " + this.breed + "\nComida favorita: " + this.favouriteFood;
        return res;
    }
}
