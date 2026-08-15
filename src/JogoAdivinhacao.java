import java.util.Random;
import java.util.Scanner;

// Jogo de adivinhar o número aleatório gerado entre 0 e 100

public class JogoAdivinhacao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Tentativa %d - Digite um número entre 0 a 100: ", i);
            int numero = sc.nextInt();

            if (numero > numeroAleatorio) {
                System.out.println("Errou! O número é menor!!\n");
                continue;
            } else if (numero < numeroAleatorio) {
                System.out.println("Errou! O número é maior!!\n");
                continue;
            } else {
                System.out.println("Parabéns! Você acertou!!\n");
                System.exit(0);
            }
        }

        System.out.printf("O número era: %d", numeroAleatorio);

        sc.close();
    }
}
