/**
 * Fraccion.java
 *
 * @version: 13/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public String muestra() {
        return this.numerador + "/" + this.denominador;
    }

    public int getNumerador() {
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public float invierte() {
        return (float) this.denominador / this.numerador;
    }

    public float multiplica(float segundoNumerador, float segundoDenominador) {
        return ((this.numerador * segundoNumerador) / (this.denominador * segundoDenominador));
    }

    public float divide(float segundoNumerador, float segundoDenominador) {
        return ((this.numerador * segundoDenominador) / (this.denominador * segundoNumerador));
    }
}
