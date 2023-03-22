/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se debera
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra de 8 letras");
        String palabra=leer.nextLine();
        if (palabra.length()==8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
