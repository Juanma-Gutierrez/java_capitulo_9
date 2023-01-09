/**
 * Exercise: Caballo.java PooEjercicio1.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Caballo {
    private String name;
    private int weight;
    private String sex;
    private String breed;
    private String color;

    public Caballo(String name) {
        this.name = name;
    }

    public void corre() {
        System.out.println("El caballo " + this.name + " está al galope");
    }

    public void para() {
        System.out.println("Sooooo " + this.name + "!!");
    }

    public void come() {
        System.out.println("A " + this.name + " hay que darle de comer " + ((int) this.weight / 20) + " kgs de heno");
    }

    public void salta() {
        System.out.println("¡¡Salta " + this.name + "!!");
    }

    public void setData(int weight, String sex, String breed, String color) {
        this.weight = weight;
        this.sex = sex;
        this.breed = breed;
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        String res = "\n------------------------------------------";
        res += "\nNombre: " + this.name;
        res += "\nPeso:   " + this.weight + " Kg";
        res += "\nSexo:   " + this.sex;
        res += "\nRaza:   " + this.breed;
        res += "\nColor:  " + this.color;
        res += "\n------------------------------------------";
        return res;
    }
}
