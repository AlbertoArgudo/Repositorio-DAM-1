public class Arrays5 {
    static void juegos(String[] juegos) {
        for (int i = 0; i < juegos.length; i++) {
            System.out.println((i + 1) + ". " + juegos[i]);
        } 
    }
    public static void main(String[] args) {
        String[] cosasfav = {"GTA6", "RDR2", "The Witcher 3", "Cyberpunk 2077", "Call of Duty", "Helldivers II", "ARK: Survival Evolved", "Minecraft", "Terraria", "The Legend of Zelda: Breath of the Wild", "Hades", "Elden Ring", "Sekiro", "Hollow Knight", "Fútbol", "Baldurs Gate 3", "Diablo IV", "Starfield", "Hogwarts Legacy", "The Elder Scrolls V: Skyrim", "The Elder Scrolls IV: Oblivion", "Fallout 4", "Fallout: New Vegas", "REPO", "Resident Evil 7"};
        System.out.println("Cosas favoritas:");
        juegos(cosasfav);
    }
}
