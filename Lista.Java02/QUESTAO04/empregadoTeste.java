/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTAO04;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class empregadoTeste {
    public static void main (String [] arg){
        Scanner input = new Scanner (System.in);
        empregado op = new empregado();
        
        System.out.println("Digite o primeiro Nome");
        op.setPnome(input.nextLine());
        System.out.println("Digite o sobrenome:");
        op.setSnome(input.next());
        System.out.println("Digite o salario do empregado: ");
        op.setSal(input.nextDouble());
        
        System.out.println("\n"+op.getPnome());
        System.out.println(op.getSal()+"\n");
        
        System.out.println("Conceder aumento de 10% Digite \n Sim \n Não");
        String x = input.next();
        if (x == "sim"){
          op.aumento();  
        }
        System.out.println("Salario final "+op.getSal());
        
    }
}
