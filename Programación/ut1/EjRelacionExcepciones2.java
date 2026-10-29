public class EjRelacionExcepciones2 {
    static String bajar(String[] toboganes, int indice) {
        try {
            return "Deslizándose por " + toboganes[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Ese tobogán no existe.";
        } finally {
            System.out.println("Casco guardado.");
        }
    }

    public static void main(String[] args) {
        String[] toboganes = { "rojo", "verde", "amarillo" };
        int[] pedidos = { 2, 7, -3 };
        for (int i = 0; i < pedidos.length; i++) {
            System.out.println(bajar(toboganes, pedidos[i]));
        }
    }
}
