/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

public class ContaEspecial extends Contas {  
    public double limite;   
    public double multa;
    
    Main m = new Main();

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double descontar(double valor){
    
       double aux;
           
       
       aux = (valor*m.em)/100;
       valor = valor + aux;
       
    return(valor*(-1));
    }
    
    
    
}