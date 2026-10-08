public class Arrays4 {
    static void realizarprueba(String prueba) {
        System.out.println("Preparamos la prueba");
        if(prueba != ""){
            System.out.println(prueba);
        } else {
            System.out.println("denunciamos");
            return;
        }
        System.out.println("realizamos la prueba");
        System.out.println("Podio");
    }


    public static void main(String[] args) {
        String prueba1 = "Salto de Longitud";
        String prueba2 = "Salto de Altura";
        String prueba3 = "Salto con pértiga";
        String prueba4 = "";
        realizarprueba(prueba1);
        realizarprueba(prueba2);
        realizarprueba(prueba3);
        realizarprueba(prueba4);
        
    }
}