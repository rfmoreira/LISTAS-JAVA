/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTAO02;
import java.util.Scanner;
/**
 *
 * @author rafael
 */
public class operacao {
    public static void main (String [] arg){
        Scanner input = new Scanner (System.in);
        passagem op = new passagem();
        System.out.println("Digite a cidade e pais de origem: ");
        op.setOrigem(input.nextLine());
        
        System.out.println("Digite a cidade e pais de destino: ");
        op.setDestino(input.nextLine());
        
        System.out.println("Tipo de pagamento \n 1- Boleto \n 2- Cartão de Credito");
        op.setTpg(input.nextLine());
        
        System.out.println("Digite o nome completo:");
        op.setNpass(input.nextLine());
        
        System.out.println("Digite o cpf:");
        op.setCpf(input.next());
        
        System.out.println("Digite data de ida:");
        op.setIda(input.next());
        
        System.out.println("Digite data de volta:");
        op.setVolta(input.next());
        
        System.out.println("Obrigado por escolher a nossa agência aérea");
        System.out.print("Origem: "+op.getOrigem()+"  ");  System.out.println("Destino: "+op.getDestino());
        System.out.println("Valor: "+op.getValor());
        System.out.println("Nome: "+op.getNpass());
        System.out.println("CPF: "+op.getCpf());
        System.out.println("Data de Ida: "+op.getIda());
        System.out.println("Data de Volta: "+op.getVolta());
        System.out.println("Desejamos que tenha um excelente vôo!!!");
    }
}
