package EstruturaForExercicios;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Quantos casos serão testados?: ");
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            show.println("Digite as três notas respectivamente:");
            show.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            show.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            show.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / (2.0 + 3.0 + 5.0);
            show.printf("Média: %.1f\n", media);
        }

        sc.close();
    }
}
