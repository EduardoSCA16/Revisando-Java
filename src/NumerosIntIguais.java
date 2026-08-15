import java.util.Scanner;

// Programa para conferir se dois números inteiros são iguais

public class NumerosIntIguais {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                int num1 = sc.nextInt();
                System.out.print("Digite um segundo número inteiro: ");
                int num2 = sc.nextInt();

                if (num1 == num2) {
                    System.out.println("\nAmbos os números são iguas.");
                } else {
                    System.out.println("\nOs dois números são diferentes.");
                }

                if (num1 > num2) {
                    System.out.println("O primeiro número é maior que o segundo.");
                } else if (num1 < num2) {
                    System.out.println("O segundo número é maior que o primeiro.");
                }
                break;

            } catch (Exception e) {
                System.out.println("Ops! Queremos um número inteiro!");
                sc.next();
            }
        }

    }
}
