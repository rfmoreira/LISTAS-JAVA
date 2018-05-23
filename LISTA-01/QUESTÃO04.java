
import java.util.Scanner;

public class QUESTÃO04 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1º valor ");
        int n1 = input.nextInt();

        System.out.print("Digite o 2º valor ");
        int n2 = input.nextInt();

        int n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.println("1º numeoro " + n1);
        System.out.print("2º numero " + n2 + "\n");
    }
}
