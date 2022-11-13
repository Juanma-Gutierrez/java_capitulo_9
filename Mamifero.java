/**
 * Mamifero.java PooEjercicio3.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Mamifero extends Animal {
    public void corre() {
        System.out.println(getName() + " esta corriendo");
    }

    public void salta() {
        System.out.println(getName() + " esta saltando");
    }

    public void duerme() {
        System.out.println(getName() + " esta durmiendo");
    }

}
