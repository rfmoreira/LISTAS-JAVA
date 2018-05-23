import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class QUESTÃO10 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int pr;
        int dv;
        int cn;
        System.out.println("Dê o valor de n:");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Valor inválido!");
        } else {
            for (pr = 1; pr <= n; pr++) {
                cn = 0;
                for (dv = 1; dv <= pr; dv++) {

                    if (pr % dv == 0) {
                        cn = cn + 1;
                    }
                }
                if (cn == 2) {
                    System.out.println("Primo: " + pr);
                }
            }

        }
    }
}
