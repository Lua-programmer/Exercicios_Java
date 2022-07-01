package EstruturaCondicionalExercicios;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.println("Entre com dois números reais para as variáveis X e Y respectivamente: ");

        show.print("Valor de X: ");
        double x = sc.nextDouble();
        show.print("Valor de Y: ");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            show.print("Origem");
        } else if (x > 0 && y == 0) {
            show.print("Eixo X POSITIVO");
        }  else if (x < 0 && y == 0) {
            show.print("Eixo X NEGATIVO");
        } else if (x == 0 && y > 0) {
            show.print("Eixo Y POSITIVO");
        }  else if (x == 0 && y < 0) {
            show.print("Eixo Y NEGATIVO");
        } else if (x > 0 && y > 0) {
            show.print("Q1");
        } else if (x < 0 && y > 0) {
            show.print("Q2");
        } else if (x < 0 && y < 0) {
            show.print("Q3");
        } else if (x > 0 && y < 0) {
            show.print("Q4");
        }

        sc.close();
    }
}
