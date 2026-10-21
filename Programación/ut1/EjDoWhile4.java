public class EjDoWhile4 {
    static void servir(String[] lista) {
        int servidos = 0;
        int escondidos = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals("brócoli")) {
                escondidos++;
                continue;
            }
            System.out.println("Servido: " + lista[i]);
            servidos++;
        }
        if (servidos == 0) {
            System.out.println("Mesa vacía: solo había brócoli.");
        }
        System.out.println("Brócolis escondidos: " + escondidos);
    }

    public static void main(String[] args) {
        String[] lista1 = { "brócoli", "tarta", "brócoli", "refresco", "brócoli" };
        String[] lista2 = { "brócoli", "brócoli" };
        System.out.println("Menu 1:");
        servir(lista1);
        System.out.println("Menu 2:");
        servir(lista2);
    }
}
