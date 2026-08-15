public class Condicional {
    static void main() {
        // Programa para revisar condicionais

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        int dia = 3;
        String nomeDia;
        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "Terça";
                break;
            case 4:
                nomeDia = "Quarta";
                break;
            case 5:
                nomeDia = "Quinta";
                break;
            case 6:
                nomeDia = "Sexta";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = "Dia inválido";
        }

        System.out.println("O dia " + dia + " é " + nomeDia);

    }
}
