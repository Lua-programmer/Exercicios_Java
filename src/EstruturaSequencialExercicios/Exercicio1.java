package EstruturaSequencialExercicios;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, soma;

        show.println("Digite dois valores inteiros: ");
        show.print("1° valor: ");
        valor1 = sc.nextInt();

        show.print("2° valor: ");
        valor2 = sc.nextInt();

        soma = valor1 + valor2;

        show.printf("A soma dos valores digitados é igual a: %d%n", soma);

        show.print("Fim do programa!!!");

        sc.close();
    }
}
