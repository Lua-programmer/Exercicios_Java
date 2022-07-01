package EstruturaCondicionalExercicios;

/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

De 0.00 a R$ 2000.00 >> Isento
De R$ 2000.01 até R$ 3000.00 >> 8%
De R$ 3000.01 até R$ 4500.00 >> 18%
Acima de R$ 4500.00 >> 28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        double resto, imposto;

        show.print("Entre com o valor do salário: R$ ");
        double salario = sc.nextDouble();

        if (salario <= 2000.00) {
            show.print("Isento");
        } else if (salario <= 3000.00) {
            resto = salario - 2000.00;
            imposto = resto * 0.08;
            show.printf("Seu imposto é de R$ %.2f", imposto);
        } else if (salario <= 4500.00) {
            resto = salario - 3000.00;
            imposto = resto * 0.18 + (1000 * 0.08);
            show.printf("Seu imposto é de R$ %.2f", imposto);
        } else if (salario > 4500.00) {
            resto = salario - 4500.00;
            imposto = resto * 0.28 + (1500 * 0.18) + (1000 * 0.08);
            show.printf("Seu imposto é de R$ %.2f", imposto);
        }

        sc.close();
    }
}
