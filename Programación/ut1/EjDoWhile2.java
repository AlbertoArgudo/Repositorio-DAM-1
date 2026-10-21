public class EjDoWhile2 {
    static void cantar(int canciones) {
        do {
            if (canciones > 0) {
                canciones--;
                System.out.println("Canción cantada, quedan " + canciones);
            } else {
                System.out.println("No había canciones, pero el micrófono ya estaba encendido.");
            }
        } while (canciones > 0);
    }

    public static void main(String[] args) {
        System.out.println("Karaoke 1:");
        cantar(4);
        System.out.println("Karaoke 2:");
        cantar(0);
    }
}
