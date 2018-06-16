/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.java01;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class QUESTÃO06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int soma;

        System.out.println("Digite o primeiro numero ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo ");
        n2 = input.nextInt();
        soma = n1 + n2;
        int dif = n1 - n2;
        int prod = n1 * n2;

        System.out.print(" O resultado da soma e: " + soma
                + "\n Resultado da Diferença e: " + dif
                + "\n Resultado do Produto e: " + prod + "\n");
        if (n2 == 0) {
            System.out.println("Divisão invalida");
        } else {
            int div = n1 / n2;
            System.out.print(" Resultado da divisão e: " + div + "\n");
        }
    }
}
