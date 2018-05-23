
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class QUESTÃO05 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int z = 0;
        int soma1 = 0;
        int soma2 = 0;

        while (z < 1000) {
            System.out.println("Digite um inteiro: ");
            z = input.nextInt();
            double r1 = z % 2;
            if (r1 == 0) {
                soma1 = z + soma1;
            } else {
                soma2 = z + soma2;
            }
        }
        System.out.println("Soma de numeros pares " + soma1);
        System.out.println("Soma de numeros impares " + soma2);


    }
}
