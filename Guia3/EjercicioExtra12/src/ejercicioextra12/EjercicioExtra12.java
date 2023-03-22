/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo
sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
package ejercicioextra12;

/**
 *
 * @author userç
 */
public class EjercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a, b, c;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    a = String.valueOf(i);
                    b = String.valueOf(j);
                    c = String.valueOf(k);
                    if (a.equals("3")) {
                        System.out.print("E-");
                    } else {
                        System.out.print(a + "-");
                    }
                    if (b.equals("3")) {
                        System.out.print("E-");
                    } else {
                        System.out.print(b + "-");
                    }
                    if (c.equals("3")) {
                        System.out.print("E");
                    } else {
                        System.out.print(c);
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }

}
