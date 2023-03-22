/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra
 de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
 un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se debera
 imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String palabra=leer.nextLine();
        if (palabra.substring(0,1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
