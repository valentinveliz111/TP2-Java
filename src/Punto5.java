import java.util.Scanner;

public class Punto5
{
    public static void punto5(Scanner teclado) {
        int c = teclado.nextInt();

        if(c > 0) {
            System.out.println("b es un entero positivo.");
        } else if (c < 0) {
            System.out.println("b es un entero negativo.");
        } else {
            System.out.println("b es cero.");
        }

        if(c % 2 == 0) {
            System.out.println("a es par.");
        } else {
            System.out.println("a es impar.");
        }

        if(c % 10 == 0) {
            System.out.println("c es multiplo de 10.");
        }else {
            System.out.println("c no s multiplo de 10.");
        }

        if(c > 100) {
            System.out.println("c es mayor a 100.");
        }else if(c < 100) {
            System.out.println("c es menor a 100.");
        }else {
            System.out.println("c es igual a 100.");
        }
    }
}
