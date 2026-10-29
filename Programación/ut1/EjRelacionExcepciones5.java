public class EjRelacionExcepciones5 {
    static void verificar(boolean condicion, String mensaje) {
        if (!condicion) {
            throw new AssertionError(mensaje);
        }
    }

    static int sumarPuntos(int[] puntos) {
        int suma = 0;
        for (int i = 0; i < puntos.length; i++) {
            verificar(puntos[i] >= 0, "Puntuación negativa en posición " + i);
            suma += puntos[i];
        }
        assert suma >= 0 : "Los puntos totales no pueden ser negativos";
        return suma;
    }

    static void informe(String nombre, int[] puntos) {
        try {
            System.out.println(nombre + ": " + sumarPuntos(puntos) + " puntos");
        } catch (AssertionError e) {
            System.out.println(nombre + ": aserción fallida -> " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        informe("Ronda 1", new int[] { 7, 4, 9 });
        informe("Ronda 2", new int[] { 5, 8, -3, 2 });
        informe("Ronda 3", new int[] {});
    }
}