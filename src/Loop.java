import java.util.Scanner;

public class Loop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 1; i < 4; i++) {
            System.out.printf("De 0 a 10, diga a avaliação %d para o filme: ", i);
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
        }
        mediaAvaliacao /= 3;

        System.out.printf("\nMédia de avaliação: %.1f", mediaAvaliacao);
    }
}
