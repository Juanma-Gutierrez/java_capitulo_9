/**
 * Coche.java PooEjercicio2.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Coche extends Vehiculo {
    private int kmRecorridos = 0;
    private String marca;

    public Coche(String marca) {
        this.marca = marca;
        Vehiculo.setVehiculosCreados();
    }

    /**
     * anda: pone al coche a andar. Esto supone sumar 20km a:
     * kmRecorridos (este coche), kmTotalCoche y kmTotales
     */
    public void anda() {
        System.out.println("El coche " + this.marca + " esta andando (+20km)");
        this.kmRecorridos += 20;
        Vehiculo.setKmTotalCoche(20);
        Vehiculo.setKmTotales(20);
    }

    /**
     * quemaRueda: pone al coche a quemar rueda. Esto supone sumar 5km a:
     * kmRecorridos (este coche), kmTotalCoche y kmTotales

     */
    public void quemaRueda() {
        System.out.println("El coche " + this.marca + " esta quemando rueda (+5km)");
        this.kmRecorridos += 5;
        Vehiculo.setKmTotalCoche(5);
        Vehiculo.setKmTotales(5);
    }

    /**
     * getKmCoche: Devuelve los km recorridos en total en coche
     *
     * @return Km totales recorridos por todos los coches
     */
    public int getKmCoche() {
        return this.kmRecorridos;
    }

}
