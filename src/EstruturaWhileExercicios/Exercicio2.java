package EstruturaWhileExercicios;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int x, y;

        show.println("Entre com os valores de X e Y: ");
        show.print("Valor de X: ");
        x = sc.nextInt();

        show.print("Valor de Y: ");
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                show.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                show.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                show.println("Terceiro quadrante");
            } else if (x > 0 && y < 0) {
                show.println("Quarto quadrante");
            }

            show.print("Valor de X: ");
            x = sc.nextInt();

            show.print("Valor de Y: ");
            y = sc.nextInt();
        }


        sc.close();
    }
}
