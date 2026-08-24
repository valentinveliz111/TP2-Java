import java.util.Scanner;

public class Punto2
{
    public static void punto2(Scanner teclado) {

        int a;

        System.out.println("Ingrese un valor en A: ");
        a = teclado.nextInt();

        if(a % 2 == 0) {
            System.out.println("a es par.");
        } else {
            System.out.println("a es impar.");
        }
    }
}
