package factorial;
import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Factorial de un número");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / (double) num2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese un número para calcular su factorial: ");
                    int numero = scanner.nextInt();
                    if (numero < 0) {
                        System.out.println("El factorial no está definido para números negativos.");
                    } else {
                        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 6);

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}


