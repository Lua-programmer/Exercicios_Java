package EstruturaSequencialExercicios;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.println("Dadas 3 variáveis A,B e C, digite três valores para elas, respectivamente:");
        show.print("A = ");
        double A = sc.nextDouble();
        show.print("B = ");
        double B = sc.nextDouble();
        show.print("C = ");
        double C = sc.nextDouble();

        show.println(" ");

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = Math.PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        show.printf("A área do triângulo retângulo que tem A por base e C por altura = %.3f%n", areaTriangulo);
        show.printf("A área do círculo de raio C = %.3f%n", areaCirculo);
        show.printf("A área do trapézio que tem A e B por bases e C por altura = %.3f%n", areaTrapezio);
        show.printf("A área do quadrado que tem lado B = %.3f%n", areaQuadrado);
        show.printf("A área do retângulo que tem lados A e B = %.3f%n", areaRetangulo);

        sc.close();
    }
}
