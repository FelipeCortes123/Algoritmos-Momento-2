import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        double[] temperaturas = new double[7];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            
            if (temperaturas[i] > 38.0) {
                System.out.println("¡ALERTA DE FIEBRE! La temperatura del día " + (i + 1) + " supera los 38°C");
            }
        }
        
        double suma = 0;
        for (double temperatura : temperaturas) {
            suma += temperatura;
        }
        double promedio = suma / temperaturas.length;
        
        System.out.println("\nResumen de temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + "°C");
        }
        
        System.out.println("\nTemperatura promedio: " + promedio + "°C");
        
        scanner.close();
    }
}