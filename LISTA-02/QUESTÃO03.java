/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class QUESTÃO03 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite três notas: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double r = (n1+n2+n3)/3;
        
        if (n1> n2 && n1> n3){
            System.out.print("A maior nota e: "+ n1+"\n");
              
        }else if(n2 > n1 && n2>n3){
            System.out.print("A maior nota foi: "+n2+"\n");
        }else if (n3>n1 && n3>n2){
            System.out.print("A maior nota foi: "+n3+"\n");
        }
        System.out.println("A media das notas e : "+r);
    }
    
}
