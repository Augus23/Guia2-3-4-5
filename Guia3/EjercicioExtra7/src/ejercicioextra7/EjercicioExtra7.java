/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y
el promedio de n números (n>0). El valor de n se solicitará al principio del
programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejercicioextra7;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,promedio=0,valor,contador=0;
        do {            
            System.out.println("Ingrese la cantidad de numeros que va a ingresar: ");
            n=leer.nextInt();
        } while (n<=0);
        
        while (contador<n){
            System.out.println("Ingrese un valor: ");
            valor=leer.nextInt();
            
            if (max<valor) {
                max=valor;
            }
            
            if (min>valor) {
                min=valor;
            }
            promedio+=valor;
            contador++;
        }
        System.out.println("El valor minimo es: "+min+",el valor maximo es: "+max+" y el promedio es: "+promedio/n);
        
        min=Integer.MAX_VALUE;
        max=Integer.MIN_VALUE;
        contador=0;
        promedio=0;
        
        System.out.println("Ingrese "+n+" valores: ");
        
        do {
            
            System.out.println("Ingrese un valor: ");
            valor=leer.nextInt();
            
            if (max<valor) {
                max=valor;
            }
            
            if (min>valor) {
                min=valor;
            }
            promedio+=valor;
            contador++;
        } while (contador<n);
        
        System.out.println("El valor minimo es: "+min+",el valor maximo es: "+max+" y el promedio es: "+promedio/n);
        
    }
    
}
