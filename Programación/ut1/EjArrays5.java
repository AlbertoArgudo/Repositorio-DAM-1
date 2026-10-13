public class EjArrays5 {
    static void criar(int n) {
        if (n <= 0) {
            System.out.println("No hay ladridos que criar.");
            return;
        }
        int[] ladridos = new int[n];
        for (int i = 0; i < ladridos.length; i++) {
            ladridos[i] = i + 1;
        }
        for (int i = 0; i < ladridos.length; i++) {
            String ladrido = "";
            for (int j = 0; j < ladridos[i]; j++) {
                ladrido += "Guau ";
            }
            System.out.println("Ladrido " + (i + 1) + ": " + ladrido);
        }
    }
    public static void main(String[] args) {
        System.out.println("Pedido A: ");
        criar(3);
        System.out.println("Pedido B: ");
        criar(-2);
    }
}
