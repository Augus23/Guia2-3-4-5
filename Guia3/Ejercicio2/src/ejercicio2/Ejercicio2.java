/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la contraseña correcta: ");
        String frase=leer.nextLine();
        if (frase.equalsIgnoreCase("eureka")) {         //ignorecase hace q ignore si lo ponen en mayus o minus
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }

}
