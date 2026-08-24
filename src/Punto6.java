import java.util.Scanner;

public class Punto6
{
    public static void punto6(Scanner teclado) {

        System.out.println("Ingrese el nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Buenos dias, " + nombre);

        teclado.close();
    }
}
