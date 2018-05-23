/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class QUESTÃO03 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        y = 1;
        double soma = 0;
        //int cont = 2;
        for (x = 1; x <= 99; x++) {

            double div = (x / y);

            soma = div + soma;
            System.out.println(soma);
            y = y + 1;
        }
    }
}
