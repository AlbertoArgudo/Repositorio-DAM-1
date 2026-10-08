public class Arrays1 {
    static void revisar(String[] nevera) { // método que recibe un array de textos
        if (nevera.length == 0) { // caso límite: array sin elementos
        System.out.println("La nevera está vacía: el gato maúlla con dramatismo."); // aviso dramático
        return; // salimos del método sin recorrer nada
        } // cierra el if
    for (int i = 0; i < nevera.length; i++) { // i va de 0 hasta length-1
    System.out.println((i + 1) + ". " + nevera[i]); // número humano (i+1) y elemento en la posición i
    } // cierra el for
    } // cierra revisar

    public static void main(String[] args) { // punto de entrada del programa
        String[] nevera1 = {"Croquetas", "Sardina caducada", "Calcetín sospechoso"}; // array con 3 elementos
        String[] nevera2 = {}; // array vacío
        System.out.println("Nevera 1:"); // título de la primera revisión
        revisar(nevera1); // revisamos la nevera llena
        System.out.println("Nevera 2:"); // título de la segunda revisión
        revisar(nevera2); // revisamos la nevera vacía
    } // cierra main
}    // cierra la clase

