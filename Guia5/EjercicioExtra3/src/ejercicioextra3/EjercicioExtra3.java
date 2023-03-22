/*
 Crear una función rellene un vector con números aleatorios, pasándole un 
 arreglo por parámetro. Después haremos otra función o procedimiento que imprima
 el vector.
 */
package ejercicioextra3;

/**
 *
 * @author userç
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector=new int [3];
        vector=cargarvector(vector);
        imprimirvector(vector);
    }
    
    public static int[] cargarvector(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*10);
        }
        return vector;
    }
    
    public static void imprimirvector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
}
