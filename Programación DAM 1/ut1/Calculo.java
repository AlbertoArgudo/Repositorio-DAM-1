public class Calculo {
    
    public static void main(String[] args) {
        int precio = 100;
        double descuento = precio * 0.1;
        double descuentoAplicado = precio - descuento;
        double iva = descuentoAplicado * 0.21;
        double total = descuentoAplicado + iva;

        System.out.println("Total: " + total);
    }
}
