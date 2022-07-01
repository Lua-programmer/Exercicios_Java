package EstruturaForExercicios;

/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Entre com um número inteiro entre 1 e 1000: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (i % 2 != 0) {
                show.println(i);
            }
        }

        sc.close();
    }
}
