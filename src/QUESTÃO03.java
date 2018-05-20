/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class QUESTÃO03 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio de sua lata");
        double r = input.nextDouble();

        System.out.print("Digite a altura de sua lata");
        double a = input.nextDouble();

        double calc = (Math.PI * Math.pow(r, 2) * a);
        System.out.println("O volume da lata de oleo e: " + calc + "\n");
    }
}
