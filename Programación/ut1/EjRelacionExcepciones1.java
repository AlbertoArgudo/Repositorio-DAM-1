public class EjRelacionExcepciones1 {
    static void dividir(int[] monedas, int[] piratas) {
        for (int i = 0; i <= monedas.length; i++) {
            try {
                System.out.println("Cofre " + (i + 1) + ": " + (monedas[i] / piratas[i]) + " monedas por pirata");
            } catch (ArithmeticException e) {
                System.out.println("Cofre " + (i + 1) + ": ningún pirata, el loro se lo quedó todo");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Cofre " + (i + 1) + ": no existe, el kraken se lo tragó");
            }
        }
    }

    public static void main(String[] args) {
        int[] monedas = { 20, 15, 7 };
        int[] piratas = { 5, 0, 2 };
        dividir(monedas, piratas);
    }
}
