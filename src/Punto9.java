import java.util.Scanner;
public class Punto9
{
    public static void punto9(Scanner teclado) {
        int numero;

        System.out.println("Ingrese un numero de 5 cifras: ");
        numero = teclado.nextInt();

        int cifra1 = numero / 10000;
        int cifra3 = (numero / 100) % 10;
        int cifra5 = numero % 10;

        System.out.println("Cifras en posiciones impares: ");
        System.out.println(cifra1);
        System.out.println(cifra3);
        System.out.println(cifra5);

    }
}