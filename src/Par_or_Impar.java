import java.util.Scanner;

public class Par_or_Impar {
    static void main(String[] args) {

        // Programa que confere se um número é par ou ímpar

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                int numero = sc.nextInt();

                if ((numero % 2) == 0) {
                    System.out.println("\nEste número é par.");
                } else {
                    System.out.println("\nEste número é ímpar.");
                }
                break;

            } catch (Exception e) {
                System.out.println("Digite um número válido!\n");
                sc.next();
            }
        }

    }
}
