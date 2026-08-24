import java.util.Scanner;

public class Punto11
{
    public static void punto11(Scanner teclado)
    {
        String nombre;
        int edad;
        double salario;

        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Ingrese la edad: ");
        edad = teclado.nextInt();

        System.out.println("Ingrese el salario: ");
        salario = teclado.nextDouble();

        if(edad < 16) {
            System.out.println(nombre + "No tiene edad para trabajar.");
        }else if(edad>=19 && edad<=50) {
            System.out.println("El salario de " + nombre + " es: " + salario);
        }else if(edad>=51 && edad<=60) {
        System.out.println("El salario de " + nombre + " es: " + salario);
        }else if(edad>60) {
        System.out.println("El salario de " + nombre + " es: " + salario);
        }else {
            System.out.println("La edad ingresa no pertenece a ninguna categoria del ejercicio.");
        }
    }
}