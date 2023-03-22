/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, num;
        System.out.println("Ingrese un tamanio del vector:");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 5);
        }

        String aux = "";
        for (int elemento : vector) {
            aux += " " + elemento;
        }
        System.out.println(aux);
        System.out.println("Ingrese un elemento a buscar");
        num = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if ((vector[i] == num) && (cont == 0)) {
                cont++;
                System.out.println("Se encontro el numero en la posicion " + i);
            } else if (vector[i] == num) {
                cont++;
            }
            

        }
        System.out.println("Se encontro " + cont + " veces");
    }
}
