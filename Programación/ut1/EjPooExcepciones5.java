class Futbolista { 
    private String nombre; 
    private int dorsal; 
    Futbolista(String nombre, int dorsal) { 
        this.nombre = nombre; 
        this.dorsal = dorsal; 
    } 
    String descripcion() { 
        return "#" + dorsal + " " + nombre; 
    } 
} 
class Delantero extends Futbolista { 
    private int goles; 
    Delantero(String nombre, int dorsal) { 
        super(nombre, dorsal); 
        this.goles = 0; 
    } 
    void marcar() { 
        goles++; 
    } 
    @Override 
    String descripcion() { 
        return super.descripcion() + " - goles: " + goles; 
    } 
} 
public class EjPooExcepciones5 {  
    public static void main(String[] args) { 
        Futbolista j = new Futbolista("Lola Lateral", 4); 
        Delantero p1 = new Delantero("Rafa Rematador", 11); 
        Delantero p2 = new Delantero("Suplente Soñoliento", 20);  
        p1.marcar();
        p1.marcar(); 
        p1.marcar(); 
        p1.marcar();
        System.out.println(j.descripcion());  
        System.out.println(p1.descripcion()); 
        System.out.println(p2.descripcion());
    }
} 