/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISAO;

import MODELO.ContaEspecial;
import MODELO.ContaPoupanca;
import MODELO.Contas;
import MODELO.Main;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Windows
 */
public class JFrame1 extends javax.swing.JFrame {
    public int reply;
    public int destino;
    public double cont = 0;
    public double x;
    Contas c = new Contas();
    
    ContaEspecial e = new ContaEspecial();
    
    ContaPoupanca p = new ContaPoupanca();
    
    Main m = new Main();
    
    
    
    
    public double pegar(double x){
    
    this.x = x;
      
    return this.x;
    
    }
    
    
    /**
     * Creates new form JFrame1
     */
    public JFrame1() {
        initComponents();
    }

    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("SAQUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DEPOSITO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("TRANSFERENCIA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("REAJUSTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("VER SALDO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("SAIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BEM VINDO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        double saque=0;
        int aux;
        
        aux = Integer.parseInt(JOptionPane.showInputDialog(this, "INSIRA O NUMERO DA CONTA"));      
        
        if(aux == m.cn){
        
        saque = Double.parseDouble(JOptionPane.showInputDialog(this, "INFORME O VALOR A SER SACADO"));
        
        
            if(saque <= m.cs){
                pegar(saque);       

                c.setSaldo(m.cs);
         
                        
                m.cs = (m.cs-x); 
                
                
                
                
                JOptionPane.showMessageDialog(null, "OPERAÇAO REALIZADA VIA CONTA COMUM\n"+"\nCliente: "+ m.ct + "\nNumero: "+ m.cn + "\nSaldo Atual: " + m.cs);

                
            }else{
                JOptionPane.showMessageDialog(null,"CONTA COMUM NÃO POSSUI SALDO SUFICIENTE");
                
                
                
                if(cont==0 && saque <= (m.es+m.el)){
                    
                    
                    double temp;
                    pegar(saque);
                    
                    temp = (x - m.es);
                                       
                    
                    m.el = (m.el-temp);
                                                         
                    temp = e.descontar(temp);
                    
                    
                    
                    m.es = temp;
                    
                    m.el = 0;
                    
                    cont = 1;
                    
                    
                    JOptionPane.showMessageDialog(null,"OPERAÇÃO REALIZADA USANDO CHEQUE ESPECIAL\n"+
                     "Cliente: "+ m.et + "\nNumero: "+ m.en + "\nSaldo Atual: " + m.es );
                    
                    
                    
                    
                    
                }                                     
                }
                }
                else            
                    if(aux == m.en){
                
                    saque = Double.parseDouble(JOptionPane.showInputDialog(this, "INFORME O VALOR A SER SACADO"));
                    
                    if(saque<=m.es){
                    
                     pegar(saque);       

                     c.setSaldo(m.es);
                                 
                     m.es = c.sacar(x);

                     JOptionPane.showMessageDialog(null, "OPERAÇAO REALIZADA VIA CONTA ESPECIAL\n"+"\nCliente: "+ m.et + "\nNumero: "+ m.en + "\nSaldo Atual: " + m.es);

                     System.out.println("ENTRANDO AQUI");
                        
                    
                    }
                    
                    else                        
                        if(cont==0 && saque<= (m.es + m.el)){

                        double temp;
                        pegar(saque);

                        temp = (x - m.es);

                        c.setSaldo((m.es+m.el));

                        m.el = (m.el-temp);

                        c.sacar(x);

                        temp = e.descontar(temp);

                        m.es = temp;

                        m.el = 0;
                        cont =1;
                        
                        JOptionPane.showMessageDialog(null,"OPERAÇÃO REALIZADA USANDO CHEQUE ESPECIAL\n"+
                         "Cliente: "+ m.et + "\nNumero: "+ m.en + "\nSaldo Atual: " + m.es );

                        System.out.println("ENTRANDO AQUI");
                    
                    
                    }else
                            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE OU LIMITE DE CREDITO JÁ ULTILIZADO");
                    }else
                        
                        if(aux == m.pn){
                            saque = Double.parseDouble(JOptionPane.showInputDialog(this, "INFORME O VALOR A SER SACADO"));
                        
                            if(saque<=m.ps){
                                pegar(saque);       

                                c.setSaldo(m.ps);
                                
                                m.ps = (m.ps-saque);
                                
                                c.sacar(x);

                                JOptionPane.showMessageDialog(null, "OPERAÇAO REALIZADA VIA CONTA POUPANÇA\n"+"\nCliente: "+ m.pt + "\nNumero: "+ m.pn + "\nSaldo Atual: " + m.ps);

                                m.ps = c.getSaldo();
                                
                            
                            }else
                                JOptionPane.showMessageDialog(null, "CONTA POUPANÇA NÃO POSSUI SALDO SUFICIENTE");
                           
                            
                            
                        }else
                            JOptionPane.showMessageDialog(null,"CLIENTE NÃO EXISTE");
                        
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int conta;
       double deposito;
        
        conta = Integer.parseInt(JOptionPane.showInputDialog(this, "INSIRA O NUMERO DA CONTA PARA DEPOSITO"));
        
        if(conta == m.pn){  
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog(this,"VALOR DO DEPOSITO: "));
        
        m.ps = (m.ps+deposito);
        
        JOptionPane.showMessageDialog(null,"\nCLIENTE :"+ m.pt+"\nCONTA: "+m.pn+"\nSALDO: "+m.ps);
        
        }else{
        
            if(conta == m.cn){
            
                deposito = Double.parseDouble(JOptionPane.showInputDialog(this,"VALOR DO DEPOSITO: "));

                m.cs = (m.cs+deposito);

                JOptionPane.showMessageDialog(null,"\nCLIENTE :"+ m.ct+"\nCONTA: "+m.cn+"\nSALDO: "+m.cs);
        
                
            }else{
            
                if(conta == m.en){
                deposito = Double.parseDouble(JOptionPane.showInputDialog(this,"VALOR DO DEPOSITO: "));

                m.es = (m.es+deposito);

                JOptionPane.showMessageDialog(null,"\nCLIENTE :"+ m.et+"\nCONTA: "+m.en+"\nSALDO: "+m.es);                
                
                
                }else
                    JOptionPane.showMessageDialog(null,"CONTA INEXISTENTE");
      
            }
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int reply = 0;
        int origem; 
        double valor;
        origem = Integer.parseInt(JOptionPane.showInputDialog(this,"INSIRA O NUMERO DA CONTA DE ORIGEM"));
            if(origem == m.cn){
                valor = Double.parseDouble(JOptionPane.showInputDialog(this,"INSIRA O VALOR A SER TRANSFERIDO"));
                if(valor<=m.cs){
                destino = Integer.parseInt(JOptionPane.showInputDialog(this,"INSIRA A CONTA DE DESTINO"));
                
                if(destino == m.en){
                
                reply = JOptionPane.showConfirmDialog(null, "TITULAR DA CONTA ORIGEM: "+ m.ct
                +"\nTITULAR DA CONTA DESTINO: "+ m.et, "DESEJA CONFIRMAR:", 
                JOptionPane.YES_OPTION);
                               
                if(reply == JOptionPane.YES_OPTION){
                
                    m.cs = (m.cs-valor);
                    m.es = (m.es+valor);
                 JOptionPane.showMessageDialog(null, "TRANSFERENCIA CONCLUIDA COM SUCESSO");
                }
                }
                
                if(destino == m.pn){
                
                reply = JOptionPane.showConfirmDialog(null, "TITULAR DA CONTA ORIGEM: "+ m.ct
                +"\nTITULAR DA CONTA DESTINO: "+ m.pt, "DESEJA CONFIRMAR:", 
                JOptionPane.YES_OPTION);
           
                if(reply == JOptionPane.YES_OPTION )
                    m.cs = (m.cs-valor);
                    m.ps = (m.ps+valor);
                 JOptionPane.showMessageDialog(null, "TRANSFERENCIA CONCLUIDA COM SUCESSO");
                
                }
                if(destino != m.en && destino != m.pn )
                    JOptionPane.showMessageDialog(null, "CONTA DE DESTINO INVALIDA");
                
                
                }else
                    JOptionPane.showMessageDialog(null,"SALDO INSUFICIENTE");
                }
            
            if(origem == m.en){
                valor = Double.parseDouble(JOptionPane.showInputDialog(this,"INSIRA O VALOR A SER TRANSFERIDO"));
                if(valor<=m.es){
                destino = Integer.parseInt(JOptionPane.showInputDialog(this,"INSIRA A CONTA DE DESTINO"));
                
                if(destino == m.cn){
                
                reply = JOptionPane.showConfirmDialog(null, "TITULAR DA CONTA ORIGEM: "+ m.et
                +"\nTITULAR DA CONTA DESTINO: "+ m.ct, "DESEJA CONFIRMAR:", 
                JOptionPane.YES_OPTION);
                    
                    
                
                
                if(reply == JOptionPane.YES_OPTION){
                    m.es = (m.es-valor);
                    m.cs = (m.cs+valor);
                 JOptionPane.showMessageDialog(null, "TRANSFERENCIA CONCLUIDA COM SUCESSO");
                
                }
                }
                if(destino == m.pn){
                
                reply = JOptionPane.showConfirmDialog(null, "TITULAR DA CONTA ORIGEM: "+ m.et
                +"\nTITULAR DA CONTA DESTINO: "+ m.pt, "DESEJA CONFIRMAR:", 
                JOptionPane.YES_OPTION);
                    
                    
                
                
                
                if(reply == JOptionPane.YES_OPTION ){
                    m.es = (m.es-valor);
                    m.ps = (m.ps+valor);
                 JOptionPane.showMessageDialog(null, "TRANSFERENCIA CONCLUIDA COM SUCESSO");
                }
                }
                if(destino != m.pn && destino != m.cn )
                    JOptionPane.showMessageDialog(null, "CONTA DE DESTINO INVALIDA");
                
                
                }else
                    JOptionPane.showMessageDialog(null,"SALDO INSUFICIENTE");
               }
            
            if(origem== m.pn){
            
                valor = Double.parseDouble(JOptionPane.showInputDialog(this,"INSIRA O VALOR A SER TRANSFERIDO"));
                if(valor<=m.ps){
                destino = Integer.parseInt(JOptionPane.showInputDialog(this,"INSIRA A CONTA DE DESTINO"));
                
                if(destino == m.en){
                
                reply = JOptionPane.showConfirmDialog(null, "TITULAR DA CONTA ORIGEM: "+ m.pt
                +"\nTITULAR DA CONTA DESTINO: "+ m.et, "DESEJA CONFIRMAR:", 
                JOptionPane.YES_OPTION);
                    
                    
                
                    m.ps = (m.ps-valor);
                    m.es = (m.es+valor);
                 JOptionPane.showMessageDialog(null, "TRANSFERENCIA CONCLUIDA COM SUCESSO");
                }
                
                
                if(destino == m.cn){
                
                reply = JOptionPane.showConfirmDialog(null, "TITULAR DA CONTA ORIGEM: "+ m.pt
                +"\nTITULAR DA CONTA DESTINO: "+ m.ct, "DESEJA CONFIRMAR:", 
                JOptionPane.YES_OPTION);
                    
                    
                
                    m.ps = (m.ps-valor);
                    m.cs = (m.cs+valor);
                 JOptionPane.showMessageDialog(null, "TRANSFERENCIA CONCLUIDA COM SUCESSO");
                }
                if(destino != m.en && destino != m.cn )
                    JOptionPane.showMessageDialog(null, "CONTA DE DESTINO INVALIDA");
                
                
                }else
                    JOptionPane.showMessageDialog(null,"SALDO INSUFICIENTE");
                
                
            }
            if(origem != m.cn && origem != m.en && origem != m.pn)
                JOptionPane.showMessageDialog(null,"CONTA DE ORIGEM INVALIDA");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int conta;
        
        String q = JOptionPane.showInputDialog(null, "INSIRA O VALOR DO REAJUSTE");
        conta = Integer.parseInt(JOptionPane.showInputDialog(null, "INSIRA A CONTA POUPANÇA QUE DESEJA REAJUSTAR: "));
        if(conta == m.pn){
           
            
            
            if(q.isEmpty()|| q == null){
                
                p.setReajuste(m.ps);
                m.ps = p.reajustar();  
                JOptionPane.showMessageDialog(null, "REAJUSTE CONCLUIDO");
            }else{
                m.pr = Double.parseDouble(q);
            if(m.pr>=0){
                
                p.setReajuste(m.ps);
                m.ps = p.reajustar(m.pr);
                
            JOptionPane.showMessageDialog(null, "REAJUSTE CONCLUIDO");
            }else
                JOptionPane.showMessageDialog(null, "INSIRA UM VALOR POSITIVO");
           }
                
            
            
        }else
            JOptionPane.showMessageDialog(null, "CONTA POUPANÇA INVALIDA");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            
        
        JOptionPane.showMessageDialog(null,"---CONTA COMUM---: "+"\nCLIENTE: "+m.ct+"\nNUMERO DA CONTA: "+m.cn+"\nSALDO: "+m.cs+
                "\n\n---CONTA ESPCIAL---: "+"\nCLIENTE: "+m.et+"\nNUMERO DA CONTA: "+m.en+"\nSALDO: "+m.es+"\nSALDO CHEQUE ESPECIAL: "+m.el+
                "\n\n---CONTA POUPANÇA---: "+"\nCLIENTE: "+m.pt+"\nNUMERO DA CONTA: "+m.pn+"\nSALDO: "+m.ps);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed
    
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
