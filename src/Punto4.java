import java.util.Scanner;
public class Punto4
{
    public static void punto4(Scanner teclado) {
        System.out.println("Ingrese un caracter: ");
        char caracter = teclado.next().charAt(0);

        int ascii = (int) caracter;

        System.out.println("El valor ASCII del caracter ingresado es: " + ascii);

    }
}