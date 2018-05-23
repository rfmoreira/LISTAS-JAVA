
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafael
 */
public class QUESTÃO01 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int x;
        double y;
        double z;
        z = 0;
        y = 0;
        for (x = 1; x <= 15; x++) {
            System.out.print("Digite 15 valores: ");
            double n1 = input.nextDouble();
            if (x == 1) {
                y = n1;
                z = n1;
            }
            if (n1 > y) {
                y = n1;
            } else if (n1 < z) {
                z = n1;
            }
        }
        System.out.println("O maior valor e: " + y);
        System.out.println("O menor valor e: " + z);


    }
}
