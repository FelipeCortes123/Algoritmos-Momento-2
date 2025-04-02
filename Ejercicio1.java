import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int[] listaEnteros = new int[5];
        int sumaTotal = 0;
        System.out.println("Inserte 5 numeros separados por un espacio: ");
        for(int n = 0; n < 5; n++){

            int numeroAgregar = scanner.nextInt();
            listaEnteros[n] = numeroAgregar;
        }
        for(int i = 0; i < listaEnteros.length ; i++){
            sumaTotal = listaEnteros[i] + sumaTotal;
        }
        System.out.print("SUMA TOTAL ->" + sumaTotal);
        scanner.close();
    }
}