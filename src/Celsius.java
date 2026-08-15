public class Celsius {
    public static void main(String[] args) {
        // Programa feito para converter graus Celsius em Fahrenheit

        double celsius = 30.4;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("Temperatura em Celsius %.1f° é equivalente a %.1f° Fahrenheit", celsius, fahrenheit);

        System.out.println(mensagem);

        int fahrenheit_inteiro = (int) fahrenheit;
        System.out.println(String.format("A temperatura em Fahrenheit inteira é: %d", fahrenheit_inteiro));
    }
}