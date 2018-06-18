/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTAO01;

/**
 *
 * @author rafael
 */
public class conta {

    private double saldo;

    public void setSaldo(double deposito) {
        this.saldo = deposito;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public conta() {
    }

    public void setSaldo(float saque) {
        if (this.saldo < saque) {
         
        } else {
            this.saldo -= saque;
        }
    }
}
