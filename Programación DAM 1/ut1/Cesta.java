public class Cesta {
    public static void main(String[] args) {
        // Declara las variables con valores fijos
        int articulos = 3;
        double subtotal = 47.0;
        double descuento = subtotal * 0.1;
        double base = subtotal - descuento;
        double iva = base * 0.21;
        double total = base + iva;
        
        System.out.println("Articulos: " + articulos);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Base: " + base);
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + (total));
    }
}
