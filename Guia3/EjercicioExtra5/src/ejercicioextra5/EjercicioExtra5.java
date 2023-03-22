/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
package ejercicioextra5;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese tu tipo de socio: ");
        String socio=leer.nextLine().toUpperCase();
        System.out.println("Ingrese el valor del tratamiento: ");
        int trat=leer.nextInt();
        switch (socio) {
            case "A":
                System.out.println("El valor del tratamiento es: " + (trat*0.50) );
                break;
            case "B":
                System.out.println("El valor del tratamiento es: " + (trat*0.65) );
                break;
            case "C":
                System.out.println("El valor del tratamiento es: " + trat);
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
