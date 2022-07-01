package EstruturaForExercicios;

/*Ler um número inteiro N e calcular todos os seus divisores.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        show.print("Entre com um valor inteiro: ");
        int valor = sc.nextInt();

        show.println("Os divisores desse número sao: ");
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0){
                show.println(i);
            }
        }

        sc.close();
    }
}
