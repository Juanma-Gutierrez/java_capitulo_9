/**
 * CuentaCorriente.java
 *
 * @version: 11/12/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class CuentaCorriente {
    private String numCuenta;
    private float saldo;

    public CuentaCorriente() {
        this.numCuenta = "";
        for (int i = 0; i < 10; i++)
            this.numCuenta += (int) (Math.random() * 10);
        this.saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        this.numCuenta = "";
        for (int i = 0; i < 10; i++)
            this.numCuenta += (int) (Math.random() * 10);
        this.saldo = saldo;
    }

    public String toString() {
        return "Número de cta: " + this.numCuenta + " Saldo: " + this.saldo + " Euros";
    }

    /**
     * getSaldo: Devuelve el saldo de la cuenta
     *
     * @return saldo
     */
    public float getSaldo() {
        return this.saldo;
    }

    /**
     * setSaldo: Asigna el parámetro como saldo de la cuenta
     *
     * @param saldo Saldo a asignar en la cuenta
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * ingreso: Ingresa una cantidad en la cuenta
     *
     * @param cantidad Cantidad a ingresar en la cuenta
     */
    public void ingreso(float cantidad) {
        this.saldo += cantidad;
    }

    /**
     * cargo: Carga una cantidad en la cuenta
     *
     * @param cantidad Cantidad a cargar en la cuenta
     */
    public void cargo(float cantidad) {
        this.saldo -= cantidad;
    }

    /**
     * transferencia: Realiza una transferencia de this a la cuenta pasada por
     * parámetro de la cantidad pasada por parámetro
     *
     * @param cuenta   Cuenta destino de la transferencia
     * @param cantidad Cantidad a transferir
     */
    public void transferencia(CuentaCorriente cuenta, float cantidad) {
        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        this.saldo -= cantidad;
    }
}
