import java.util.Scanner;

public class CalcularFatorial {

    // Programa que calcula a fatorial de um número

    // O método deve ficar fora do main, direto dentro da classe.
    // Usamos 'static' para que o main consiga chamá-lo diretamente.
    static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite um número para calcular a fatorial dele: ");
                int numero = sc.nextInt();

                System.out.println("\nO resultado fica: " + calcularFatorial(numero));
                break;

            } catch (Exception e) {
                System.out.println("Digite um número válido!\n");
                sc.next();
            }
        }

    }
}
