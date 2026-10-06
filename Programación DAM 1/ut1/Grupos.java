public class Grupos {
    public static void main(String[] args) {
        // Declara las variables con valores fijos
        int grupos = 30;
        int equipos = 4;
        

        int equipos_completos = grupos / equipos;
        int gente_restantes = grupos % equipos;
        
        //Mostrar los resultados por pantalla
        System.out.println("El número de equipos completos es: " + equipos_completos);
        System.out.println("El número de gente restante es: " + gente_restantes);
    }
}
