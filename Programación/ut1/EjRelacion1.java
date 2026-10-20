public class EjRelacion1 {
    static String etiquetaPrecio(int berries) {
        if (berries < 0) {
            return "ERROR";
        } else if (berries < 50) {
            return "BARATO";
        } else if (berries < 200) {
            return "NORMAL";
        } else {
            return "LUJO";
        }

    }

    public static void main(String[] args) {
        int[] entradas = { -5, 0, 49, 50, 199, 200 };
        String[] esperados = { "ERROR", "BARATO", "BARATO", "NORMAL", "NORMAL",
                "LUJO" };
        for (int i = 0; i < entradas.length; i++) {
            String obtenido = etiquetaPrecio(entradas[i]);
            String veredicto = obtenido.equals(esperados[i]) ? "OK" : "FALLO";
            System.out.println("Caso " + (i + 1) + ": entrada=" + entradas[i] + " esperado=" + esperados[i]
                    + " obtenido=" + obtenido + " -> " + veredicto);
        }
    }
}
