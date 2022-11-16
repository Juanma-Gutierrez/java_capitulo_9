/**
 * Tiempo: clase que gestiona el tiempo en horas, minutos y segundos
 *
 * @param hour   Horas
 * @param minute Minutos
 * @param second Segundos
 * @return String con la hora, minutos y segundos indicados
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
    public String toString() {
        return hour + "h " + minute + "m " + second + "s";
    }

    /**
     * suma: Suma
     *
     * @param
     * @return
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
            res.setSegundo(60 - second);
            carry = 1;
        } else {
            res.setSegundo(second);
        }

        minute = this.minute + tiempo2.minute + carry;
        if (minute >= 60) {
            res.setMinuto(minute - 60);
            carry = 1;
        } else {
            res.setMinuto(minute);
            carry = 0;
        }

        hour = this.hour + tiempo2.hour + carry;
        if (hour >= 24) {
            res.setHora(hour - 24);
        } else {
            res.setHora(hour);
        }

        return res;
    }

    /**
     * resta: Resta a Tiempo el parámetro tiempo pasado
     *
     * @param tiempo Objeto tiempo
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
            res.setSegundo(60 - second);
            carry = 1;
        } else {
            res.setSegundo(second);
        }

        minute = this.minute - tiempo2.minute + carry;
        if (minute >= 60) {
            res.setMinuto(minute - 60);
            carry = 1;
        } else {
            res.setMinuto(minute);
            carry = 0;
        }

        hour = this.hour - tiempo2.hour + carry;
        if (hour >= 24) {
            res.setHora(hour - 24);
        } else {
            res.setHora(hour);
        }

        return res;
    }

    /**
     * getHora: Obtiene la hora
     *
     * @return Hora
     */
    public int getHora() {
        return this.hour;
    }

    /**
     * setHora: Asigna el valor a hora
     *
     * @param h Entero con el valor de hora
     */
    public void setHora(int h) {
        this.hour = h;
    }

    /**
     * getMinuto: Obtiene el minuto
     *
     * @return minuto
     */
    public int getMinuto() {
        return this.minute;
    }

    /**
     * setMinuto: Asigna el valor a minuto
     *
     * @param m Entero con el valor de minuto
     */
    public void setMinuto(int m) {
        this.minute = m;
    }

    /**
     * getSegundo: Obtiene el segundo
     *
     * @return Segundo
     */
    public int getSegundo() {
        return this.second;
    }

    /**
     * setSegundo: Asigna el valor a segundo
     *
     * @param h Entero con el valor de segundo
     */
    public void setSegundo(int s) {
        this.second = s;
    }
}
