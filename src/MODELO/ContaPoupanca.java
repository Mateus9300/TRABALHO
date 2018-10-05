/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

public class ContaPoupanca extends Contas {

    public double reajuste;

    public double getReajuste() {
        return reajuste;
    }

    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }
    
    
    public double reajustar(double taxa){    
        double aux = reajuste;
        reajuste = reajuste * (taxa/100);
        reajuste = aux + reajuste;
        return (reajuste);
    }

    public double reajustar(){
        
        double aux = reajuste;
        reajuste = reajuste * (10.0/100.0);
        reajuste = aux + reajuste;

        return (reajuste);
}
    
    public void tipoConta(){
    
        System.out.println("Conta Poupança");
    
    }

}