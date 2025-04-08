import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();
        int original = numero;
        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }
        if (original == invertido) {
            System.out.println(original + " es un palíndromo");
        } else {
            System.out.println(original + " no es un palíndromo");
        }

        sc.close();
    }
}
