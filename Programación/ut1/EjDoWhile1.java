public class EjDoWhile1 {
    static void cargar(int faltante) {
        int tanda = 0;
        while (faltante > 0) {
            tanda++;
            faltante -= 20;
            System.out.println("Tanda " + tanda + ": falta " + faltante + "%");
        }
        if (tanda == 0) {
            System.out.println("Ya estaba milagro, qué milagro.");
        } else {
            System.out.println("Movil cargado en " + tanda + " tandas.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Miercoles:");
        cargar(60);
        System.out.println("Jueves:");
        cargar(0);
    }
}
