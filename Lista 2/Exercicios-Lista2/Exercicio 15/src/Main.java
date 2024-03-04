import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição dos preços das bebidas
        double precoCafeCurto = 1.50;
        double precoCafeLongo = 2.00;
        double precoCappuccino = 2.50;

        // Solicitação do valor em reais
        System.out.println("Por favor, insira o valor em reais:");
        double valorInserido = scanner.nextDouble();

        // Menu de opções
        System.out.println("Menu:");
        System.out.println("1. Café Curto - R$1.50");
        System.out.println("2. Café Longo - R$2.00");
        System.out.println("3. Cappuccino - R$2.50");

        // Escolha da opção
        System.out.println("Escolha uma opção:");
        int opcao = scanner.nextInt();

        // Variáveis para armazenar a bebida escolhida e o troco
        String bebida = "";
        double precoBebida = 0;

        // Switch para determinar a bebida escolhida e calcular o troco
        switch (opcao) {
            case 1:
                bebida = "Café Curto";
                precoBebida = precoCafeCurto;
                break;
            case 2:
                bebida = "Café Longo";
                precoBebida = precoCafeLongo;
                break;
            case 3:
                bebida = "Cappuccino";
                precoBebida = precoCappuccino;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Verifica se o valor inserido é suficiente para comprar a bebida escolhida
        if (valorInserido >= precoBebida) {
            double troco = valorInserido - precoBebida;
            System.out.println("Você escolheu: " + bebida);
            System.out.println("Troco: R$" + troco);
        } else {
            System.out.println("Valor inserido insuficiente para comprar a bebida.");
        }
    }
}