public class EjArrays4 {
    static int contarIngrediente(String[] pizzas, String ingrediente) {
        int cantidad = 0;
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i].equals(ingrediente)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public static void main(String[] args) {
        String[] ventas = {"queso", "piña", "anchoa", "queso", "piña"};
        String[] busquedas = {"piña", "chocolate"};
        for ( int i = 0; i < busquedas.length; i++) {
            int n = contarIngrediente(ventas, busquedas[i]);
            String texto = "Pizzas con " + busquedas[i] + ": " + n;
            if (n == 0) {
                texto += " (el cocinero se las comió)";
            }
            System.out.println(texto);
        }
    }
    
}
