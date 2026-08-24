import java.util.Scanner;
public class Punto3
{
    public static void punto3(Scanner teclado) {
        int b;

        System.out.println("Ingrese un valor para b: ");
        b = teclado.nextInt();

        if(b > 0) {
            System.out.println("b es un entero positivo.");
        } else if (b < 0) {
            System.out.println("b es un entero negativo.");
        } else {
            System.out.println("b es cero.");
        }
    }
}