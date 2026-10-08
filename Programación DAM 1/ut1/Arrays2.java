public class Arrays2 {
    static void mensaje1(String[] gatos) {
        for (int i = 0; i < gatos.length; i++) { // i va de 0 hasta length-1
            System.out.println((i + 1) + ". " + gatos[i]); // número humano (i+1) y elemento en la posición i
        } // cierra el for
    }
    static void mensaje2(String[] perros) {
        if (perros.length == 0) { // caso límite: array sin elementos
            System.out.println("No hay perros: el gato maúlla con dramatismo."); // aviso dramático
            return; // salimos del método sin recorrer nada
        } // cierra el if
    }
    public static void main(String[] args) {
        String[] gatos = {"Michi", "Garfield", "Tom", "Felix", "Salem"}; // array con 5 elementos
        String[] perros = {}; // array vacío
        System.out.println("Gatos:"); // título de la primera revisión
        mensaje1(gatos);
        System.out.println("Perros:"); // título de la segunda revisión
        mensaje2(perros);


    }
}
