public class Arrays3 {
    static void abrir(String paquetedesconocido) {
        if(paquetedesconocido != ""){
            System.out.println(paquetedesconocido);
        } else {
            System.out.println("No hay nada, lo mandamos y denunciamos");
            return;
        }
        System.out.println("Cerramos ");
    }


    public static void main(String[] args) {
        String paquete1 = "Pera";
        String paquete2 = "Tomate";
        String paquete3 = "Uva";
        String paquete4 = "Melon";
        abrir(paquete1);
        abrir(paquete2);
        abrir(paquete3);
        abrir(paquete4);
    }
}

