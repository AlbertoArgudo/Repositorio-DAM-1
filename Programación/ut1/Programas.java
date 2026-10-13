public class Programas {
    public static void main(String[] args) {  
        int vidas = 3;
        String jugador = "Luna";
        System.out.println(jugador + " tiene " + vidas + " vidas");
        vidas = 2;
        jugador = "Sol";
        System.out.println(jugador + " tiene " + vidas + " vidas");
        System.out.println("vidas");
        double temperatura = 18.5;
        boolean llueve = false;
        System.out.print("Temperatura: ");
        System.out.println(temperatura);
        llueve = true;
        System.out.println("Llueve: " + llueve);
        temperatura = 20.0;
        System.out.println(temperatura + " grados");
    }
}