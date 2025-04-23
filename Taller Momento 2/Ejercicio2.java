import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int estudiantes = scanner.nextInt();

        double[][] calificaciones = new double[estudiantes][3];
        double[] promedios = new double[estudiantes];
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Ingrese las calificaciones del estudiante " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < estudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / 3;

            if (promedios[i] >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("Resultados finales:");
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + " - Promedio final: " + promedios[i]);
        }

        System.out.println("Número de estudiantes aprobados: " + aprobados);
        System.out.println("Número de estudiantes reprobados: " + reprobados);
    }
}
