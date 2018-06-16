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
public class QUESTÃO09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        double r;
        System.out.println("Digite dois numeros");
        n1 = input.nextInt();
        n2 = input.nextInt();
        r= n1%n2;
        if (r==0){
            System.out.printf("%d e multiplo de %d\n", n1, n2);
        }else{
            System.out.printf("%d não e multiplo de %d\n", n1, n2);
        }
    }
}
