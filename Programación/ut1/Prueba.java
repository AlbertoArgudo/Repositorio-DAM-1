import java.util.Scanner;

class ExcepcionMenu extends Exception {
    private final int opcion;
    ExcepcionMenu(int opcion) {
        super("Opción fuera de rango");
        this.opcion = opcion;
    }
    int getOpcion() {
        return opcion;
    }
}

class ElementoVideojuego {
    private String nombre;
    private String descripcion;

    ElementoVideojuego(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
}

public class Prueba {

    // Método auxiliar para buscar juegos con seguridad (evita NullPointerException)
    static void buscarJuego(Scanner scanner, String[] lista) {
        System.out.print("Introduce el nombre o palabra clave a buscar: ");
        String busqueda = scanner.nextLine().toLowerCase();
        boolean encontrado = false;

        for (int i = 0; i < lista.length; i++) {
            // Comprobamos obligatoriamente que la posición no sea null
            if (lista[i] != null && lista[i].toLowerCase().contains(busqueda)) {
                System.out.println(" ¡Encontrado! -> " + (i + 1) + ". " + lista[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ningún juego con ese nombre.");
        }
    }

    static void juegos(String[] A1, String[] A2, String[] A3, String[] A4) {
        String[][] lista = { A1, A2, A3, A4 };
        for (int i = 0; i < lista.length; i++) {
            switch (i) {
                case 0: System.out.println("Arcade classics:"); break;
                case 1: System.out.println("Arcade competitive:"); break;
                case 2: System.out.println("Arcade relax:"); break;
                case 3: System.out.println("Arcade lost:"); break;
            }
            if (lista[i].length == 0) {
                System.out.println("No hay juegos.");
            } else {
                for (int j = 0; j < lista[i].length; j++) {
                    System.out.println("  " + (j + 1) + ". " + lista[i][j]);
                }
            }
        }
    }

    static void Arcade() {
        String[] arcade1 = { "Mario Bros", "Donkey Kong", "Tetris", "Space Invaders", "Pac-Man" };
        String[] arcade2 = { "Street Fighter II", "Tekken", "Mortal Kombat", "Marvel vs. Capcom" };
        String[] arcade3 = { "Galaga", "Bubble Bobble", "Puzzle Bobble", "Dr. Mario" };
        String[] arcade4 = { "Polybius", "Wec Le Mans", "Paperboy" };
        System.out.println("=== ZONA ARCADE ===");
        juegos(arcade1, arcade2, arcade3, arcade4);
    }

    static void ConsolasClasicas() {
        String[] nes = { "Super Mario Bros.", "The Legend of Zelda", "Metroid", "Mega Man 2" };
        String[] snes = { "Chrono Trigger", "Super Mario World", "Donkey Kong Country", "EarthBound" };
        String[] sega = { "Sonic the Hedgehog", "Streets of Rage", "Golden Axe", "Shinobi" };
        String[] playstation = { "Crash Bandicoot", "Final Fantasy VII", "Metal Gear Solid", "Silent Hill" };
        String[] nintendo64 = { "Super Mario 64", "The Legend of Zelda: Ocarina of Time", "GoldenEye 007" };

        String[][] listaConsolas = { nes, snes, sega, playstation, nintendo64 };
        String[] categorias = { "NES:", "Super Nintendo (SNES):", "Sega Genesis:", "PlayStation 1:", "Nintendo 64:" };

        System.out.println("=== CONSOLAS CLASICAS ===");
        for (int i = 0; i < listaConsolas.length; i++) {
            System.out.println(categorias[i]);
            int contador = 1;
            for (String juego : listaConsolas[i]) {
                System.out.println("    " + contador + ". " + juego);
                contador++;
            }
        }
    }

    static void GanadoresGoty() {
        String[] gotyRecientes = { "Astro Bot (2024)", "Baldur's Gate 3 (2023)", "Elden Ring (2022)", "It Takes Two (2021)" };
        String[] goty2010s = { "God of War (2018)", "The Witcher 3 (2015)", "The Legend of Zelda: Breath of the Wild (2017)", "Overwatch (2016)" };
        
        System.out.println("=== HISTORIAL GOTY (ACTUALIZADO 2026) ===");
        System.out.println("Años recientes:");
        for (String g : gotyRecientes) {
            System.out.println(" - " + g);
        }
        System.out.println("Años 2010s:");
        for (String g : goty2010s) {
            System.out.println(" - " + g);
        }
    }

    static void Eventos() {
        String[] eventosList = { 
            "Summer Game Fest", "Gamescom", "Tokyo Game Show", 
            "The Game Awards", "Nintendo Direct", "State of Play", 
            "Xbox Games Showcase" 
        };
        System.out.println("=== CALENDARIO DE EVENTOS ===");
        
        int i = 0;
        while (i < eventosList.length) {
            System.out.println((i + 1) + ". " + eventosList[i]);
            i++;
        }
    }

    // OPCIÓN 5: INTERACTIVA (VER, BUSCAR Y AÑADIR LANZAMIENTOS REALISTAS DE 2026/2027)
    static void Juegos_esperados(Scanner scanner) {
        String[] proximos = new String[10];
        proximos[0] = "Grand Theft Auto VI";
        proximos[1] = "Metroid Prime 4: Beyond";
        proximos[2] = "Fable";
        proximos[3] = "The Witcher 4 (Project Polaris)";
        int total = 4;

        int opcionSub = -1;
        do {
            System.out.println("\n--- GESTIÓN DE PRÓXIMOS LANZAMIENTOS ---");
            System.out.println("1. Ver lista de juegos en el horizonte");
            System.out.println("2. Buscar un juego en la lista");
            System.out.println("3. Añadir nuevo juego esperado");
            System.out.println("0. Volver al menú principal");
            System.out.print("Elige una opción: ");

            try {
                opcionSub = Integer.parseInt(scanner.nextLine());
                switch (opcionSub) {
                    case 1:
                        System.out.println("\n=== PRÓXIMOS LANZAMIENTOS ===");
                        int i = 0;
                        do {
                            if (proximos[i] != null) {
                                System.out.println((i + 1) + ". " + proximos[i]);
                            }
                            i++;
                        } while (i < proximos.length && proximos[i] != null);
                        break;
                    case 2:
                        buscarJuego(scanner, proximos);
                        break;
                    case 3:
                        if (total < proximos.length) {
                            System.out.print("Introduce el nombre del nuevo juego esperado: ");
                            proximos[total] = scanner.nextLine();
                            total++;
                            System.out.println("¡Juego añadido con éxito a la lista!");
                        } else {
                            System.out.println("La lista está llena.");
                        }
                        break;
                    case 0:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida en el submenú.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número entero válido.");
            }
        } while (opcionSub != 0);
    }

    // OPCIÓN 6: INTERACTIVA (ESTUDIOS CON BÚSQUEDA)
    static void Estudios(Scanner scanner) {
        String[] estudiosList = { 
            "Nintendo", "Rockstar Games", "FromSoftware", "Sony Santa Monica", 
            "CD Projekt Red", "Capcom", "Square Enix", "BioWare", "Valve", "Bethesda" 
        };
        System.out.println("=== ESTUDIOS DESTACADOS ===");
        for (int i = 0; i < estudiosList.length; i++) {
            System.out.println((i + 1) + ". " + estudiosList[i]);
        }
        
        System.out.print("\n¿Quieres comprobar si un estudio está en el top? (s/n): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Escribe el nombre del estudio: ");
            String busqueda = scanner.nextLine();
            boolean match = false;
            for (String est : estudiosList) {
                if (est.equalsIgnoreCase(busqueda)) {
                    System.out.println("¡Correcto! " + est + " figura en nuestros estudios destacados.");
                    match = true;
                    break;
                }
            }
            if (!match) {
                System.out.println("Ese estudio no se encuentra en este listado principal.");
            }
        }
    }

    static void Personas_influyentes() {
        ElementoVideojuego[] personas = {
            new ElementoVideojuego("Shigeru Miyamoto", "Creador de Mario, Zelda y Donkey Kong"),
            new ElementoVideojuego("Hideo Kojima", "Creador de Metal Gear y Death Stranding"),
            new ElementoVideojuego("Gabe Newell", "Cofundador de Valve y Steam"),
            new ElementoVideojuego("Hidetaka Miyazaki", "Director de Dark Souls y Elden Ring"),
            new ElementoVideojuego("John Carmack", "Co-creador de Doom y pionero del 3D")
        };

        System.out.println("=== PERSONAS INFLUYENTES ===");
        for (ElementoVideojuego p : personas) {
            System.out.println(" - " + p.getNombre() + " (" + p.getDescripcion() + ")");
        }
    }

    static void Motores() {
        String[] motoresList = { "Unreal Engine 5", "Unity", "Godot Engine", "RE Engine", "Source 2", "Frostbite" };
        String[] creadores = { "Epic Games", "Unity Technologies", "Comunidad Open Source", "Capcom", "Valve", "EA" };

        System.out.println("=== MOTORES DE VIDEOJUEGOS ===");
        for (int i = 0; i < motoresList.length; i++) {
            System.out.println((i + 1) + ". " + motoresList[i] + " - Desarrollado por " + creadores[i]);
        }
    }

    static void PlataformasYTiendas() {
        String[] plataformas = { "PC", "PlayStation 5", "Xbox Series X/S", "Nintendo Switch", "Steam Deck", "Realidad Virtual (VR)" };
        String[] tiendas = { "Steam", "Epic Games Store", "GOG", "Nintendo eShop", "PlayStation Store", "Xbox Store" };

        System.out.println("=== PLATAFORMAS PRINCIPALES ===");
        for (String p : plataformas) {
            System.out.println(" - " + p);
        }
        System.out.println("\n=== TIENDAS DIGITALES ===");
        for (String t : tiendas) {
            System.out.println(" - " + t);
        }
    }

    static void Curiosidades() {
        String[] curiosidadesList = { 
            "El codigo Konami nacio en Gradius (1985).",
            "Mario se llamaba originalmente Jumpman en Donkey Kong.",
            "El juego de E.T. de Atari fue enterrado en masa en un desierto de Nuevo Mexico.",
            "El primer videojuego de la historia fue 'Tennis for Two' en 1958.",
            "Monster Hunter Wilds triunfó masivamente tras su lanzamiento en 2025."
        };
        
        System.out.println("=== CURIOSIDADES E HITOS ===");
        for (int i = 0; i < curiosidadesList.length; i++) {
            System.out.println((i + 1) + ". " + curiosidadesList[i]);
        }
    }

    static void pausar(Scanner scanner) {
        System.out.println("\nPresiona Enter para continuar...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL DEL PROYECTO FINAL ===");
            System.out.println("1. Arcade");
            System.out.println("2. Consolas clásicas");
            System.out.println("3. Ganadores Goty");
            System.out.println("4. Eventos videojuegos");
            System.out.println("5. Juegos más esperados (INTERACTIVO)");
            System.out.println("6. Estudios videojuegos (INTERACTIVO)");
            System.out.println("7. Personas influyentes");
            System.out.println("8. Motores de videojuegos");
            System.out.println("9. Plataformas y tiendas");
            System.out.println("10. Curiosidades e hitos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            
            try {
                n = Integer.parseInt(scanner.nextLine());
                
                if (n < 0 || n > 10) {
                    throw new ExcepcionMenu(n);
                }

                System.out.println();
                
                switch (n) {
                    case 1: Arcade(); pausar(scanner); break;
                    case 2: ConsolasClasicas(); pausar(scanner); break;
                    case 3: GanadoresGoty(); pausar(scanner); break;
                    case 4: Eventos(); pausar(scanner); break;
                    case 5: Juegos_esperados(scanner); break; // Menú interactivo con submenú
                    case 6: Estudios(scanner); pausar(scanner); break; // Menú con pregunta interactiva
                    case 7: Personas_influyentes(); pausar(scanner); break;
                    case 8: Motores(); pausar(scanner); break;
                    case 9: PlataformasYTiendas(); pausar(scanner); break;
                    case 10: Curiosidades(); pausar(scanner); break;
                    case 0: System.out.println("¡Saliendo del programa con éxito!"); break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                pausar(scanner);
            } catch (ExcepcionMenu e) {
                System.out.println("Error personalizado: La opción " + e.getOpcion() + " no está permitida (debe ser de 0 a 10).");
                pausar(scanner);
            } finally {
                System.out.println("[Ciclo del menú procesado correctamente]\n");
            }
            
        } while (n != 0);

        scanner.close();
    }
}