
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafael
 */
public class QUESTÃO04 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        for (int x = 1000; x < 1999; x++) {
            double r = x % 11;
            if (r == 5) {
                System.out.println(x);
            }
        }
    }
}
