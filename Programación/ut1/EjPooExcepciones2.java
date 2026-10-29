class PenaFutbol {
    private String nombre;
    private int euros;

    PenaFutbol(String nombre) {
        this.nombre = nombre;
        this.euros = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEuros() {
        return euros;
    }

    public boolean ingresar(int euros) {
        if (euros != 5 && euros != 10 && euros != 20) {
            return false;
        }
        this.euros += euros;
        return true;
    }
}

public class EjPooExcepciones2 {
    public static void main(String[] args) {
        PenaFutbol PenaFutbol = new PenaFutbol("Peña Los Pellizcos");
        int[] resultados = { 10, 5, 7, 20, 10 };
        for (int i = 0; i < resultados.length; i++) {
            boolean aceptado = PenaFutbol.ingresar(resultados[i]);
            if (aceptado) {
                System.out
                        .println("Cuota " + (i + 1) + ": +" + resultados[i] + " euros, total " + PenaFutbol.getEuros());
            } else {
                System.out.println(
                        "Cuota " + (i + 1) + ": billete falso (" + resultados[i] + " euros), se ignora");
            }
        }
        System.out.println("Caja: " + PenaFutbol.getNombre() + " con " + PenaFutbol.getEuros() + " euros");
    }
}
