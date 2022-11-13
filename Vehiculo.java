/**
 * Vehiculo.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public abstract class Vehiculo {
    // Class attributes
    private static int vehiculosCreados = 0;
    private static int kmTotales = 0;
    private static int kmBicicleta = 0;
    private static int kmCoche = 0;

    public static int getVehiculosCreados() { // Pide los vehículos creados
        return vehiculosCreados; // Devuelve el número de vehículos creados
    }

    public static void setVehiculosCreados() { // Crea nuevo vehículo
        vehiculosCreados += 1; // Añade 1 a vehiculosCreados
    }

    public static int getKmTotales() { // Pide kilometros totales
        return kmTotales; // Devuelve kmTotales
    }

    public static void setKmTotales(int km) { // Añade km
        kmTotales += km; // Añade km a kmTotales
    }

    public static int getKmTotalBicicleta() { // Pide kmBicicleta
        return kmBicicleta; // Devuelve kmBicicleta
    }

    public static void setKmTotalBicicleta(int km) { // Añade km
        kmBicicleta += km; // Añade km a kmBicicleta
    }

    public static int getKmTotalCoche() { // Pide kmCoche
        return kmCoche; // Devuelve kmCoche
    }

    public static void setKmTotalCoche(int km) { // Añade km
        kmCoche += km; // Añade km a kmCoche
    }

}