import java.util.Scanner;

// Programa para conferir se um número é positivo, neutro ou negativo

public class NumeroPositivoNegativo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Este número é negativo.");
        } else if (numero > 0) {
            System.out.println("Este número é positivo.");
        } else {
            System.out.println("Este número é neutro.");
        }
    }
}
