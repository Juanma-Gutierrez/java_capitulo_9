import java.text.DecimalFormat;

public class Movil extends Terminal {
    private String rate;
    private double cost;
    private int secondsCalling;

    public Movil(String num, String rate) {
        super(num);
        switch (rate) {
            case "rata":
                this.cost = 0.06;
                break;
            case "mono":
                this.cost = 0.12;
                break;
            case "bisonte":
                this.cost = 0.30;
                break;
        }
        secondsCalling = 0;
    }

    public double getCost() {
        return this.cost;
    }

    public String getRate() {
        return this.rate;
    }

    public int getSecondsCalling() {
        return this.secondsCalling;
    }

    /**
     * calculateCost: Devuelve el cálculo de lo que ha gastado en llamadas
     *
     * @param
     * @return
     */
    public double calculateCost() {
        double imp = (double) this.getSecondsCalling() / 60 * this.getCost() * 100;
        imp = (double) Math.round(imp) / 100;
        return imp;
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nº " + this.getNumber() + " - " + this.getSeconds() + "s de conversación - tarificados "
                + formatoEuros.format(this.calculateCost()) + " euros";
    }

    @Override
    public void llama(Terminal tel, int seconds) {
        super.llama(tel, seconds);
        this.secondsCalling += seconds;
    }
}
