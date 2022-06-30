package EstruturaCondicionalExercicios;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.println(" 1. Cachorro quente R$ 4.00 \n" +
                " 2. X-Salada R$ 4.50 \n" +
                " 3. X-Bacon R$ 5.00 \n" +
                " 4. Torrada Simples R$ 2.00 \n" +
                " 5. Refrigerante R$ 1.50 \n");

        double valorPagar;

        show.print("Digite o código do item: ");
        int codigo = sc.nextInt();

        show.print("Digite a quantidade do item: ");
        int quantidade = sc.nextInt();

        if (codigo == 1){
            valorPagar = quantidade * 4.00;
            show.printf("Valor a pagar: R$ %.2f", valorPagar);
        } else if (codigo == 2) {
            valorPagar = quantidade * 4.50;
            show.printf("Valor a pagar: R$ %.2f", valorPagar);
        } else if (codigo == 3) {
            valorPagar = quantidade * 5.00;
            show.printf("Valor a pagar: R$ %.2f", valorPagar);
        } else if (codigo == 4) {
            valorPagar = quantidade * 2.00;
            show.printf("Valor a pagar: R$ %.2f", valorPagar);
        } else if (codigo == 5) {
            valorPagar = quantidade * 1.50;
            show.printf("Valor a pagar: R$ %.2f", valorPagar);
        } else {
            show.print("Impossível de calcular, pois você digitou o código errado!");
        }

        sc.close();
    }
}
