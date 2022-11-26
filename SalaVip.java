/**
 * SalaVip.java
 *
 * @version: 26/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class SalaVip extends Zona {

    public SalaVip(int n) {
        super(n);
    }

    public int getEntradasPorVender() {
        return super.getEntradasPorVender(); // Devolvemos el valor del padre getEntradasPorVender()
    }
}
