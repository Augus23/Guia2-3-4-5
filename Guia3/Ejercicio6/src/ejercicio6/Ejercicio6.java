/*
 Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1=0,num2=0,opcion;
        String salir="n";
        do {
            System.out.println("Ingrese dos numeros positivos: ");
            if (num1<=0){
                System.out.print("Numero1: ");
                num1 = leer.nextInt();
            }
            if (num2<=0){
                System.out.print("Numero2: ");
                num2 = leer.nextInt();
            }
        } while ((num1 < 0) || (num2 < 0));
        do {
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: "+(num1+num2));
                    continue;
                case 2:
                    System.out.println("La resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("La division es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir=leer.next();
                    break;  
            }
        } while (!salir.equalsIgnoreCase("S"));
    }
}
