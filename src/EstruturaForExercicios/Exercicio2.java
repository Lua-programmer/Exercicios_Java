package EstruturaForExercicios;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Quantos números serão digitados? ");
        int N = sc.nextInt();

        int numero;
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            show.printf("Entre com o %d° número: ", i + 1);
            numero = sc.nextInt();
            if (numero >= 10 && numero <= 20) {
                in++;
            } else {
                out++;
            }
        }

        show.printf("%d números estão dentro do intervalo [10,20]\n", in);
        show.printf("%d números estão fora do intervalo [10,20]\n", out);
        sc.close();
    }
}
