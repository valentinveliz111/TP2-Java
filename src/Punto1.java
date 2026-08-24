import java.util.Scanner;

public class Punto1
{
    public static void punto1(Scanner teclado) {

        int n;

        System.out.println("Ingrese valor de n:");
        n = teclado.nextInt();

        n = n + 77;
        System.out.println("Se le suma 77 a n: " + n);

        n = n - 3;
        System.out.println("Se le resta 3 a n: " + n);

        n = n * 2;
        System.out.println("Se le duplica el valor a n: " + n);

    }
}