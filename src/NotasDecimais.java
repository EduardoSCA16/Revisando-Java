public class NotasDecimais {
    public static void main (String[] args) {
        double nota1 = 8.9;
        double nota2 = 7.5;

        double media = (nota1 + nota2) / 2;

        System.out.println(String.format("A média das notas %.1f e %.1f é %.1f", nota1, nota2, media));

        int media_int = (int) media;
        System.out.println("\nA média como inteiro fica: " + media_int);

        char letra_a = 'a';
        System.out.println("Java é um" + letra_a + " linguagem muito interess" + letra_a + "nte!");
    }
}