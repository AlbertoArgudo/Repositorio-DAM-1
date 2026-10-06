public class Pelicula {
    public static void main(String[] args) {
        String cine = "Cine Las Palmeras";
        String titulo = "El faro";
        int duracion = 104;
        double precio = 7.50;
        char sala = 'C';
        boolean vo = true;
        cine = "Cine Las Costras";
        
        System.out.println("== "+ cine + " ==");
        System.out.println("Titulo: " + titulo);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Precio: " + precio + " euros");
        System.out.println("Sala: " + sala);
        System.out.println("Versión original: " + vo);
    }
}
