/**
 * Pizza.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Pizza {
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    private String kind;
    private String size;
    private String state;

    public Pizza(String kind, String size) {
        this.kind = kind;
        this.size = size;
        this.state = "pedida";
        totalPedidas += 1;
    }

    public String toString() {
        return "pizza " + this.kind + " " + this.size + ", " + this.state;
    }

    public void sirve() {
        if (this.state.equals("servida"))
            System.out.println("esa pizza ya se ha servido");
        else {
            this.state = "servida";
            totalServidas += 1;
        }
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }
}
