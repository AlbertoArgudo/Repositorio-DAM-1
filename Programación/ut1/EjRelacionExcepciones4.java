class HeladoAgotadoException extends RuntimeException {
    private final int sabor;

    HeladoAgotadoException(int sabor) {
        super("Sabor agotado");
        this.sabor = sabor;
    }

    int getSabor() {
        return sabor;
    }
}

public class EjRelacionExcepciones4 {
    static void servir(int[] stock, int sabor) {
        if (stock[sabor] == 0) {
            throw new HeladoAgotadoException(sabor);
        }
        stock[sabor]--;
    }

    public static void main(String[] args) {
        String[] nombres = { "vainilla", "limón" };
        int[] stock = { 1, 2 };
        int[] peticiones = { 1, 0, 0, 1, 1 };
        int intento = 0;
        while (intento < peticiones.length) {
            int sabor = peticiones[intento];
            try {
                servir(stock, sabor);
                System.out.println("Petición " + (intento + 1) + ": helado de " + nombres[sabor] + " servido (quedan "
                        + stock[sabor] + ")");
            } catch (HeladoAgotadoException e) {
                System.out.println("Petición " + (intento + 1) + ": sabor " + nombres[e.getSabor()] + " agotado");
            } finally {
                intento++;
            }
        }
    }
}
