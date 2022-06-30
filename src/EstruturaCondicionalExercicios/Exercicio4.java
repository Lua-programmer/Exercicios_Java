package EstruturaCondicionalExercicios;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracaoJogo;

        show.print("Digite a hora inicial do jogo(sem os minutos): ");
        horaInicial = sc.nextInt();

        show.print("Digite a hora final do jogo(sem os minutos): ");
        horaFinal = sc.nextInt();

        if (horaFinal > horaInicial) {
            duracaoJogo = horaFinal - horaInicial;
        } else {
            duracaoJogo = 24 - horaInicial + horaFinal;
        }

        show.printf("O jogo teve a duração de %d horas.", duracaoJogo);

        sc.close();
    }

}
