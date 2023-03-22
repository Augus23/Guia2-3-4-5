/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
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
        Scanner leer = new Scanner(System.in);
        int tamaño;
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;
        int digito4 = 0;
        int digito5 = 0;
        int cont, num;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }
        for (int e = 0; e < vector.length; e++) {
            System.out.print(vector[e] + " ");
        }
        System.out.println("");
        for (int j = 0; j < vector.length; j++) {
            cont = 0;
            num = vector[j];
            while (num > 0) {
                num /= 10;
                cont++;
            }
            switch (cont) {
                case 1:
                    digito1++;
                    break;
                case 2:
                    digito2++;
                    break;
                case 3:
                    digito3++;
                    break;
                case 4:
                    digito4++;
                    break;
                case 5:
                    digito5++;
                    break;
            }

        }
        System.out.println("Se encontro: " + digito1 + " numeros de 1 digito, " + digito2 + " numeros de 2 digitos, " + digito3 + " numeros de 3 digitos, " + digito4 + " numeros de 4 digitos y " + digito5 + " numeros de 5 digitos");
    }
}
