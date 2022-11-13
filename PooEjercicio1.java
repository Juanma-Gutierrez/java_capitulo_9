/**
 * Exercise: PooEjercicio1.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 */

public class PooEjercicio1 {
    public static void main(String[] args) {
        // Var declarations
        Caballo bucefalo;
        Caballo rayo;
        Caballo spirit;
        Caballo princesa;

        // Var init
        bucefalo = new Caballo("Bucefalo");
        rayo = new Caballo("Rayo");
        spirit = new Caballo("Spirit");
        princesa = new Caballo("Princesa");

        // Set data
        bucefalo.setData(480, "Macho", "Alano", "Marrón");
        rayo.setData(525, "Macho", "Árabe", "Gris");
        spirit.setData(470, "Macho", "Pura sangre", "Negro");
        princesa.setData(425, "Hembra", "Andaluz", "Blanco");

        // Output results
        System.out.println(bucefalo);
        System.out.println(rayo);
        System.out.println(spirit);
        System.out.println(princesa);

        // Change data
        princesa.setData(445, "Hembra", "Andaluz", "Blanco");
        System.out.println(princesa);

        // Process
        bucefalo.corre();
        bucefalo.para();
        rayo.come();
        princesa.come();
        spirit.salta();

        // Input data
        System.out.println("\nLista de caballos del rancho:");
        System.out.println(bucefalo.getName());
        System.out.println(rayo.getName());
        System.out.println(spirit.getName());
        System.out.println(princesa.getName());
    }
}