package EstruturaSequencialExercicios;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        show.println("Entre com 4 valores inteiros: ");
        show.print("1° Valor: ");
        A = sc.nextInt();

        show.print("2° Valor: ");
        B = sc.nextInt();

        show.print("3° Valor: ");
        C = sc.nextInt();

        show.print("4° Valor: ");
        D = sc.nextInt();

        diferenca = (A * B) - (C * D);

        show.printf("A diferença entre o produto de A * B e C * D, vale: %d", diferenca);

        sc.close();
    }
}
