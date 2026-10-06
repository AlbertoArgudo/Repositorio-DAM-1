public class Intercambio {
    public static void main(String[] args) {
        char salaManana = 'A';
        char salaTarde = 'C';
        System.out.println("Antes de intercambiar: salaManana = " + salaManana + ", salaTarde = " + salaTarde);
        char temp = salaManana;
        salaManana = salaTarde;
        salaTarde = temp;
        System.out.println("Después de intercambiar: salaManana = " + salaManana + ", salaTarde = " + salaTarde);

    }
}

