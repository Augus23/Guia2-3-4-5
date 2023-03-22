/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
 cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
 cada familia la cantidad de hijos para averiguar la media de edad de los hijos
 de todas las familias.
 */
package ejercicioextra14;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int promedio=0,familias,hijos,contador=0,edad;
        System.out.println("Ingrese la cantidad de familias: ");
        familias=leer.nextInt();
        for (int i = 1; i <= familias; i++) {
            System.out.println("Que cantidad de hijos tienes ?");
            hijos=leer.nextInt();
            for (int j = 1; j <= hijos; j++) {
                System.out.println("Queda tiene su hijo numero "+j+" : ");
                edad=leer.nextInt();
                promedio+=edad;
                contador++;
            }
        }
        System.out.println("El promedio de las edades de los hijos es de: "+(promedio/contador));
    }
}
