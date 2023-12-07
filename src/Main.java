import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // recebe altura com ponto
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        boolean validacao;

        do {
            try {
                System.out.printf("Você deseja analisar quantas alturas de pessoa? ");
                quantidade = scanner.nextInt();
                validacao = true;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite uma altura válida (ex: 2) \n");
                scanner.nextLine();
                validacao = false;
            }

        } while (!validacao);

        double[] vect = new double[quantidade];

        for (int contador = 0; contador < quantidade; contador++) {
            do {
                try {
                    System.out.printf("Digite a altura da " + (contador + 1) + " pessoa: ");
                    vect[contador] = scanner.nextDouble();
                    validacao = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite uma altura válida (1.80): \n ");
                    scanner.nextLine();
                    validacao = false;
                }

            } while (!validacao);
        }

        double soma = 0;

        for (int contador = 0; contador < quantidade; contador++) {
            soma += vect[contador];
        }

        double media = soma / quantidade;

        System.out.printf("Altura média: %.2f%n", media);

        scanner.close();
    }
}