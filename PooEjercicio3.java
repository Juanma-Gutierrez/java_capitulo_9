/**
 * PooEjercicio3.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/*
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefine
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un
 * programa en el que se instancien objetos y se les apliquen métodos.
 */
public class PooEjercicio3 {
    public static void main(String[] args) {
        Perro lassie;
        Gato silvestre;
        Lagarto guancho;
        Pinguino kowalski;
        Canario piolin;

        lassie = new Perro("Collie", "Carne");
        silvestre = new Gato("Minino", "Canarios");
        guancho = new Lagarto("Marron");
        kowalski = new Pinguino("Pescado");
        piolin = new Canario("Amarillo", "Alpiste");

        // Process

        // ************* PERRO *************
        // de la clase Perro
        System.out.println("\n----- Clase perro -----");
        lassie.dameLaPatita();
        lassie.ladra();
        System.out.println(lassie.getData());

        // de la clase Mamifero
        System.out.println("----- Clase Mamífero -----");
        lassie.setName("Lassie");
        lassie.corre();
        lassie.salta();
        lassie.duerme();

        // de la clase Animal
        System.out.println("----- Clase Animal -----");
        lassie.setName("Lassie*");
        System.out.println("Método getName: " + lassie.getName());
        lassie.setSex("Hembra");
        lassie.muestraDatos();
        lassie.come();
        System.out.println("-------------------------\n");

        // ************* GATO *************
        // de la clase Gato
        System.out.println("\n----- Clase gato -----");
        silvestre.tomaComida("carne");
        silvestre.tomaComida("pescado");
        silvestre.ronronea();
        silvestre.maulla();
        System.out.println(silvestre.getData());

        // de la clase Mamifero
        System.out.println("----- Clase Mamífero -----");
        silvestre.setName("Silvestre");
        silvestre.corre();
        silvestre.salta();
        silvestre.duerme();

        // de la clase Animal
        System.out.println("----- Clase Animal -----");
        silvestre.setName("Silvestre*");
        System.out.println("Método getName: " + silvestre.getName());
        silvestre.setSex("Macho");
        silvestre.muestraDatos();
        silvestre.come();
        System.out.println("-------------------------\n");

        // ************* CANARIO *************
        // de la clase Canario
        System.out.println("\n----- Clase Canario -----");
        piolin.canta();
        piolin.pia();
        System.out.println(piolin.getData());
        piolin.setName("Piolin");
        piolin.vuela();

        // de la clase Ave
        System.out.println("----- Clase Ave -----");
        piolin.corre();
        piolin.ponHuevo();
        piolin.duerme();

        // de la clase Animal
        System.out.println("----- Clase Animal -----");
        piolin.setName("Piolin*");
        System.out.println("Método getName: " + piolin.getName());
        piolin.setSex("Macho");
        piolin.muestraDatos();
        piolin.come();
        System.out.println("-------------------------\n");

        // ************* PINGÜINO *************
        // de la clase Pingüino
        System.out.println("\n----- Clase Pingüino -----");
        kowalski.baila();
        kowalski.nada();
        System.out.println("Comida favorita: " + kowalski.getData());

        // de la clase Ave
        System.out.println("----- Clase Ave -----");
        kowalski.setName("Kowalski");
        kowalski.corre();
        kowalski.ponHuevo();
        kowalski.duerme();

        // de la clase Animal
        System.out.println("----- Clase Animal -----");
        kowalski.setName("Kowalski*");
        System.out.println("Método getName: " + kowalski.getName());
        kowalski.setSex("Macho");
        kowalski.muestraDatos();
        kowalski.come();
        System.out.println("-------------------------\n");

        // ************* LAGARTO *************
        // de la clase Lagarto
        System.out.println("\n----- Clase Lagarto -----");
        guancho.tomaElSol();
        guancho.reproducete();
        System.out.println("Comida favorita: " + guancho.getData());

        // de la clase Animal
        System.out.println("----- Clase Animal -----");
        guancho.setName("Guancho");
        System.out.println("Método getName: " + guancho.getName());
        guancho.setSex("Macho");
        guancho.muestraDatos();
        guancho.come();
        System.out.println("-------------------------\n");
    }
}
