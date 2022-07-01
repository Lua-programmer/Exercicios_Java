package EstruturaForExercicios;

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Entre com a quantidade de vezes que você vai testar: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            show.print("Digite o primeiro número: ");
            int numero1 = sc.nextInt();

            show.print("Digite o segundo número: ");
            int numero2 = sc.nextInt();

            if (numero2 == 0) {
                show.print("Divisão impossível\n");
            } else {
                double divisao = (double) numero1 / numero2;
                show.printf("A divisão entre esse números é: %.1f%n", divisao);
            }
        }

        sc.close();
    }
}
