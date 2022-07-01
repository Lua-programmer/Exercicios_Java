package EstruturaCondicionalExercicios;

/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Entre com um número real: ");
        double numero = sc.nextDouble();

        if (numero >= 0 && numero <= 25) {
            show.print("Seu número está no intervalo de [0,25]");
        } else if (numero > 25 && numero <= 50) {
            show.print("Seu número está no intervalo de (25,50]");
        } else if (numero > 50 && numero <= 75) {
            show.print("Seu número está no intervalo de (50,75]");
        } else if (numero > 75 && numero <= 100) {
            show.print("Seu número está no intervalo de (50,100]");
        } else {
            show.print("O número está fora do intervalo");
        }

        sc.close();
    }
}
