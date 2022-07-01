package EstruturaWhileExercicios;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int codigo;
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        show.println("1. Alcool  2. Gasolina  3. Diesel  4. Fim");
        show.print("Entre com um código: ");
        codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            }

            show.print("Entre com um código: ");
            codigo = sc.nextInt();
        }

        show.println("Muito Obrigada!\n");
        show.println("RELATÓRIO:");
        show.printf("Alcool: %d%n", alcool);
        show.printf("Gasolina: %d%n", gasolina);
        show.printf("Diesel: %d%n", diesel);

        sc.close();
    }
}
