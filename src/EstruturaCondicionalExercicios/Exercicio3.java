package EstruturaCondicionalExercicios;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int x, y;

        show.println("Digite os números a serem avaliados:");
        show.print("1° número: ");
        x = sc.nextInt();
        show.print("2° número: ");
        y = sc.nextInt();

        int maior = x;
        int menor = y;

        if (y > x) {
            maior = y;
            menor = x;
        }

        if (maior % menor == 0) {
            show.print("São Multiplos");
        } else {
            show.print("Não São Múltiplos");
        }

        sc.close();
    }
}
