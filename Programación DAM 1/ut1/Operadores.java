public class Operadores {
    public static void main(String[] args) {
        // Declara las variables con valores fijos
        double precio = 20.0;

        int cesta = 0;
        int articulos = 0;

        precio -= precio * 0.5;
        cesta += 50;
        articulos++;
        cesta += 30;
        articulos++;
        cesta += 20;
        articulos += 1;

        //Mostrar los resultados por pantalla
        System.out.println("El número de artículos en la cesta es: " + cesta);
        System.out.println("El número de artículos en la cesta es: " + articulos);
        }
}
