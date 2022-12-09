/**
 * Libro.java
 *
 * @version: 09/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Libro extends Publicacion implements Prestable {
    private boolean prestado = false;

    public Libro() {
        this.prestado = false;
    }

    public Libro(String isbn, String titulo, int anyo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anyo = anyo;
        this.prestado = false;
    }

    @Override
    public String toString() {
        return super.toString() + (estaPrestado() ? " (prestado)" : " (No prestado)");
    }

    /**
     * presta Si no está prestado, presta el libro. Si está prestado, muestra
     * mensaje de aviso.
     */
    @Override
    public void presta() {
        if (this.prestado)
            System.out.println("Lo siento, ese libro ya está prestado.");
        else
            this.prestado = true;
    }

    /**
     * devuelve Realiza la devolución del libro.
     */
    @Override
    public void devuelve() {
        this.prestado = false;
    }

    /**
     * Función que realiza
     *
     * @param
     * @return
     */
    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }
}