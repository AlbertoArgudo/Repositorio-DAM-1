public class EjRelacion2 {
    static int pruebasTotales = 0;
    static int pruebasFallidas = 0;

    static int sumarIngresos(int[] ingresos) {
        int total = 0;

        for (int i = 0; i < ingresos.length; i++) {
            total += ingresos[i];
        }
        return total;
    }

    static void comprobar(String nombre, int esperado, int obtenido) {
        pruebasTotales++;
        if (esperado == obtenido) {
            System.out.println("[PASA] " + nombre);
        } else {
            pruebasFallidas++;
            System.out.println("[FALLA] " + nombre + " esperado=" + esperado + " obtenido=" + obtenido);
        }
    }

    public static void main(String[] args) {
        comprobar("cuatro ingresos", 100, sumarIngresos(new int[] { 10, 20, 30, 40 }));
        comprobar("un ingreso", 7, sumarIngresos(new int[] { 7 }));
        comprobar("sin ingresos", 0, sumarIngresos(new int[] {})); // caso limite
        comprobar("prueba erronea a proposito", 20 , sumarIngresos(new int[] { 8, 9 }));
        System.out.println("Total: " + pruebasTotales + " Fallidas: " + pruebasFallidas);
    }
}
