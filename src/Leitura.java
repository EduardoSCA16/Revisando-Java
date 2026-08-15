import java.util.Scanner;

// Programa para revisar Scanner

public class Leitura {
    static void main(String[] args) {
        // Geralmente se usa sc como nome do Scanner
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int anoLancamento = leitura.nextInt();
        System.out.print("De 0 a 10, diga sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);

        leitura.close();
    }
}
