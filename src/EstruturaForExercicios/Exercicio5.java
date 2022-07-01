package EstruturaForExercicios;
/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Entre com um número inteiro: ");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = n; i > 0; i--) {
            fatorial *= i;
        }

        show.printf("FATORIAL = %d", fatorial);

        sc.close();
    }
}
