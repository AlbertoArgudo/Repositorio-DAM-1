public class EjArrays3 {
    static void despedir(String[] despedida) {
        for (int i = despedida.length - 1; i >= 0; i--) {
            System.out.println("Frase " + (i + 1) + ": " + despedida[i]);
        }
        System.out.println("Total de frases: " + despedida.length);
    }
    public static void main(String[] args) {
        String[] jueves = {"Mi batería murió de risa", "Un hámster usó mi cargador", "Me confundí con una tostadora"};
        String[] viernes = {};
        System.out.println("Jueves:");
        despedir(jueves);
        System.out.println("Viernes:");
        despedir(viernes);
    }
}
