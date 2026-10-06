public class liga {
    public static void main(String[] args) {
        int puntos = 58;
        if (puntos > 114 || puntos < 0) {
            System.out.println("Puntos no válidos");
        } 
        else if (puntos >= 78) {
            System.out.println("Campeones");
        } 
        else if (puntos >= 66) {
            System.out.println("Champions League");
        }
        else if (puntos >= 55) {
            System.out.println("Europa League");
        } 
        else if (puntos >= 40) {
            System.out.println("Nos quedamos");
        }
        else {
            System.out.println("Descenso");
        }
    }
}