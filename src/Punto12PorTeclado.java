import java.util.Scanner;

public class Punto12PorTeclado {
    public static void punto12PorTeclado(Scanner teclado) {

        System.out.println("Ingrese la cantidad de numeros: ");
        int cant = teclado.nextInt();

        int[] numeros = new int[cant];

        int suma = 0;

        for(int i = 0; i< numeros.length; i++){
            System.out.println("Ingrese el numero " + (i+1)+ ": ");
            numeros[i] = teclado.nextInt();

            suma = suma + numeros[i];
        }
        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio es: " + promedio);
    }
}