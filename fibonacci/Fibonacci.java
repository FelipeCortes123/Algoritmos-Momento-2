import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSerie;

        System.out.print("Ingresa la cantidad de números de la serie: ");
        numSerie = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < numSerie; i++) {
            System.out.print(num1 + " ");
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }

        scanner.close();
    }
}
