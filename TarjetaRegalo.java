
/**
 * TarjetaRegalo.java
 *
 * @version: 09/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.text.DecimalFormat;

public class TarjetaRegalo {
    private double saldo;
    private int num;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.num = (int) (Math.random() * 90000) + 10000;
    }

    /**
     * getSaldo: devuelve el saldo de la tarjeta
     *
     * @return Saldo
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * setSaldo: Asigna un valor a saldo
     *
     * @param saldo Saldo a asignar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * toString Devuelve la cadena de texto indicando número de tarjeta y saldo
     * disponible
     *
     * @return "Tarjeta nº xxxxx - Saldo xxx,xxe"
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String res = "Tarjeta nº " + num + " - Saldo " + df.format(saldo) + "e";
        return res;
    }

    /**
     * gasta Realiza gasto sobre la tarjeta
     *
     * @param gasto Cantidad a gastar. Si la cantidad es mayor al saldo, mostrará
     *              una advertencia y no descontará el gasto.
     */
    public void gasta(double gasto) {
        if (this.saldo >= gasto) {
            this.saldo -= gasto;
        } else {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("No tiene suficiente saldo para gastar " + df.format(gasto) + "e");
        }
    }

    /**
     * fusionaCon Fusiona dos tarjetas en una, sumando el saldo de ambas en la nueva
     * tarjeta y eliminando el saldo de las dos tarjetas inciales
     *
     * @param t2 Tarjeta con la que se va a fusionar
     * @return t3 Nueva TarjetaRegalo
     */
    public TarjetaRegalo fusionaCon(TarjetaRegalo t2) {
        TarjetaRegalo t3 = new TarjetaRegalo(this.getSaldo() + t2.getSaldo());
        this.setSaldo(0);
        t2.setSaldo(0);
        return t3;
    }
}
