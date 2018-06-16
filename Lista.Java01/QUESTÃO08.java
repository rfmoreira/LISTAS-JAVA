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
public class QUESTÃO08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("Digite o primeiro numero ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo ");
        n2 = input.nextInt();
        System.out.println("Digite o terceiro ");
        n3 = input.nextInt();
       
        int soma = n1 + n2 + n3;
        int prod = n1*n2*n3;
        double med = (n1+n2+n3)/3;
        
        System.out.println("Soma: "+soma);
        System.out.println("Produto: "+prod);
        System.out.printf("Media %.0f\n", med);
        if (n1>n2 && n2>n3){
            System.out.printf("Maior: "+n1+"\nMenor: "+n3);      
        }else if (n1>n3 && n3>n2){
            System.out.println("Maior: "+n1+"\nMenor: "+n2);
        }else if (n2>n1 && n1>n3){
            System.out.println("Maior: "+n2+"\nMenor: "+n3);
        }else if (n2>n3 && n3>n1){
            System.out.println("Maior: "+n2+"\nMenor: "+n1);
        }else if (n3>n1 && n1>n2){
            System.out.println("Maior: "+n3+"\nMenor: "+n2);
        }else if (n3>n2 && n2>n1){
            System.out.println("Maior: "+n3+"\nMenor: "+ n1);
        }else if (n1==n2 && n2==n3){
            System.out.println("Maior: "+n3+"\nMenor: "+ n1);
        
    }
        
}
    }
