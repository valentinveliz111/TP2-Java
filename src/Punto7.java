import java.util.Scanner;

public class Punto7
{
    public static void punto7(Scanner teclado) {

        double velocidadKm;
        double velocidadMs;

        System.out.println("Ingrese velocidad Km: ");
        velocidadKm = teclado.nextDouble();

        velocidadMs = velocidadKm * 1000 / 3600;

        System.out.println("La velocidad en Ms es: " + velocidadMs);

    }
}
