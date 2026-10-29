class SinPilasException extends Exception {
    SinPilasException(String mensaje) {
        super(mensaje);
    }
}

public class EjRelacionExcepciones3 {
    static void encender(int pilas) throws SinPilasException {
        if (pilas <= 0) {
            throw new SinPilasException("No hay pilas: el robot se queda quieto como una estatua.");
        }
        System.out.println("Encendido con " + pilas + " pilas");
    }

    public static void main(String[] args) {
        int[] pedidos = { 3, 0, 2 };
        for (int i = 0; i < pedidos.length; i++) {
            try {
                encender(pedidos[i]);
            } catch (SinPilasException e) {
                System.out.println("Error de pilas: " + e.getMessage());
            }
        }
    }
}
