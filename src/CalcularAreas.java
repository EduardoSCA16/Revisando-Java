import java.util.Scanner;

// Exercício feito para calcular área de quadrados e círculos

public class CalcularAreas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        while (true) {
            try {
                System.out.println("1. Calcular área do quadrado");
                System.out.println("2. Calcular área do círculo");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = sc.nextInt();

                // condicional para cada opção
                switch (opcao) {
                    case 1:
                        System.out.println("\n----- CALCULAR ÁREA QUADRADO -----");
                        System.out.print("Digite o tamanho dos lados (cm): ");
                        double lado = sc.nextDouble();

                        // Math.pow(base, expoente) = elevação
                        double area_quadrado = Math.pow(lado, 2);

                        System.out.printf("A área do quadrado é de %.2fcm.\n\n", area_quadrado);
                        break;

                    case 2:
                        System.out.println("\n----- CALCULAR ÁREA CÍRCULO -----");
                        System.out.println("Digite o tamanho do raio: ");
                        double raio = sc.nextDouble();

                        // Math.PI = valor de PI
                        // Math.pow(base, expoente) = elevação
                        double area_circulo = Math.PI * Math.pow(raio, 2);

                        System.out.printf("A área do círculo é de %.2fcm.\n\n", area_circulo);
                        break;

                    case 3:
                        System.out.println("Encerrando...");
                        System.exit(0);

                    default:
                        System.out.println("\nOpção inválida!\n");
                }
            } catch (Exception e) {
                System.out.println("\nOps! Digite um número válido.\n");
                sc.next(); // remove a String inválida
            }
        }

    }
}
