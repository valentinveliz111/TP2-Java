import java.util.Scanner;

public class Punto13{
    public static void punto13(Scanner teclado) {

        int numero;
        int suma = 0;

        System.out.println("Ingrese un numero: ");
        numero = teclado.nextInt();

        for(int i=1; i<=numero; i++){
            suma = suma +1;
        }
        System.out.println("La suma de los numeros naturales hasta " + numero + "es " + suma);
    }
}