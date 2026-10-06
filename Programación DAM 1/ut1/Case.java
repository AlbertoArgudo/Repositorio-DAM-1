public class Case {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        switch (n) {
            case 0,1,2,3,4 -> {
                System.out.println("Suspenso");
                break;
            }
            case 5 -> {
                System.out.println("Aprobado");
                break;
            }   
            case 6 -> {
                System.out.println("Bien");
                break;
            }
            case 7,8 -> {
                System.out.println("Notable");
                break;
            }
            case 9,10 -> {
                System.out.println("Sobresaliente");
                break;
            }
            default -> {
                System.out.println("Nota no válida");
                break;
            }
        }
    }
}
