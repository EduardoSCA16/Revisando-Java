import java.util.Scanner;

// Programa para revisar loops (while)

public class LoopAlternativo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("De 0 a 10, diga a avaliação para o filme ou -1 para encerrar: ");
            nota = sc.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        mediaAvaliacao /= totalDeNotas;

        System.out.printf("\nMédia de avaliação: %.1f", mediaAvaliacao);
    }
}
