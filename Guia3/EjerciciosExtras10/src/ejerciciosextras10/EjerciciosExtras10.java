/*Realice un programa para que el usuario adivine el resultado de una
 multiplicación entre dos números generados aleatoriamente entre 0 y 10.
 El programa debe indicar al usuario si su respuesta es o no correcta.
 En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
 su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
 la función Math.random() de Java.
 */
package ejerciciosextras10;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjerciciosExtras10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1,num2,resultado,correcto;
        num1=(int)(Math.random()*10);
        num2=(int)(Math.random()*10);
        resultado=num1*num2;
        System.out.println(resultado);
        do {            
            System.out.println("Adivine el resultado: ");
            correcto=leer.nextInt();
            if (resultado!=correcto) {
                System.out.println("Te equivocaste, intenta de nuevo...");
            }
        } while (!(correcto==resultado));
        System.out.println("Advinaste!");
    }
}
