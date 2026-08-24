import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Punto 1.");
            System.out.println("2. Punto 2.");
            System.out.println("3. Punto 3.");
            System.out.println("4. Punto 4.");
            System.out.println("5. Punto 5.");
            System.out.println("6. Punto 6.");
            System.out.println("7. Punto 7.");
            System.out.println("8. Punto 8.");
            System.out.println("9. Punto 9.");
            System.out.println("10. Punto 10.");
            System.out.println("11. Punto 11.");
            System.out.println("12. Punto 12.");
            System.out.println("13. Punto 12 por teclado.");
            System.out.println("14. Punto 13.");
            System.out.println("15. Punto 14.");
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    Punto1.punto1(teclado);
                    break;

                case 2:
                    Punto2.punto2(teclado);
                    break;

                case 3:
                    Punto3.punto3(teclado);
                    break;

                case 4:
                    Punto4.punto4(teclado);
                    break;

                case 5:
                    Punto5.punto5(teclado);
                    break;

                case 6:
                    Punto6.punto6(teclado);
                    break;

                case 7:
                    Punto7.punto7(teclado);
                    break;

                case 8:
                    Punto8.punto8(teclado);
                    break;

                case 9:
                    Punto9.punto9(teclado);
                    break;

                case 10:
                    Punto10.punto10(teclado);
                    break;

                case 11:
                    Punto11.punto11(teclado);
                    break;

                case 12:
                    Punto12.punto12();
                    break;

                case 13:
                    Punto12PorTeclado.punto12PorTeclado(teclado);
                    break;

                case 14:
                    Punto13.punto13(teclado);
                    break;

                case 15:
                    Punto14.punto14(teclado);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);

        teclado.close();
    }
}