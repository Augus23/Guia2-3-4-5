/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int limite;
        int num;
        int suma=0;
        do {            
            System.out.println("Ingrese el limite de la suma de numeros que ingresera a continuacion: ");
            limite=leer.nextInt();
        } while (limite<=0);
        
        do {            
            System.out.println("Ingrese un valor");
            num=leer.nextInt();
            suma+=num;
        } while (suma<=limite);
    }
    
}
