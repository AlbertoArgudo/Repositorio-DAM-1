class Tanda {
    static int penaltisMarcados = 0;
    static int tandasJugadas = 0;
    String equipoA;
    String equipoB;
    int penaltisA;
    int penaltisB;

    Tanda(String equipoA, String equipoB, int penaltisA, int penaltisB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.penaltisA = penaltisA;
        this.penaltisB = penaltisB;
        penaltisMarcados += penaltisA + penaltisB;
        tandasJugadas++;
    }

    String resultado() {
        return equipoA + " " + penaltisA + "-" + penaltisB + " " + equipoB;
    }

    static String resumen() {
        int media = 0;
        if (tandasJugadas > 0) {
            media = penaltisMarcados / tandasJugadas;
        }
        return "Tandas: " + tandasJugadas + ", marcados: " + penaltisMarcados + ", media entera: " + media;
    }
}

public class EjPooExcepciones3 {
    public static void main(String[] args) {
        System.out.println("Antes de empezar -> " + Tanda.resumen());
        Tanda p1 = new Tanda("Cebolleta CF", "Pimiento CF", 4, 3);
        Tanda p2 = new Tanda("Real Berenjena", "Calabacín United", 5, 5);
        Tanda p3 = new Tanda("Deportivo Lenteja", "Deportivo Alubia", 0, 0);
        System.out.println(p1.resultado());
        System.out.println(p2.resultado());
        System.out.println(p3.resultado());
        System.out.println("Tras la ronda -> " + Tanda.resumen());
    }
}
