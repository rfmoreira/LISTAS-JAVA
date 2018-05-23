/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class QUESTÃO02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iforme a medida dos três lados do triangulo");
        double l1 = input.nextDouble();
        double l2 = input.nextDouble();
        double l3 = input.nextDouble();

        if (l1 + l2 > l3 && l2 + l3 > l1 && l3 + l1 > l2) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triangulo Equilatero");
            } else if (l1 == l2 || l2 == l3) {
                System.out.println("Triangulo Isóceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }
        }
    }
}
