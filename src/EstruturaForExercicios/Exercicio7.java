package EstruturaForExercicios;

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Entre com um número inteiro positivo: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = i;
            int numQ = i * i;
            int numC = i * i * i;

            show.printf("%d %d %d\n", num, numQ, numC);
        }

        sc.close();
    }
}
