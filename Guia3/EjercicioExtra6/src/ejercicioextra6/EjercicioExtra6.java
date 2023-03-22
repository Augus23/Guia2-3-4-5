/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejercicioextra6;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double altmen=0,alturas=0,alt,contador=0;
        System.out.println("Ingrese la cantidad de personas a registrar");
        int personas=leer.nextInt();
        for (int i = 1; i <= personas; i++) {
            System.out.println("Ingrese la altura de la persona "+i);
            alt=leer.nextDouble();
            if (alt>0) {
                alturas+=alt;
            } else {
                System.out.println("Altura no valida");
            }
            
            if (alt<1.60) {
                contador++;
                altmen+=alt;
            }
        }
        System.out.println("El promedio de estatura en general es: "+alturas/personas+" Y el promedio de estatura por debajo a 1.60 es: "+ altmen/contador);
    }
    
}
