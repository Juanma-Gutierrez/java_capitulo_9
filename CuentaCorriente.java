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

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void ingreso(float cantidad) {
        this.saldo += cantidad;
    }

    public void cargo(float cantidad) {
        this.saldo -= cantidad;
    }

    public void transferencia(CuentaCorriente cuenta, float cantidad) {
        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        this.saldo -= cantidad;
    }
}
