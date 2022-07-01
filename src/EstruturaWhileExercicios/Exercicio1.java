package EstruturaWhileExercicios;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.println("Entre com uma senha de 4 dígitos: ");
        show.print("Senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            show.println("SENHA INVÁLIDA, DIGITE NOVAMENTE: ");
            show.print("Senha: ");
            senha = sc.nextInt();
        }

        show.print("ACESSO PERMITIDO");

        sc.close();
    }
}
