/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda
a convertir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package ejercicio3;

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
        conversor();
    }

    public static double monto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los euros que desea convertir");
        double euro = leer.nextDouble();
        return euro;
    }

    public static int menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("menu\n"
                + "1-Libras\n"
                + "2-Dolar\n"
                + "3-Yenes");
        return leer.nextInt();
    }
    
    public static void conversor(){
        Scanner leer = new Scanner(System.in);
        boolean continuar=false; 
        while (!(continuar)){
            switch (menu()) {
            case 1:
                System.out.println("Total de libras: "+(0.86*monto()));
                break;
            case 2:
                System.out.println("Total de dolares: "+(1.28611*monto()));
                break;
            case 3:
                System.out.println("Total de dolares: "+(129.852*monto()));
                break;
            default:
                System.out.println("Numero equivocado");
                break;
        }
            System.out.println("Desea continuar?S/N");
            continuar=leer.next().equalsIgnoreCase("n");
        }
    }
}
