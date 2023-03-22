/*
Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package ejercicioextra1;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int horas=0,dias=0;
        System.out.println("Ingrese los minutos a calcular");
        int mins=leer.nextInt();
        horas=mins/60;
        dias=horas/24;
        if (horas>24) {
            horas=horas-24;
        }
        System.out.println("El equivalente a " + mins + " es " + dias + " dias, " + horas + " horas.");
    }
    
}
