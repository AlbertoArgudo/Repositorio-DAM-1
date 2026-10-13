public class EjArrays1 {
    static void mostrar(String[] mochila) {
        for (int i = 0; i < mochila.length; i++) {
            System.out.println((i + 1) + ". " + mochila[i]);
        } 
        if(mochila.length == 0) {
            System.out.println("La mochila está vacía, no hay nada que mostrar");
        } 
    }
    public static void main(String[] args) {
        String[] mochila1 = {"Varita rota", "Bocadillo de dragón", "Calcetín mágico"};
        String[] mochila2 = {};
        System.out.println("Mochila 1:");
        mostrar(mochila1);
        System.out.println("Mochila 2:");
        mostrar(mochila2);
    }
}
