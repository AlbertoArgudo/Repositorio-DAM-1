public class Prueba {

    static void juegos(String[] A1, String[] A2, String[] A3, String[] A4) {
        String[][] lista = { A1, A2, A3, A4 };
        for (int i = 0; i < lista.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Arcade classics:");
                    break;
                case 1:
                    System.out.println("Arcade competitive:");
                    break;
                case 2:
                    System.out.println("Arcade relax:");
                    break;
                case 3:
                    System.out.println("Arcade lost:");
                    break;
            }
            if (lista[i].length == 0) {
                System.out.println("No hay juegos.");
            } else {
                for (int j = 0; j < lista[i].length; j++) {
                    System.out.println((j + 1) + ". " + lista[i][j]);
                }
            }
        }
    }

    static void Arcade() {
        String[] arcade1 = { "Mario Bros", "Donkey Kong", "Tetris" };
        String[] arcade2 = { "Pac-Man", "Tetris", "Street Fighter II" };
        String[] arcade3 = { "Galaga", "Donkey Kong", "Pac-Man" };
        String[] arcade4 = {};
        System.out.println("=== ZONA ARCADE ===");
        juegos(arcade1, arcade2, arcade3, arcade4);
    }

    static void ConsolasClasicas() {
        String[] nes = { "Super Mario Bros.", "The Legend of Zelda", "Metroid" };
        String[] snes = { "Chrono Trigger", "Super Mario World", "Donkey Kong Country" };
        String[] sega = { "Sonic the Hedgehog", "Streets of Rage", "Golden Axe" };
        String[] playstation = { "Crash Bandicoot", "Final Fantasy VII", "Metal Gear Solid" };

        String[][] listaConsolas = { nes, snes, sega, playstation };
        String[] categorias = { "NES:", "Super Nintendo (SNES):", "Sega Genesis:", "PlayStation 1:" };

        System.out.println("=== CONSOLAS CLASICAS ===");
        for (int i = 0; i < listaConsolas.length; i++) {
            System.out.println(categorias[i]);
            int contador = 1;
            for (String juego : listaConsolas[i]) {
                System.out.println(contador + ". " + juego);
                contador++;
            }
        }
    }

    static void GanadoresGoty() {
        String[] goty2020s = { "Elden Ring (2022)", "Baldur's Gate 3 (2023)", "It Takes Two (2021)" };
        String[] goty2010s = { "God of War (2018)", "The Witcher 3 (2015)" };
        
        System.out.println("=== HISTORIAL GOTY ===");
        System.out.println("Anos 2020s:");
        for (String g : goty2020s) {
            System.out.println("- " + g);
        }
        
        System.out.println("Anos 2010s:");
        for (String g : goty2010s) {
            System.out.println("- " + g);
        }
    }

    static void Eventos() {
        String[] eventosList = { "Summer Game Fest", "Gamescom", "Tokyo Game Show", "The Game Awards", "Nintendo Direct" };
        System.out.println("=== CALENDARIO DE EVENTOS ===");
        
        int i = 0;
        while (i < eventosList.length) {
            System.out.println((i + 1) + ". " + eventosList[i]);
            i++;
        }
    }

    static void Juegos_esperados() {
        String[] Proximos_estrenos = { "Grand Theft Auto VI", "Metroid Prime 4", "Monster Hunter Wilds" };
        System.out.println("=== PROXIMOS LANZAMIENTOS ===");
        
        int i = 0;
        if (Proximos_estrenos.length > 0) {
            do {
                System.out.println((i + 1) + ". " + Proximos_estrenos[i]);
                i++;
            } while (i < Proximos_estrenos.length);
        }
    }

    static void Estudios() {
        String[] estudiosList = { "Nintendo", "Rockstar Games", "FromSoftware", "Sony Santa Monica", "CD Projekt Red" };
        System.out.println("=== ESTUDIOS DESTACADOS ===");
        for (int i = 0; i < estudiosList.length; i++) {
            System.out.println((i + 1) + ". " + estudiosList[i]);
        }
    }

    static void Personas_influyentes() {
        String[][] personas = {
            { "Shigeru Miyamoto", "Creador de Mario y Zelda" },
            { "Hideo Kojima", "Creador de Metal Gear" },
            { "Gabe Newell", "Cofundador de Valve" },
            { "Hidetaka Miyazaki", "Director de Elden Ring" }
        };

        System.out.println("=== PERSONAS INFLUYENTES ===");
        for (String[] p : personas) {
            System.out.println("- " + p[0] + " (" + p[1] + ")");
        }
    }

    static void Motores() {
        String[] motoresList = { "Unreal Engine", "Unity", "Godot Engine", "RE Engine" };
        String[] creadores = { "Epic Games", "Unity Technologies", "Comunidad Open Source", "Capcom" };

        System.out.println("=== MOTORES DE VIDEOJUEGOS ===");
        for (int i = 0; i < motoresList.length; i++) {
            System.out.println((i + 1) + ". " + motoresList[i] + " - Desarrollado por " + creadores[i]);
        }
    }

    static void Plataformas() {
        String[] plataformas = { "PC", "PlayStation 5", "Xbox Series X", "Nintendo Switch" };
        String[] tiendas = { "Steam", "Epic Games Store", "GOG", "Nintendo eShop" };

        System.out.println("=== PLATAFORMAS Y TIENDAS ===");
        System.out.println("Plataformas principales:");
        for (String p : plataformas) {
            System.out.println("- " + p);
        }
        
        System.out.println("Tiendas digitales:");
        for (String t : tiendas) {
            System.out.println("- " + t);
        }
    }

    static void Curiosidades() {
        String[] curiosidadesList = { 
            "El codigo Konami nacio en Gradius (1985).",
            "Mario se llamaba originalmente Jumpman.",
            "El juego de E.T. de Atari fue enterrado en masa en un desierto."
        };
        
        System.out.println("=== CURIOSIDADES ===");
        for (int i = 0; i < curiosidadesList.length; i++) {
            System.out.println((i + 1) + ". " + curiosidadesList[i]);
        }
    }

    // Metodo para pausar y esperar a que el usuario pulse Enter
    static void pausar(java.util.Scanner scanner) {
        System.out.println("\nPresiona Enter para volver al menu...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n;

        do {
            System.out.println("\nEscoge entre 1-10 (0 para salir):");
            System.out.println("1. Arcade");
            System.out.println("2. Consolas clasicas");
            System.out.println("3. Ganadores Goty");
            System.out.println("4. Eventos videojuegos");
            System.out.println("5. Juegos mas esperados");
            System.out.println("6. Estudios videojuegos");
            System.out.println("7. Personas influyentes videojuegos");
            System.out.println("8. Motores de videojuegos");
            System.out.println("9. Plataformas y tiendas");
            System.out.println("10. Curiosidades e hitos");
            System.out.println("0. Salir");
            
            n = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer despues de leer el entero
            System.out.println();
            
            switch (n) {
                case 1:
                    Arcade();
                    pausar(scanner);
                    break;
                case 2:
                    ConsolasClasicas();
                    pausar(scanner);
                    break;
                case 3:
                    GanadoresGoty();
                    pausar(scanner);
                    break;
                case 4:
                    Eventos();
                    pausar(scanner);
                    break;
                case 5:
                    Juegos_esperados();
                    pausar(scanner);
                    break;
                case 6:
                    Estudios();
                    pausar(scanner);
                    break;
                case 7:
                    Personas_influyentes();
                    pausar(scanner);
                    break;
                case 8:
                    Motores();
                    pausar(scanner);
                    break;
                case 9:
                    Plataformas();
                    pausar(scanner);
                    break;
                case 10:
                    Curiosidades();
                    pausar(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Numero de opcion no valido");
                    pausar(scanner);
                    break;
            }
        } while (n != 0);

        scanner.close();
    }
}
