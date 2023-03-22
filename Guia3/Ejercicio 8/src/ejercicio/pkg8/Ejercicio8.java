/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un tamaño del cuadrado: ");
        int num=leer.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if ((i==1) || (i==(num)) || (j==1) || (j==num)){
                    System.out.print("* ");    
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
