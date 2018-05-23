/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class QUESTÃO02 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        double c;
        double f, r;
        System.out.print("Digite o valor e graus Centígrados: ");
        c = input.nextInt();

        r = (9 * c + 160) / 5;
        System.out.print("Resultado da conversão e:" + r + "\n");



    }
}
