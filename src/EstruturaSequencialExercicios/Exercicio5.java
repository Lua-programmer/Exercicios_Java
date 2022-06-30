package EstruturaSequencialExercicios;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int codPeca1, codPeca2, quantPeca1, quantPeca2;
        double precoPeca1, precoPeca2, precoTotal;

        show.print("Digite o código da 1ª peça: ");
        codPeca1 = sc.nextInt();
        show.print("Digite o valor da 1ª peça R$: ");
        precoPeca1 = sc.nextDouble();
        show.print("Digite a quantidade que vai levar: ");
        quantPeca1 = sc.nextInt();

        show.println(" ");

        show.print("Digite o código da 2ª peça: ");
        codPeca2 = sc.nextInt();
        show.print("Digite o valor da 2ª peça R$: ");
        precoPeca2 = sc.nextDouble();
        show.print("Digite a quantidade que vai levar: ");
        quantPeca2 = sc.nextInt();

        show.println(" ");

        precoTotal = (precoPeca1 * quantPeca1) + (precoPeca2 * quantPeca2);

        show.printf("Valor a pagar: R$ %.2f", precoTotal);

        sc.close();
    }
}
