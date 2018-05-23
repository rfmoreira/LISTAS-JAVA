/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class QUESTÃO05 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n1 = input.nextInt();
        double r = Math.pow(n1, 2);

        System.out.print("O resultado do quadrado de " + n1 + " e " + r + "\n");
    }
}
