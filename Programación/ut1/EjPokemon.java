class Pokemon {
    String nombredelaclase;
    int nivel;

    Pokemon(String nombrequelepaso, int nivelquelepaso) {
        this.nombredelaclase = nombrequelepaso;
        this.nivel = nivelquelepaso;
    }
}

public class EjPokemon {
    public static void main(String[] args) {
        Pokemon pikachudeash = new Pokemon("Pikachu", 60);
        Pokemon pikachuderalf = new Pokemon("Pikachu", 99);
        Pokemon charmanderdeash = new Pokemon("Charmander", 50);
        Pokemon charmanderderalf = new Pokemon("Charmander", 89);
        System.out.println(pikachudeash.nombredelaclase);
        System.out.println(pikachudeash.nivel);
        System.out.println(pikachuderalf.nombredelaclase);
        System.out.println(pikachuderalf.nivel);
        System.out.println(charmanderdeash.nombredelaclase);
        System.out.println(charmanderdeash.nivel);
        System.out.println(charmanderderalf.nombredelaclase);
        System.out.println(charmanderderalf.nivel);
    }
}
