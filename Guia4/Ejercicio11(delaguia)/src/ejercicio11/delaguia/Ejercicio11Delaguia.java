/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
a=@
e=#
i=$
o=%
u=*
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:     @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package ejercicio11.delaguia;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio11Delaguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase1, frase2;
        System.out.println("Ingrese una frase");
        frase1 = leer.next();

        frase2 = reemplazarVocales(frase1);

        System.out.println("Original: " + frase1);
        System.out.println("Codificada: " + frase2);

    }

    private static String reemplazarVocales(String frase) {
        String codificada = "";

        for (int i = 0; i < frase.length(); i++) {
            if (!(frase.substring(i, i + 1).equals("."))) {
                switch (frase.substring(i, i + 1).toLowerCase()) {
                    case "a":
                        codificada += "@";
                        break;
                    case "e":
                        codificada += "#";
                        break;
                    case "i":
                        codificada += "$";
                        break;
                    case "o":
                        codificada += "%";
                        break;
                    case "u":
                        codificada += "*";
                        break;
                    default:
                        codificada += frase.substring(i, i + 1);
                        break;
                }

            } else {
                break;
            }

        }

        return codificada;
    }

}
