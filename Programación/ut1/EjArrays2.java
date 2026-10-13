public class EjArrays2 {
    static void evaluar(int[] estornudos){
        if(estornudos.length == 0){
            System.out.println("Nadie estornudó, la alergia se tomó el día libre");
            return;
        }
        int total = 0; 
        int maximo = estornudos[0];
        int indiceMax = 0; 
        for (int i = 0; i < estornudos.length; i++) { 
            total += estornudos[i]; 
            if (estornudos[i] > maximo) { 
                maximo = estornudos[i]; 
                indiceMax = i;  
            } 
        } 
        System.out.println("Total: " + total); 
        System.out.println("Máximo: " + maximo + " (índice " + indiceMax + ")"); 
        System.out.println("Media: " + (total / estornudos.length));     
        }

    public static void main(String[] args) {
        int[] concurso1 ={35, 90, 48, 72, 56};
        int[] concurso2 ={};
        System.out.println("Concurso 1:");
        evaluar(concurso1);
        System.out.println("Concurso 2:");
        evaluar(concurso2);
    }
}
