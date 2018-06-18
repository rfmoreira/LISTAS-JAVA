/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTAO03;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class TesteFatura {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        Fatura op = new Fatura();
        
        System.out.println("Digite o codigo da fatura: ");
        op.setNum(input.nextLine());
        
        System.out.println("Digite o valor: ");
        op.setPreco(input.nextDouble());
        
        System.out.println("Quantidade: ");
        op.setQtd(input.nextInt());
        
        System.out.println("Digite valor de desconto: ");
        op.setDesc(input.nextDouble());
        
        op.setPfinal(op.getPreco()*op.getQtd() - op.getDesc());
        
        System.out.println("Codigo: "+ op.getNum());
        System.out.println("Valor: R$ "+ op.getPreco());
        System.out.println("Quantidade: "+ op.getQtd());
        System.out.println("Desconto: R$ "+ op.getDesc());
        System.out.println("Valor final: R$ "+ op.getPfinal());
        

    }
}
