import java.util.Scanner;

public class Punto14 {
    public static void punto14(Scanner teclado) {

        double[] temperaturas = new double[20];
        double suma = 0;
        double maximo;
        double minimo;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Ingrese la temperatura " + (i + 1) + ": ");
            temperaturas[i] = teclado.nextDouble();
            suma = suma + temperaturas[i];
        }

        maximo = temperaturas[0];
        minimo = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maximo) {
                maximo = temperaturas[i];
            }
            if (temperaturas[i] < minimo) {
                minimo = temperaturas[i];
            }
        }

        double promedio = suma / temperaturas.length;

        System.out.println("Resultados: ");
        System.out.println("Temperatura maxima: " + maximo);
        System.out.println("Temperatura minima: " + minimo);
        System.out.println("Temperatura promedio: " + promedio);
    }
}