import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[10];
        int contadorVocales = 0;


        System.out.println("Ingresa 10 caracteres uno por uno:");
        for (int i = 0; i < letras.length; i++) {
            System.out.print("Carácter " + (i + 1) + ": ");
            letras[i] = sc.next().toLowerCase().charAt(0); 
        }


        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Cantidad de vocales ingresadas: " + contadorVocales);
        sc.close();
    }
}
