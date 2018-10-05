package MODELO;

import VISAO.JFrame1;
import javax.swing.JOptionPane;

public class Main {
    
    //C - CONTA COMUM
    public static double cs;
    public static int cn;
    public static String ct;
    
    // E - CONTA ESPECIAL
    public static double es;
    public static int en;
    public static String et;
    public static double el;
    public static double em;
    
    // P - CONTA POUPANÇA
    public static double ps;
    public static int pn;
    public static String pt;
    public static double pr;
    
    
    
    
    public static void main(String[] args) {
               
        Contas obj1 = new Contas();
        ContaEspecial obj2 = new ContaEspecial();
        ContaPoupanca obj3 = new ContaPoupanca();
               
        obj1.setNome(JOptionPane.showInputDialog(null,"---CONTA COMUM---\n"+"INSIRA O NOME: "));
        
        
        obj1.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"---CONTA COMUM---\n"+"INSIRA O NUMERO DA CONTA: ")));
        

        obj1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,"---CONTA COMUM---\n"+"INSIRA O SALDO: ")));
        
        
        cs = obj1.getSaldo();
        cn = obj1.getNumero();
        ct = obj1.getNome();
        
        obj2.setNome(JOptionPane.showInputDialog(null,"---CONTA ESPECIAL---\n"+"INSIRA O NOME: "));
                
        obj2.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"---CONTA ESPECIAL---\n"+"INSIRA O NUMERO DA CONTA: ")));
        
        obj2.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,"---CONTA ESPECIAL---\n"+"INSIRA O SALDO: ")));
        
        obj2.setLimite(Double.parseDouble(JOptionPane.showInputDialog(null,"---CONTA ESPECIAL---\n"+"INSIRA O LIMITE PARA A CONTA: ")));
        
        obj2.setMulta(Double.parseDouble(JOptionPane.showInputDialog(null,"---CONTA ESPECIAL---\n"+"INSIRA A MULTA PARA CHEQUE ESPECIAL: ")));
       
        et = obj2.getNome();
        en = obj2.getNumero();
        es = obj2.getSaldo();
        el = obj2.getLimite();
        em = obj2.getMulta();
        
        obj3.setNome(JOptionPane.showInputDialog(null,"---CONTA POUPANÇA---\n"+"INSIRA O NOME: "));
                
        obj3.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"---CONTA POUPANÇA---\n"+"INSIRA O NUMERO DA CONTA: ")));
        
        obj3.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,"---CONTA POUPANÇA---\n"+"INSIRA O SALDO: ")));
        
        
        pt = obj3.getNome();
        pn = obj3.getNumero();
        ps = obj3.getSaldo();
        
        JFrame1 frm = new JFrame1();
        frm.setVisible(true);
  
    }

  
}
