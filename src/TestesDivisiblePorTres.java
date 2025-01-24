public class TestesDivisiblePorTres {

    public static void main(String[] args) {
        // Imprimir encabezado
        System.out.println("Equipo-03-24-25");

        // Pruebas
        System.out.println("Prueba 1: 6 es divisible por 3? " + esDivisiblePorTres(6));  // Debería devolver true
        System.out.println("Prueba 2: 7 es divisible por 3? " + esDivisiblePorTres(7));  // Debería devolver false
        System.out.println("Prueba 4: -3 es divisible por 3? " + esDivisiblePorTres(-3));  // Debería devolver true
        System.out.println("Prueba 5: -4 es divisible por 3? " + esDivisiblePorTres(-4));  // Debería devolver false
    }

    // Método para comprobar si un número es divisible por 3
    public static boolean esDivisiblePorTres(int numero) {
        if (numero % 3 == 0)
            return true;
        return false;
    }
}
