public class Comparaciones {
    public static void main(String[] args) {
        int edad = 17;
        int  entradas = 2;
        double saldo = 30.0;
        boolean socio = true;
        boolean a = false;
        boolean b = false;
        boolean ok = entradas != 0 && 100 / entradas > 20;

    

        System.out.println("El usuario es mayor de edad: " + (a || b));
        System.out.println("El usuario tiene saldo suficiente: " + (saldo >= 25.0));
        System.out.println("El usuario es socio: " + socio);
        System.out.println("El usuario tiene entradas: " + (entradas > 0));
        System.out.println("El usuario cumple con los criterios: " + ok);   
        System.out.println("El usuario es mayor de edad y tiene saldo suficiente: " + (edad >= 18 && saldo >= 25.0));
    }
}
