

import java.util.Scanner;

public class QUESTÃO01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int soma;
        
        System.out.println("Digite o primeiro numero para soma");
        n1 = input.nextInt();
        
        System.out.println("Digite o segundo numero para soma");
        n2 = input.nextInt();
        soma = n1 + n2;
        int dif = n1 - n2;
        int prod = n1*n2;
        int media = (n1+n2)/2;
        
        System.out.print(" O resultado da soma e: " + soma + 
                "\n Resultado da Diferença e: "+ dif +
                "\n Resultado do Produto e: " + prod +
                "\n Resultado da Media e: " + media + "\n");

    }
}
