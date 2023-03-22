/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio4;

/**
 *
 * @author userç
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz=new int[4][4];
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz1[j] = (int) (Math.random()*10);
            }
        }
        String aux;
        for (int[] matriz1 : matriz) {
            aux="";
            for (int elemento: matriz1) {
                aux+= "[" + elemento+"]";
            }
            System.out.println(aux);
        }
        System.out.println("");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int[] matriz1 : matriz) {
                System.out.print("[" + matriz1[j] + "]");
            }
            System.out.println("");
        }
    }
    
}
