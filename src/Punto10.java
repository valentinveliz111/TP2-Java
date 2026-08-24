import java.util.Scanner;

public class Punto10
{
    public static void punto10(Scanner teclado) {
        int horas;
        int minutos;
        int segundos;

        System.out.println("Ingrese la hora: ");
        horas = teclado.nextInt();

        System.out.println("Ingrese los minutos: ");
        minutos = teclado.nextInt();

        System.out.println("Ingrese los segundos: ");
        segundos = teclado.nextInt();

        if(horas>=0 && horas<=23 && minutos>=0 && minutos<=59 && segundos>=0 && segundos<=59) {
            System.out.println("La hora es valida.");
        }else {
            System.out.println("La hora no es valida.");
        }
    }
}