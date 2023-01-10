/**
 * Tiempo.java
 *
 * @version: 10/01/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Tiempo {
    // Var declarations
    private int hour;
    private int minute;
    private int second;

    public Tiempo(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * toString: Imprime el objeto
     * 
     * @return String con el objeto en formato 00h 00m 00s
     */
    @Override
    public String toString() {
        return hour + "h " + minute + "m " + second + "s";
    }

    /**
     * suma: Suma
     *
     * @param tiempo2 Tiempo para sumar a la hora inicial
     * @return Tiempo resultado de la
     */
    public Tiempo suma(Tiempo tiempo2) {
        Tiempo res;
        int hour;
        int minute;
        int second;
        int carry;

        res = new Tiempo(0, 0, 0);
        carry = 0;
        second = this.second + tiempo2.second;
        if (second >= 60) {
            res.second = 60 - second;
            carry = 1;
        } else
            res.second = (second);
        minute = this.minute + tiempo2.minute + carry;
        if (minute >= 60) {
            res.minute = minute - 60;
            carry = 1;
        } else {
            res.minute = minute;
            carry = 0;
        }
        hour = this.hour + tiempo2.hour + carry;
        if (hour >= 24)
            res.hour = hour - 24;
        else
            res.hour = hour;
        return res;
    }

    /**
     * resta: Resta a Tiempo el parámetro tiempo pasado
     *
     * @param tiempo Hora a restar
     * @return Tiempo resultado de la resta
     */
    public Tiempo resta(Tiempo tiempo2) {
        Tiempo res;
        int hour;
        int minute;
        int second;
        int carry;

        res = new Tiempo(0, 0, 0);
        carry = 0;

        second = this.second - tiempo2.second;
        if (second >= 60) {
            res.second = 60 - second;
            carry = 1;
        } else
            res.second = second;
        minute = this.minute - tiempo2.minute + carry;
        if (minute >= 60) {
            res.minute = minute - 60;
            carry = 1;
        } else {
            res.minute = minute;
            carry = 0;
        }
        hour = this.hour - tiempo2.hour + carry;
        if (hour >= 24)
            res.hour = hour - 24;
        else
            res.hour = hour;
        return res;
    }

}
