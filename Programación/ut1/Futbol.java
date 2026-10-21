public class Futbol {
    static void imprimirresultados(int victorias,int empates,int derrotas) {
        while(victorias > 0)  {
            System.out.println("Ha ganado un partido");
            victorias--;
        }
        while(empates > 0) {
            System.out.println("Ha empatado un partido");
            empates--;
        }
        while(derrotas > 0) {
            System.out.println("Ha perdido un partido");
            derrotas--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Vamos a imprimir los resulatados de la Siestecilla Española");
        imprimirresultados(3,3,4);  
        System.out.println("Vamos a imprimir los resultados de la liga del mundo de La Premier League");
        imprimirresultados(9, 1, 0);
    }
}
