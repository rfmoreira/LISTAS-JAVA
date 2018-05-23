
import java.util.Scanner;

public class QUESTÃO02 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        for (x = 1; x<=10; x++) {
            System.out.println("\n");
            for (y = 1; y <= 10; y++) {
                int mult = x*y;
                System.out.print(x + "X" + y + " = " + mult+"\n");
            }

        }

    }
}
