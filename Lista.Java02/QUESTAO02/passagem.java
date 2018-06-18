/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTAO02;

/**
 *
 * @author rafael
 */
public class passagem {
    private String origem;
    private String destino;
    private double valor;
    private String tpg;

  
    private String npass;
    private String cpf;
    private String ida;
    private String volta;

    public passagem() {
    }  
    
    public String getTpg() {
        return tpg;
    }

    public void setTpg(String tpg) {
        this.tpg = tpg;
        if (tpg == "1"){
            this.valor = 2000;
        }else
            this.valor = 3000;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNpass() {
        return npass;
    }

    public void setNpass(String npass) {
        this.npass = npass;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIda() {
        return ida;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public String getVolta() {
        return volta;
    }

    public void setVolta(String volta) {
        this.volta = volta;
    }
    
    
    
}
