/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.java01;

import java.util.Scanner;

public class QUESTÃO03 {
    public static void main (String [] agr){
        Scanner input = new Scanner (System.in);
        System.out.println("Quantos digitos tem seu numero: ");
        int x = input.nextInt();
        int cont=0;
         String s="";
        do{
            System.out.println("Digite o valor");   
            String y = input.next();
            
            String z = y;
            s += z;
        cont += 1;
  }while (cont < x); 
        
        System.out.println(s);
}
    
}