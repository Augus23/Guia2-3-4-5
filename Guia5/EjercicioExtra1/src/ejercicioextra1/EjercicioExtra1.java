/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 de tamaño N, con los valores ingresados por el usuario.
 */
package ejercicioextra1;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese el tamaño del vector: ");
        int N=leer.nextInt();
        int [] vector=new int [N];
        cargarvector(vector);
        System.out.println("La suma de los valores del vector es: "+ (suma=sumavector(vector)));
    }
    public static int sumavector(int [] vector){
        int suma=0;
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
        }
        return suma;
    }
    public static void cargarvector(int [] vector){
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese valor en la posicion "+i+" : ");
            vector[i]=leer.nextInt();
        }
    }
    
}
