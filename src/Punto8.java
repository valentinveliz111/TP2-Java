import java.util.Scanner;
public class Punto8
{
    public static void punto8(Scanner teclado) {
        int numero;

        System.out.println("Ingrese un numero de 3 cifras: ");
        numero = teclado.nextInt();

        int centenas = numero / 100;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;

        System.out.println("En Centenas: " + centenas);
        System.out.println("En Docenas: " + decenas);
        System.out.println("En Unidades: " + unidades);

    }
}
