/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTAO04;

public class empregado {

    private String pnome;
    private String snome;
    private double sal;

    public void setPnome(String pnome) {
        this.pnome = pnome;
    }

    public String getPnome() {
        return this.pnome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getSnome() {
        return this.getSnome();
    }

    public void setSal(double sal) {
        sal = sal;
        if (sal <= 0) {
            this.sal = 0;
        } else {
            this.sal = sal;
        }
    }

    public double getSal() {
        return this.sal;
    }
    public void aumento (){
        
        this.sal = (this.sal*10/100);
    }

    public void empregado() {
    }
}
