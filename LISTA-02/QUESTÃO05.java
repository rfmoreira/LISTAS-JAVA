/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class QUESTÃO05 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com três numeros: ");
        double n1 = input.nextInt();
        double n2 = input.nextInt();
        double n3 = input.nextInt();

        System.out.print("Escola a opção desejada: \n 1 - Calcular Media \n 2 - Soma "
                + "\n 3 - Multiplicação \n ");
        int op = input.nextInt();

        if (op == 1) {
            double md = (n1 + n2 + n3) / 3;
            System.out.println("A media dos tres numeros e: " + md);

        } else if (op == 2) {
            double sm = n1 + n2 + n3;
            System.out.println("A soma dos numeros e: " + sm);

        } else if (op == 3) {
            double mt = n1 * n2 * n3;
            System.out.println("A multplicação e: " + mt);
        }

    }
}
