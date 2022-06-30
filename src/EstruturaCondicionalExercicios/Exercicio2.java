package EstruturaCondicionalExercicios;

/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Digite o número inteiro a ser avaliado: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            show.print("Número PAR");
        } else {
            show.print("Número IMPAR");
        }

        sc.close();
    }
}
