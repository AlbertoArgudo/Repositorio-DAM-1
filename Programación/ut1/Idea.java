public class Idea {
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

    public static void main(String[] args) {
        String[] arcade1 = {"Mario Bros", "Donkey Kong", "Tetris"};
        String[] arcade2 = {"Pac-Man", "Tetris", "Street Fighter II"};
        String[] arcade3 = {"Galaga", "Donkey Kong", "Pac-Man"};
        String[] arcade4 = {};
        System.out.println("Lista de Arcades: ");
        juegos(arcade1, arcade2, arcade3, arcade4);
    }
}
