/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTÃO01;

/**
 *
 * @author aluno
 */
public class MatrizDeInteiros {

    private int vet[][];
    private int linha;
    private int coluna;
    // Construtor
    public MatrizDeInteiros(int vet[][], int l, int c) {
        this.vet = vet;
        this.linha = l;
        this.coluna = c;
        for (int i = 0; i < l; i++){
            for (int j = 0; j < c; j++) {
                this.vet[i][j] = 0;
            }
        }
    }
    //métodos
    public void rParameto(int x, int y, int z) {
        this.vet[x][y] = z;
    }

    public void impMatriz() {
        for (int i = 0; i < this.linha; i++) {
            System.out.println();
            for (int j = 0; j < this.coluna; j++) {
                if (vet[i][j] < 10) {
                    System.out.print("0" + vet[i][j] + " ");
                } else 
                    System.out.print(vet[i][j] + " ");
                    
            }
        }
    }
        public void eQuadrado(){
            boolean teste;
            if (this.linha == this.coluna){
                System.out.println(teste = true);
            }else
                System.out.println(teste = false);
        }
        
        public void Total(){
            int soma=0;
            for(int i=0;i<this.linha;i++){
                for(int j=0; j<this.coluna;j++){
                   soma = this.vet[i][j]+soma;
                    
                }
            }System.out.println("Soma de todas as casa da Matriz e: "+ soma);
        }
     public void local(int x){
         for(int i=0;i<this.linha;i++){
                for(int j=0; j<this.coluna;j++){
                  if (this.vet[i][j]==x){
                      System.out.println("Linha: "+i);
                  } else
                        
                  System.out.println("-1");
                  break;
                }
     }
     }   
    }

    

