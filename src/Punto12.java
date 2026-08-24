public class Punto12
{
    public static void punto12() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            suma = suma + numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio es: " + promedio);
    }
}