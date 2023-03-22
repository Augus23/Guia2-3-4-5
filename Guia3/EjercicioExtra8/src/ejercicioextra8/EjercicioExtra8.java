/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
 debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
 números pares y la cantidad de números impares. Al igual que en el ejercicio
 anterior los números negativos no deben sumarse. Nota: recordar el uso de la
 sentencia break.
 */
package ejercicioextra8;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros,pares=0,impares=0,leidos=0;
        Scanner leer= new Scanner(System.in);
        do {            
            System.out.println("Ingrese un numero: ");
            numeros=leer.nextInt();
            if (numeros%5==0) {
                break;
            }
            leidos++;
            if (numeros%2==0) {
                pares++;
            } else {
                impares++;
            }
            
        } while (!(numeros%5==0));
        System.out.println("Cantidad de numeros: "+leidos);
        System.out.println("Cantidad de numeros pares: "+pares);
        System.out.println("Cantidad de numeros impares: "+impares);
    }
}
