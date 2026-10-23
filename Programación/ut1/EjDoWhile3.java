public class EjDoWhile3 {
    static void registrar(String[] bolsillos, String objetivo) {
        int pos = -1;
        for (int i = 0; i < bolsillos.length; i++) {
            System.out.println("Registrando: " + bolsillos[i]);
            if (bolsillos[i].equals(objetivo)) {
                pos = i;
                break;
            }
        }
        if (pos >= 0) {
            System.out.println("¡Llaves encontradas en " + objetivo + " (posición " + pos + ")!");
        } else {
            System.out.println(" Las llaves siguen perdidas tras registrar " + bolsillos.length + " bolsillos.");
        }
    }

    public static void main(String[] args) {
        String[] bolsillos = { "abrigo", "pantalón", "mochila", "zapato", "gorro"};
        System.out.println("Registro 1:");
        registrar(bolsillos, "mochila");
        System.out.println("Búsqueda 2:");
        registrar(bolsillos, "cartera");
    }
}
