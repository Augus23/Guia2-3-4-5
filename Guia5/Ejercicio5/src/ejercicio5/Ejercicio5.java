/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
 Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 sus filas por columnas (o viceversa).
 */
package ejercicio5;

/**
 *
 * @author userç
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] transpuesta = new int[3][3];
        String aux;
        for (int[] matriz1 : matriz) {
            aux = "";
            for (int elemento : matriz1) {
                aux += "[" + elemento + "]";
            }
            System.out.println(aux);
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta.length; j++) {
                System.out.print("[" + transpuesta[i][j] + "]");
            }
            System.out.println("");
        }
        int cont = 0;
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta.length; j++) {
                if (matriz[i][j] == (transpuesta[i][j] * -1)) {
                    cont++;

                }
            }

        }
        if (cont == 9) {
            System.out.println("La matriz es antisimetrica");

        } else {
            System.out.println("No es una matriz antisimetrica");
        }
    }

}
