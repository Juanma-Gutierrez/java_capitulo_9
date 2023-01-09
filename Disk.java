/**
 * Disk.java
 *
 * @version: 24/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Disk {
    private int code;
    private String author;
    private String title;
    private String genre;
    private int duration;

    public Disk() {
    }

    public Disk(int code) {
        this.code = code;
    }

    public Disk(String author, String title, String genre, int duration) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    @Override
    public String toString() {
        String res;
        res = "  Código: " + this.code + "\n";
        res += "  Autor: " + this.author + "\n";
        res += "  Título: " + this.title + "\n";
        res += "  Género: " + this.genre + "\n";
        res += "  Duración: " + this.duration + " minutos\n";
        res += "*******************************\n";
        return res;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public void eraseDisk() {
        this.setAuthor(null);
        this.setTitle(null);
        this.setGenre(null);
        this.setDuration(0);
    }

}
