import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] numerosIngresados = new int[8];
        int numeroIngresar;
        int sumaTotal = 0;

        System.out.println("Ingrese 8 numeros separados por enter:");
        for (int i = 0; i < numerosIngresados.length; i++) {
            numeroIngresar = scann.nextInt();
            numerosIngresados[i] = numeroIngresar;
        }

        for (int s = 0; s < 8; s++) {
            sumaTotal += numerosIngresados[s];
        }

        System.out.println("La suma total es: " + sumaTotal);
        scann.close();
    }
}
