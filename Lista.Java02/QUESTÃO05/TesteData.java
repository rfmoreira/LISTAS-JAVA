/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTÃO05;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class TesteData {
    public static void main (String[]arg){
        Scanner input = new Scanner (System.in);
        Data op = new Data();
        System.out.println("Digite o dia: ");
        op.setDia(input.nextInt());
        System.out.println("Digite o mês");
        op.setMes(input.nextInt());
        System.out.println("Digite o Ano: ");
        op.setAno(input.nextInt());
        
        op.exibeData();
    }
}
