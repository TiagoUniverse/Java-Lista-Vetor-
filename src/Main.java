import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // recebe altura com ponto
        Locale.setDefault(Locale.US);
       Scanner scanner  = new Scanner(System.in);



        System.out.printf("Você deseja analisar quantas alturas de pessoa? ");
        int quantidade = scanner.nextInt();

        double[] vect = new double[quantidade];

        for (int contador = 0; contador <quantidade; contador++){
            System.out.printf("Digite a altura da " + (contador + 1) + " pessoa: ");
            vect[contador] = scanner.nextDouble();
        }

        double soma = 0;

        for (int contador = 0; contador < quantidade; contador++){
            soma += vect[contador];
        }

        double media = soma / quantidade;

        System.out.println("A média dessas alturas foi: " + media);

        scanner.close();
    }
}