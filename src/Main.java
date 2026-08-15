public class Main {
    public static void main() {

        // Programa feito acompanhando as aulas da Alura

        System.out.println("Esse é o Scree Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.printf("%.2f%n", media);
        String sinopse;
        sinopse = """
                Filme de aventura com galã dos anos 80!
                Filme de aviões.
                Ano de lançamento: %d""".formatted(anoDeLancamento);
        System.out.println(sinopse);

        /* Caso queira comparar desconsiderando as letras maiúsculas e minúsculas, é usado .equalsIgnoreCase() */
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        // format() é usado para formatar um texto utilizando placeholders
        // formatted() é usado para Text Block
        // Usando % é possível representar um placeholder
        // %s -> String / %d -> int / %f -> float ou double
        String nome = "Maria";
        int idade = 20;
        double valor = 55.9999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei R$%.2f reais.%n", nome, idade, valor);

        // Classificação em 'estrelas'
        // Pode-se usar o printf para poder usar placeholders
        int classificacao;
        classificacao = (int) (media / 2);
        System.out.printf("Filme %d de 5 Estrelas", classificacao);
    }
}
