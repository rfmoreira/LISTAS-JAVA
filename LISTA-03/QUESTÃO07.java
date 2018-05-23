
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class QUESTÃO07 {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        double m1 = 0;
        double m2 = 0;
        double soma = 0;
        System.out.println("Digite a quantidade de Alunos da turma: ");
        x = input.nextInt();

        for (y = 0; y <= x; y++) {
            System.out.println("Digite a media de cada aluno");
            int z = input.nextInt();

            if (m1 == 0) {
                m1 = z;
                m2 = z;
            }
            if (z > m1) {
                m1 = z;
            } else if (z < m2) {
                m2 = z;
            }
            if (z < 0) {
                y = x;
            }
            soma = soma + z;
        }
        System.out.println("A maior media: " + m1);
        System.out.println("A menor media: " + m2);
        System.out.println("A media aritimetica da turma: " + (soma) / x);
    }
}
