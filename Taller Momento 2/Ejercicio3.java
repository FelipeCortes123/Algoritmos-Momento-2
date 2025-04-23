import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] puntuaciones = new int[5];
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la puntuación del jugador " + (i + 1) + ": ");
            puntuaciones[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (puntuaciones[i] > maximo) {
                maximo = puntuaciones[i];
            }
        }

        System.out.println("\nPuntuaciones ingresadas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + puntuaciones[i]);
        }

        System.out.println("\nLa puntuación más alta es: " + maximo);
    }
}
