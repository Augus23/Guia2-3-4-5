/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
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

        String datos = cargaDePersonas();
        System.out.println("\nResultados Finales:\n"+datos);
        
    }

    public static boolean consultaLegalidad(int edad) {
        return edad >= 18;
    }

    public static String cargaDePersonas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int edad;
        String datosGenerales = "";
        
        while (true) {
            System.out.println("Nombre Completo:");
            datosGenerales+="Nombre y Apellido: "+leer.next();
            System.out.println("Ingrese su edad: ");
            edad= leer.nextInt();
            datosGenerales+=" Edad: "+edad;
            datosGenerales+=" Legalidad: ";
            if(consultaLegalidad(edad)){
                datosGenerales+="Mayor\n";
            }else{
                datosGenerales+="Menor\n";
            }
            System.out.println("¿Desea continuar? No=salir");
            if(leer.next().equalsIgnoreCase("no")){
                break;
            }
        }
        return datosGenerales;
    }  
}
