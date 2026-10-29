import java.util.Scanner;
public class ProyectoFinal {

    static void juegos(String[] A1, String[] A2, String[] A3, String[] A4) {
        String[][] lista = { A1, A2, A3, A4 };
        for (int i = 0; i < lista.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Arcade classics: ");
                    break;
                case 1:
                    System.out.println("Arcade competitive: ");
                    break;
                case 2:
                    System.out.println("Arcade relax: ");
                    break;
                case 3:
                    System.out.println("Arcade lost: ");
                    break;
            }
            if (lista[i].length == 0) {
                System.out.println("No hay ningun juego arcade.");
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
        System.out.println("Lista de Arcades: ");
        juegos(arcade1, arcade2, arcade3, arcade4);
    }

    static void ConsolasClasicas() {
        String[] nes = { "Super Mario Bros.", "The Legend of Zelda", "Metroid" };
        String[] snes = { "Chrono Trigger", "Super Mario World", "Donkey Kong Country" };
        String[] sega = { "Sonic the Hedgehog", "Streets of Rage", "Golden Axe" };
        String[] playstation = { "Crash Bandicoot", "Final Fantasy VII", "Metal Gear Solid" };

        String[][] listaConsolas = { nes, snes, sega, playstation };
        String[] categorias = { "NES: ", "Super Nintendo (SNES): ", "Sega Genesis: ", "PlayStation 1: " };

        System.out.println("=== Lista de Consolas Clásicas ===");
        for (int i = 0; i < listaConsolas.length; i++) {
            System.out.println(categorias[i]);
            if (listaConsolas[i].length == 0) {
                System.out.println("No hay juegos en esta consola.");
            } else {
                for (int j = 0; j < listaConsolas[i].length; j++) {
                    System.out.println((j + 1) + ". " + listaConsolas[i][j]);
                }
            }
        }
    }

    static void GanadoresGoty() {
        String[] goty2020s = { "Elden Ring (2022)", "Baldur's Gate 3 (2023)", "It Takes Two (2021)" };
        String[] goty2010s = { "God of War (2018)", "The Legend of Zelda: Breath of the Wild (2017)",
                "The Witcher 3 (2015)" };
        String[] gotyAntiguos = { "Skyrim (2011)", "Mass Effect 2 (2010)", "Uncharted 2 (2009)" };
        String[] menciones = { "Grand Theft Auto V (2013)", "Overwatch (2016)" };

        String[][] listaGoty = { goty2020s, goty2010s, gotyAntiguos, menciones };
        String[] categoriasGoty = { "Años 2020s: ", "Años 2010-2019: ", "Clásicos Modernos: ",
                "Otros Ganadores Históricos: " };

        System.out.println("=== Ganadores del GOTY (Game of the Year) ===");
        for (int i = 0; i < listaGoty.length; i++) {
            System.out.println(categoriasGoty[i]);
            if (listaGoty[i].length == 0) {
                System.out.println("No hay juegos en esta categoría.");
            } else {
                for (int j = 0; j < listaGoty[i].length; j++) {
                    System.out.println((j + 1) + ". " + listaGoty[i][j]);
                }
            }
        }
    }

    static void Eventos() {
        String[] Eventos_Globales = { "Summer Game Fest, Gamescom, Tokyo Game Show (TGS), The Game Awards" };
        String[] Evento_Compañia = { "Nintendo Direct, State of Play, Xbox Games Showcase" };

        String[][] listaEventos = { Eventos_Globales, Evento_Compañia };
        System.out.println("=== Eventos ===");

        for (int i = 0; i < listaEventos.length; i++) {
            if (listaEventos[i].length == 0) {
                System.out.println("No se a encontrado ningun evento");
            } else {
                for (int j = 0; j < listaEventos[i].length; j++) {
                    System.out.println((j + 1) + ". " + listaEventos[i][j]);
                }
            }
        }
    }

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

    static void Estudios() {

    }

    static void Personas_influyentes() {

    }

    static void Motores() {

    }

    static void Plataformas() {

    }

    static void Tiendas() {

    }

    static void Curiosidades() {

    }

    static void Hitos() {

    }

    static void pausar(java.util.Scanner scanner) {
        System.out.println("Presiona Enter para volver al menu...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n;

        do {
            System.out.println("Escoge entre 1-10 (0 para salir):");
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
            scanner.nextLine();

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
                    Juegos_esperados(scanner); break;
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
