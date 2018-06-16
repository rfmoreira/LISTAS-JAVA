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
public class QUESTÃO07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;


        System.out.println("Digite o primeiro numero ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo ");
        n2 = input.nextInt();
        if (n1 == n2) {
            System.out.println("These numbers are equal.");
        } else if (n1 > n2) {
            System.out.println("Is large: " + n1);
        } else {
            System.out.println("Is large: " + n2);
        }

    }
}
