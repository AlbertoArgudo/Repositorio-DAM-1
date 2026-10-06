public class Vuelo {
    public static void main(String[] args) {
        String empresa = "Aerolinas del Sur";
        int numeroVuelo = 4412;
        int numeroPlazas = 180;
        int plazasOcupadas = 174;
        double precioBillete = 89.9;
        char puerta = 'D';
        boolean completo = false;
        long kilometrosAvion = 3200000000L;
        System.out.println("== "+ empresa + " ==");
        System.out.println("Vuelo AS-" + numeroVuelo);
        System.out.println("Plazas: " + numeroPlazas +" ocupadas: " + plazasOcupadas);
        System.out.println("Precio base: " + precioBillete + " euros");
        System.out.println("Puerta: " + puerta);
        System.out.println("Completo: " + completo);
        System.out.println("Km del avión: " + kilometrosAvion);
    }
}
