/**
 * Bicicleta.java PooEjercicio2.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Bicicleta extends Vehiculo {
    private int kmRecorridos = 0;
    private String marca;

    public Bicicleta(String marca) {
        this.marca = marca;
        Vehiculo.setVehiculosCreados();
    }

    /**
     * anda: Pone a la bicicleta a andar. Esto supone sumar 10km a:
     * kmRecorridos (esta bicicleta), kmTotalBicicleta y kmTotales
     */
    public void anda() {
        System.out.println("La bicicleta " + this.marca + " esta andando (+10km)");
        this.kmRecorridos += 10; // Añade 10km a esta bicicleta
        Vehiculo.setKmTotalBicicleta(10); // Añade 10km a kmBicicleta
        Vehiculo.setKmTotales(10); // Añade 10km a kmTotales
    }

    /**
     * hazElCaballito: Hace el caballito con la bicicleta. Supone sumar 2km a:
     * kmRecorridos (esta bicicleta), kmTotalBicicleta y kmTotales
     */
    public void hazElCaballito() {
        System.out.println("La bicicleta " + this.marca + " esta haciendo el caballito (+2km)");
        this.kmRecorridos += 2; // Añade 2km a esta bicicleta
        Vehiculo.setKmTotalBicicleta(2); // Añade 2km a kmBicicleta
        Vehiculo.setKmTotales(2); // Añade 2km a kmTotales
    }

    /**
     * getKmBicicleta: Devuelve los km recorridos en total en bicicleta
     *
     * @return Km totales recorridos por todas las bicicletas
     */
    public int getKmBicicleta() {
        return this.kmRecorridos;
    }
}
