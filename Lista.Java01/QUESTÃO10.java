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
public class QUESTÃO10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        System.out.println("Digite o raio");
        n1 = input.nextInt();
        double dia = 2*n1;
        double circ = 2*(Math.PI*n1);
        double area = (Math.PI*Math.PI)*n1;
        
        System.out.printf("Diametro: %.2f\nCircunferência: %.2f\nArea: %.2f\n",dia, circ, area);
    }
}
