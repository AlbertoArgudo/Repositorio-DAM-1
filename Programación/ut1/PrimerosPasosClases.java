class Pokemon {
    String nombredelaclase;
    int nivel;

    Pokemon(String nombrequelepaso, int nivelquelepaso) {
        this.nombredelaclase = nombrequelepaso;
        this.nivel = nivelquelepaso;
    }
}

// PokemonElectrico hereda el nombre y el nivel de Pokemon.
class PokemonElectrico extends Pokemon {
    String tipo;

    PokemonElectrico(String nombrequelepaso, int nivelquelepaso) {
        super(nombrequelepaso, nivelquelepaso); // Guarda el nombre y el nivel heredados.
        this.tipo = "Eléctrico";
    }
}

public class PrimerosPasosClases {
    public static void main(String[] args) {
        // Pikachu de Ash: nivel 60.
        PokemonElectrico pikachudeash =
                new PokemonElectrico("Pikachu de Ash", 60);

        // Pikachu de Ralph: nivel 99.
        PokemonElectrico pikachuderalph =
                new PokemonElectrico("Pikachu de Ralph", 99);

        // Mostramos los datos del Pikachu de Ash.
        System.out.println(pikachudeash.nombredelaclase);
        System.out.println(pikachudeash.nivel);
        System.out.println(pikachudeash.tipo);

        // Mostramos los datos del Pikachu de Ralph.
        System.out.println(pikachuderalph.nombredelaclase);
        System.out.println(pikachuderalph.nivel);
        System.out.println(pikachuderalph.tipo);
    }
}
