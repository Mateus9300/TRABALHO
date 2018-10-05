
package MODELO;



public class Contas {

public String nome;
public int numero;
public double saldo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

public double sacar(double valor){  
    if(valor<=this.saldo){
        this.saldo = this.saldo - valor;
        System.out.println("Saque efetuado com Sucesso.");
        return (this.saldo);
    }else
        System.out.println("Saque não pode ser efetuado.");
    return (this.saldo);
}
 

}
