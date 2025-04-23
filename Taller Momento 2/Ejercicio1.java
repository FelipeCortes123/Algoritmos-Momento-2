import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[30];
        double suma = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int diasCalidos = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Ingresa la temperatura máxima del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            suma += temperaturas[i];

            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }

            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }

            if (temperaturas[i] > 25) {
                diasCalidos++;
            }
        }

        double promedio = suma / 30;

        System.out.println("Temperatura máxima registrada: " + max);
        System.out.println("Temperatura mínima registrada: " + min);
        System.out.println("Temperatura promedio del mes: " + promedio);
        System.out.println("Número de días con temperatura mayor a 25°C: " + diasCalidos);
    }
}
