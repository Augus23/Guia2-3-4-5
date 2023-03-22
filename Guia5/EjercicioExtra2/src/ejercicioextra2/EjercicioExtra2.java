/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales
 (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
 los elementos).
 */
package ejercicioextra2;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        boolean dato;
        System.out.println("Ingrese numero al vector 1: ");
        cargarvector(vector1);
        System.out.println("Ingrese numero al vector 2: ");
        cargarvector(vector2);
        dato = compararvectores(vector1, vector2);
        if (dato) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son distintos");
        }
    }

    public static boolean compararvectores(int[] vector1, int[] vector2) {
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void cargarvector(int[] vector) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion[" + i + "]");
            vector[i] = leer.nextInt();
        }
    }
}
