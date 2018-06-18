/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTAO03;

/**
 *
 * @author rafael
 */
public class Fatura {

    private String num;
    private double desc;
    private int qtd;
    private double preco;
    private double pfinal;

    

    public void setNum(String num) {
        this.num = num;

    }

    public String getNum() {
        return this.num;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public double getDesc() {
        return this.desc;
    }

    public void setQtd(int qtd) {
            int x = qtd;
        if (x < 0) {
        } else {
            this.qtd = qtd;
        }
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setPreco(double preco) {
        double x = preco;
        if (x <= 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return this.preco;
    }
    public void setPfinal(double pfinal){
        this.pfinal = pfinal;//*(this.qtd);
        //this.pfinal = this.pfinal - this.desc;
    }
    public double getPfinal(){
        return this.pfinal;
    }
    public Fatura() {
    }
}
