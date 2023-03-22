/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 a medida que el usuario las va ingresando, construya una “sopa de letras para
 niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
 horizontal en una fila que será seleccionada de manera aleatoria. Una vez
 concluida la ubicación de las palabras, rellene los espacios no utilizados
 con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa
 de letras creada.
 Nota: Para resolver el ejercicio deberá investigar cómo se utilizan
 las siguientes funciones de Java substring(), Length() y Math.random().
 */
package ejercicioextra6;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] matriz=new String[20][20];
        ingresarPalabras(matriz);
        cargarMatriz(matriz);
        imprimirMatriz(matriz);
    }
    
    public static void cargarMatriz(String [][] matriz){
        int random;
        String ubicar;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]==null) {
                    random=(int)(Math.random()*8)+1;
                    ubicar=String.valueOf(random);
                    matriz[i][j]=ubicar;
                }
            }
        }
    }
    
    public static void ingresarPalabras(String [][] matriz){
        Scanner leer=new Scanner(System.in);
        String palabra;
        int fila,col;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra nro "+(i+1)+" : ");
            do {
                palabra=leer.next();
                if ((palabra.length()>5)||(palabra.length()<3)) {
                    System.out.println("Palabra mayor a 5 o menor a 3 caracteres, reintente de nuevo..");
                }
            } while ((palabra.length()>5)||(palabra.length()<3));
            do {                
                fila=(int) (Math.random()*19)+1;
                do {                    
                    col=(int) (Math.random()*19)+1;
                } while (col+palabra.length()>19);
            } while (matriz[fila][col]!=null);
            for (int j = 0; j < matriz.length; j++) {
                if (j==fila) {
                    for (int k = 0; k < palabra.length(); k++) {
                        matriz[j][k+col]=palabra.substring(k,k+1);
                    }
                }
            }
        }
    }
    
    public static void imprimirMatriz(String [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
