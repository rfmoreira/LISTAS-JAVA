/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTÃO01;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho da matriz[i][j]");
        int linha = input.nextInt();
        int coluna = input.nextInt();
        int totM = linha * coluna;
        int matriz[][] = new int [linha][coluna];
                
        MatrizDeInteiros op = new MatrizDeInteiros(matriz,linha,coluna); 
        
        System.out.println("Matriz Quadrada ?");
        op.eQuadrado();
        int cont=0;
        while (cont <totM){
        System.out.println("Informe a linha");
        int l = input.nextInt();
        if (l > linha){
            System.out.println("Erro");
            break;
        }
        System.out.println("Informe a coluna");
        int c = input.nextInt();
        if (c > coluna){
            System.out.println("Erro");
            break;
        }
        System.out.println("Informe um valor para essa posição");
        int z = input.nextInt();
        
        op.rParameto(l, c, z);
        op.impMatriz();
            System.out.println();
        cont++;
        }
        op.Total();
        System.out.println("Digite o valor a ser encontrado");
        op.local(input.nextInt());
    }
}
