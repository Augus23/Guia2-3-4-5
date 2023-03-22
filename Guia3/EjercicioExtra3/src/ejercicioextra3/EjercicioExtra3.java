/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función
equals() de la clase String.
 */
package ejercicioextra3;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una vocal: ");
        String vocal=leer.nextLine();
        if ((vocal.equalsIgnoreCase("A"))||(vocal.equalsIgnoreCase("E"))||(vocal.equalsIgnoreCase("I"))||(vocal.equalsIgnoreCase("O"))||(vocal.equalsIgnoreCase("U"))) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}
