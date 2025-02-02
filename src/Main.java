import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Equipo-03-24-25");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Verificar si un numero es par");
            System.out.println("2. Verificar si un numero es divisible por 3");
            System.out.println("3. Verificar si un numero es divisible por 5");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Introduce un número: ");
                int numero = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println(numero + " es par? " + esPar(numero));
                        break;
                    case 2:
                        System.out.println(numero + " es divisible por 3? " + esDivisiblePorTres(numero));
                        break;
                    case 3:
                        System.out.println(numero + " es divisible por 5? " + esDivisiblePorCinco(numero));
                        break;
                }
            } else if (opcion != 4) {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        System.out.println("Programa terminado.");
        scanner.close();
    }

    public static boolean esDivisiblePorTres(int numero) {
        return numero % 3 == 0;
    }

    public static boolean esDivisiblePorCinco(int numero) {
        return numero % 5 == 0;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
