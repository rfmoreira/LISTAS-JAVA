package lista.java01;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class QUESTÃO01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        double aluguel;
        double soma;
        double y;
        double r = 0;
        System.out.println("Digite o valor do desconto mensal:");
        y = input.nextDouble();
        for (x = 1; x <= 12; x++) {
            soma = (550) - 550 * y / 100;
            r = soma + r;
        }
        aluguel = 550 + 550 * 10 / 100;
        for (x = 13; x <= 24; x++) {

            soma = (aluguel) - aluguel * y / 100;
            r = soma + r;
        }
        aluguel = (aluguel) + aluguel * 10 / 100;
        for (x = 25; x <= 36; x++) {

            soma = (aluguel) - aluguel * y / 100;
            r = soma + r;
        }
        aluguel = (aluguel) + aluguel * 10 / 100;
        for (x = 37; x <= 48; x++) {

            soma = (aluguel) - aluguel * y / 100;
            r += soma;
        }
        System.out.printf("O valor total do alugel: %.2f \n", r);
    }
}
