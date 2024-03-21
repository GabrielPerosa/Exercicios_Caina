import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vetor2 = new int[vetor1.length]; // Cria um segundo vetor com o mesmo tamanho

        // Cria uma cópia invertida do vetor1 em vetor2
        //Para acessar o último elemento de um array de comprimento n, você usa n - 1
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[vetor1.length - 1 - i];
        }

        // Exibe vetor1
        System.out.println("Vetor1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        // Exibe vetor2 (cópia invertida de vetor1)
        System.out.println("Vetor2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();
    }
}