/**
 * Publicacion.java
 *
 * @version: 09/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public abstract class Publicacion {
    String isbn;
    String titulo;
    int anyo;

    @Override
    public String toString() {
        return "ISBN: " + this.isbn + ", título: " + this.titulo + ", año de publicación: " + this.anyo;
    }
}
