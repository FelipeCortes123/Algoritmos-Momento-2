import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[][] matrizNotas = new double[3][4];

        for(int n1 = 0; n1 < matrizNotas.length; n1++){
            for(int col = 0; col < matrizNotas.length; col++){
                int estudiante = n1;
                System.out.println("Ingresa la nota " + (col + 1) + " del estudiante" + (estudiante + 1));
                double notaEst1 = scanner.nextDouble();
                matrizNotas[n1][col] = notaEst1;
            }
        }
        System.out.println(matrizNotas[0][0]);
        scanner.close();
    }
}



