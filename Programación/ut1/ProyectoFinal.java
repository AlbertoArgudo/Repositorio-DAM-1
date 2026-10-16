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
        
    }
    
    static void Juegos_esperados() {

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

    public static void main(String[] args) {
        System.out.println("Escoge entre 1-10: ");
        System.out.println("1. Arcade ");
        System.out.println("2. Consolas clasicas ");
        System.out.println("3. Ganadores Goty ");
        System.out.println("4. Eventos videojuegos ");
        System.out.println("5. Juegos mas esperados ");
        System.out.println("6. Estudios videojuegos ");
        System.out.println("7. Personas influyentes videojuegos ");
        System.out.println("8. Motores de videojuegos ");
        System.out.println("9. Plataformas y tiendas ");
        System.out.println("10. Curiosidades e hitos ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        switch (n) {
            case 1:
                System.out.println("Realizamos la opción 1");
                Arcade();
                break;
            case 2:
                System.out.println("Realizamos la opción 2");
                ConsolasClasicas();
                break;
            case 3:
                System.out.println("Realizamos la opción 3");
                GanadoresGoty();
                break;
            case 4:
                System.out.println("Realizamos la opción 4");
                break;
            case 5:
                System.out.println("Realizamos la opción 5");
                break;
            case 6:
                System.out.println("Realizamos la opción 6");
                break;
            case 7:
                System.out.println("Realizamos la opción 7");
                break;
            case 8:
                System.out.println("Realizamos la opción 8");
                break;
            case 9:
                System.out.println("Realizamos la opción 9");
                break;
            case 10:
                System.out.println("Realizamos la opción 10");
                break;
            default:
                System.out.println("Número de día no válido");
                break;
        }
    }
}
