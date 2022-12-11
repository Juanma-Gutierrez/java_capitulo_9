/**
 * FichaDomino.java
 *
 * @version: 11/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class FichaDomino {
    private int side1;
    private int side2;

    public FichaDomino(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public String toString() {
        String side1;
        String side2;
        if (this.getSide1() != 0)
            side1 = this.getSide1() + "";
        else
            side1 = " ";
        if (this.getSide2() != 0)
            side2 = this.getSide2() + "";
        else
            side2 = " ";

        return "[" + side1 + "|" + side2 + "]";
    }

    /**
     * getSide1: Devuelve el valor del lado 1 de la ficha de dominó
     *
     * @return valor del lado
     */
    public int getSide1() {
        return this.side1;
    }

    /**
     * setSide1 Asigna un valor al lado 2 de la ficha de dominó
     *
     * @param num Número a asignar a la ficha
     */
    public void setSide1(int num) {
        this.side1 = num;
    }

    /**
     * getSide2: Devuelve el valor del lado 2 de la ficha de dominó
     *
     * @return valor del lado
     */
    public int getSide2() {
        return this.side2;
    }

    /**
     * setSide2 Asigna un valor al lado 2 de la ficha de dominó
     *
     * @param num Número a asignar a la ficha
     */
    public void setSide2(int num) {
        this.side2 = num;
    }

    /**
     * voltea: Rota la ficha de dominó
     *
     * @return ficha rotada
     */
    public FichaDomino voltea() {
        int aux;
        aux = this.getSide1();
        this.setSide1(this.getSide2());
        this.setSide2(aux);
        return this;
    }

    /**
     * encaja: Comprueba si la ficha encaja con la ficha pasada por parámetro
     *
     * @param ficha2 Segunda ficha para comprobar si encajan
     * @return boolean true si encajan, false si no encajan
     */
    public boolean encaja(FichaDomino ficha2) {
        if (this.getSide1() == ficha2.getSide1() || this.side1 == ficha2.getSide2())
            return true;
        if (this.getSide2() == ficha2.getSide1() || this.side2 == ficha2.getSide2())
            return true;
        return false;
    }
}
