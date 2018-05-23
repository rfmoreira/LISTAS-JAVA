
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class QUESTÃO06 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("Entre com 03 numeros inteiros: ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        while (x < y || y < z) {


            int soma = x + y + z;
            int prod = x - y - z;
            double md = (x + y + z) / 2;

            System.out.println("Soma: " + soma);
            System.out.println("Produto: " + soma);
            System.out.println("Media: " + md);
            System.out.println("Entre com 03 numeros inteiros: ");
            x = input.nextInt();
            y = input.nextInt();
            z = input.nextInt();
        }
    }
}
