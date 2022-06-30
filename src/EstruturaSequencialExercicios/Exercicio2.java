package EstruturaSequencialExercicios;

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais.

Fórmula da área: area = π . raio 2

Considere o valor de π = 3.14159*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        show.println("Para obter o resultado da área de um círculo, entre com o valor do raio: ");
        show.print("Valor do raio: ");
        double raio = sc.nextDouble();

        double area = pi * raio * raio;

        show.printf("A area do circulo vale: %.4f%n", area);

        sc.close();
    }
}
