/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.java01;
import java.util.Scanner;
/**
 *
 * @author rafael
 */
public class QUESTÃO02 {
    public static void main (String [] agr){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite a distancia dentro dos 12 quilometros percorridos para saber o tempo: ");
        double x = input.nextInt();
        
        double result = (x*60)/20;
        
        System.out.println("O tempo para a distancia " +x+"km foi: "+result+" minutos");
    }
    
}
