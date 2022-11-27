public class Terminal {
    private String num;
    private int seconds;

    public Terminal(String num) {
        this.num = num;
        this.seconds = 0;
    };

    @Override
    public String toString() {
        return "Nº " + this.getNumber() + " - " + this.getSeconds() + "s de conversación";
    }

    public String getNumber() {
        return num;
    }

    public int getSeconds() {
        return seconds;
    }

    /**
     * llama: Registra la llamada entre dos teléfonos
     *
     * @param tel     Teléfono al que llama
     * @param seconds Segundos que ha durado la llamada entre los dos teléfonos
     */
    public void llama(Terminal tel, int seconds) {
        this.seconds += seconds;
        tel.seconds += seconds;
    }
}
