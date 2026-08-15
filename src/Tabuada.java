import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {

        // Programa que cria uma tabuada a partir de determinado número

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número que deseja ver a tabuada dele: ");
        int numero = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("\n%d x %d = %d", numero, i, (numero * i));
        }
    }
}
