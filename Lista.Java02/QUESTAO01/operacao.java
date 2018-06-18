/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTAO01;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class operacao {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        conta op = new conta();
        System.out.println("Escolha a opção desejada\n 1-Deposito \n 2-Saque \n 3-Consulta de Saldo \n 4-Sair");
        int opcao = input.nextInt();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para deposito ");
                    op.setSaldo(input.nextDouble());
                    System.out.println("Escolha a opção desejada\n 1-Deposito \n 2-Saque \n 3-Consulta de Saldo \n 4-Sair");
                    opcao = input.nextInt();
                    break;
                case 2:
                    System.out.println("Digite o valor de Saque:");
                    op.setSaldo(input.nextFloat());
                   
                    System.out.println("Escolha a opção desejada\n 1-Deposito \n 2-Saque \n 3-Consulta de Saldo \n 4-Sair");
                    opcao = input.nextInt();
                    break;
                case 3:
                    System.out.println("Seu saldo e: ");
                    System.out.println(op.getSaldo());
                    
                    System.out.println("\n Escolha a opção desejada\n 1-Deposito \n 2-Saque \n 3-Consulta de Saldo \n 4-Sair");
                    opcao = input.nextInt();
            }
        }
    }
}
