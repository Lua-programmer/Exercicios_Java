package EstruturaCondicionalExercicios;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Digite o número inteiro a ser avaliado: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            show.print("Número Negativo");
        } else {
            show.print("Número Não Negativo");
        }

        sc.close();
    }
}
