class Producto {
    private String nombre;
    private int precio;

    Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}

class Tienda {
    private Producto[] vitrina = new Producto[3];
    private int numero = 0;

    public boolean exponer(Producto p) {
        if (numero == vitrina.length) {
            return false;
        }
        vitrina[numero] = p;
        numero++;
        return true;
    }

    public int valorTotal() {
        int total = 0;
        for (int i = 0; i < numero; i++) {
            total += vitrina[i].getPrecio();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }
}

public class EjPooExcepciones4 {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Producto[] candidatos = {
                new Producto("Bufanda", 15),
                new Producto("Gorra", 12),
                new Producto("Balón firmado", 40),
                new Producto("Llavero", 3)
        };
        for (int i = 0; i < candidatos.length; i++) {
            Producto c = candidatos[i];
            if (tienda.exponer(c)) {
                System.out.println("Expuesto: " + c.getNombre() + " (" + c.getPrecio() + " euros)");
            } else {
                System.out.println("Vitrina llena: no cabe " + c.getNombre());
            }
        }
        System.out.println("Gasto total: " + tienda.valorTotal() + " euros en " + tienda.getNumero() + " Productos");
    }
}