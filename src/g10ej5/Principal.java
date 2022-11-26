/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La
 * computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que
 * intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora
 * debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que
 * ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en
 * pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario
 * introduce algo que no es un número, se debe controlar esa excepción e indicarlo por
 * pantalla. En este último caso también se debe contar el carácter fallido como un intento.
 */
package g10ej5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Adivinar a = new Adivinar();
        int num = 0;
        int cont = 0;

        final int INTENTOS = 3;
        System.out.println(a.getNumeroRandom());
        do {
            try {
                System.out.println("Ingreasarenos un número a adivinar!");
                num = new Scanner(System.in).nextInt();
                a.adivinar(num);
                cont++;
            } catch (Exception e) {
                cont++;
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            
        } while (num != a.getNumeroRandom() && cont != INTENTOS);
        System.out.println((cont==INTENTOS && num !=a.getNumeroRandom() ? "Se superaron los intentos":"Has acertado!!!!"));
    }

}
