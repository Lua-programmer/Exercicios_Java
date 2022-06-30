package EstruturaSequencialExercicios;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int numeroFunc, horasTrabalhadas;
        double horaPreco, salario;

        show.print("Digite o número do funcionário: ");
        numeroFunc = sc.nextInt();

        show.print("Quantas horas foram trabalhadas? ");
        horasTrabalhadas = sc.nextInt();

        show.print("Qual valor da hora trabalhada? ");
        horaPreco = sc.nextDouble();

        salario = horaPreco * horasTrabalhadas;

        show.printf("Numero do funcionário: %d%n", numeroFunc);
        show.printf("Salario do funcionário: R$ %.2f%n", salario);

        sc.close();
    }
}
