public class EjRelacion3 {
    public static void main(String[] args) {
        int[] horas = {4, 6, 3, 7, 2}; 
        int total = 0; 
        for (int dia = 0; dia < horas.length; dia++) {
            System.out.println("[TRAZA] dia=" + dia + " antes total=" + total);
            total += horas[dia]; 
            System.out.println("[TRAZA] dia=" + dia + " despues total=" + total);
            if (total > 12) {
                System.out.println("[BREAKPOINT] total=" + total + " supera 15 en dia " + dia);
                total = 12; 
                System.out.println("[WATCH] total corregido a " + total);
            }
        }
        System.out.println("Total final: " + total);
    }
}

