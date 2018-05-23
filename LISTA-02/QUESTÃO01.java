/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class QUESTÃO01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = input.nextInt();

        if (n1 > 0) {
            System.out.println("O numero " + n1 + " e positivo");
        } else {
            if (n1 == 0) {
                System.out.println("Numero neutro");
            } else {
                System.out.println("O numero " + n1 + " e negativo");
            }
        }
        double r = n1 % 2;
        if (r == 0) {
            System.out.println("Numero par ");
        } else {
            System.out.println("Numero Impar");
        }
    }
}
