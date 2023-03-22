/*
 Crear un programa que dado un número determine si es par o impar.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese un numero y te diremos si es par o impar: ");
        int num=leer.nextInt();
        if  (num%2==0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
