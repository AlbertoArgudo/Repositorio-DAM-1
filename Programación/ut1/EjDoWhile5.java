public class EjDoWhile5 {
    static String interpretar(String ladrido) {
        switch (ladrido) {
            case "ceja":
                return "Eso no me lo creo";
            case "bostezo":
                return "Qué aburrimiento";
            case "pulgar":
                return "Todo bajo control";
            case "":
                return "Cara de póker";
            default:
                return "Gesto desconocido";
        }
    }

    public static void main(String[] args) {
        String[] ladridos = { "ceja", "bostezo", "", "baile", "pulgar" };
        for (int i = 0; i < ladridos.length; i++) {
            System.out.println("Gesto '" + ladridos[i] + "' = " + interpretar(ladridos[i]));
        }
    }
}
