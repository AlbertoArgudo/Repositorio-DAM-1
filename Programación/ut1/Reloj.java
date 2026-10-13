public class Reloj {
    public static void main(String[] args) {
        // Declara las variables con valores fijos
        int minutos = 500;
        int horas = minutos / 60;


        // Mostrar la hora por pantalla
        System.out.println(minutos + " minutos son " + horas + " horas y " + (minutos % 60) + " minutos.");
    }
}
