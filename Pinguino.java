/**
 * Pinguino.java PooEjercicio3.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Pinguino extends Ave {
    private String breed;

    public Pinguino(String breed) {
        this.breed = breed;
    }

    public void baila() {
        System.out.println("Tap, tap, tap, mira mis pasos de baile");
    }

    public void nada() {
        System.out.println("¡¡Al agua patos!!");
    }

    public String getData() {
        return this.breed;
    }
}
