class Estadio {
    String nombre;
    int aforo;
    int vendidas;

    Estadio(String nombre, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.vendidas = 0;
    }

    void vender() {
        vendidas++;
    }

    String fichas() {
        return nombre + " (aforo " + aforo + ") - vendidas: " + vendidas;
    }
}

public class EjPooExcepciones1 {
    public static void main(String[] args) {
        Estadio e1 = new Estadio("Campo del Garbanzo", 500);
        Estadio e2 = new Estadio("Estadio Tortilla", 1200);
        e1.vender();
        e1.vender();
        e1.vender();
        System.out.println(e1.fichas());
        System.out.println(e2.fichas());
    }
}
