public class Calculadora {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Introduce el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número:");
        double num2 = sc.nextDouble();
        System.out.println("Introduce la operación (+, -, *, /):");
        char operacion = sc.next().charAt(0);
        sc.close();
        double resultado = 0;
        switch (operacion) {
            case '+': 
                resultado = num1 + num2;
                break;
            case '-': 
                resultado = num1 - num2;
                break;
            case '*': 
                resultado = num1 * num2;
                break;
            case '/': 
                resultado = num1 / num2;
                break;
            default: 
                System.out.println("Operación no válida");
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}
