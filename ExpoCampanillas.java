/**
 * ExpoCampanillas.java
 *
 * @version: 27/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class ExpoCampanillas extends Zona {
    public ExpoCampanillas(int n) {
        super(n); // Llama a la función padre Zona(n), creando el objeto ExpoCampanillas
    }

    public int getEntradasPorVender() {
        return super.getEntradasPorVender(); // Devolvemos el valor del padre getEntradasPorVender()
    }
}
