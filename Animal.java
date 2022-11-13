/**
 * Animal.java PooEjercicio3.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Animal {
    private static String name;
    private static String sex;

    public  String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String newSex) {
        sex = newSex;
    }

    public void come() {
        System.out.println(name + " está comiendo");
    }

    public void muestraDatos() {
        System.out.println("Nombre: " + name);
        System.out.println("Sexo: " + sex);
    }
}
