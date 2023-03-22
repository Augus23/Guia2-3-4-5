/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 Crear un programa que permita introducir un cuadrado por teclado y determine
 si este cuadrado es mágico o no. El programa deberá comprobar que los números
 introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        boolean cubomagico;
        cargar(matriz);
        mostrar(matriz);
        cubomagico=calcularmatriz(matriz);
        System.out.println("La matriz es magica: "+ cubomagico);
    }

    public static boolean calcularmatriz(int[][] matriz) {
        int dato;
        dato=calculardiagonal(matriz);
        if (dato!=Integer.MIN_VALUE){
            return calcularfilasycolumnas(matriz,dato);
        } else {
            return false;
        }
    }
    
    public static boolean calcularfilasycolumnas(int [][] matriz,int dato){
        int fila,columna;
        boolean magica=true;
        for (int i = 0; i < matriz.length; i++) {
            fila=0;
            columna=0;
            for (int j = 0; j < matriz.length; j++) {
                columna+=matriz[j][i];
                fila+=matriz[i][j];
            }
            if ((columna==dato) && (fila==dato)) {
                magica=true;
            } else {
                magica=false;
                return magica;
            }
        }
        return magica;
    }
    
    public static int calculardiagonal(int[][] matriz) {
        int suma=0,suma2=0;
        for (int i = 0; i < matriz.length; i++) {
            suma+=matriz[i][i];
            suma2+=matriz[i][(matriz.length-1)-i];
        }
        if (suma==suma2){
            return suma;
        } else {
            return suma=Integer.MIN_VALUE;
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void cargar(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        int carga;
        System.out.println("Ingrese un numero entre 1 y 9");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                do {
                    System.out.println("Posicion " + "[" + i + "] [" + j + "]");
                    carga = leer.nextInt();
                } while ((carga > 9) || (carga < 0));
                matriz[i][j] = carga;
            }
        }
    }

}
