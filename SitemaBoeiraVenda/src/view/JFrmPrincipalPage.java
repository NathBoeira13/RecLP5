/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author lucas
 */
public class JFrmPrincipalPage extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipalPage
     */
    public JFrmPrincipalPage() {
        initComponents();
        setTitle("Venda de Livros");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnCliente = new javax.swing.JMenu();
        jMnContaCliente = new javax.swing.JMenu();
        jMnFuncionario = new javax.swing.JMenu();
        jMnLogin = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnSair = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMnAgendamentoProduto = new javax.swing.JMenu();
        jMnProduto = new javax.swing.JMenu();
        jMnVendaProduto = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastro");

        jMnCliente.setText("Cliente");
        jMnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMnCliente);

        jMnContaCliente.setText("Conta Cliente");
        jMnContaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnContaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMnContaCliente);

        jMnFuncionario.setText("Funcionario");
        jMnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMnFuncionario);

        jMnLogin.setText("Login");
        jMnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnLoginActionPerformed(evt);
            }
        });
        jMenu1.add(jMnLogin);
        jMenu1.add(jSeparator1);

        jMnSair.setText("Sair");
        jMnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMnSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimento");

        jMnAgendamentoProduto.setText("Agendamento do Produto");
        jMnAgendamentoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnAgendamentoProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMnAgendamentoProduto);

        jMnProduto.setText("Produto");
        jMnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMnProduto);

        jMnVendaProduto.setText("Venda do Produto");
        jMnVendaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnVendaProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMnVendaProduto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnClienteActionPerformed
        // TODO add your handling code here:
        JDlgCliente jDlgCliente = new JDlgCliente(null,true);
        jDlgCliente.setVisible(true);
    }//GEN-LAST:event_jMnClienteActionPerformed

    private void jMnContaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnContaClienteActionPerformed
        // TODO add your handling code here:
        JDlgContaCliente jDlgContaCliente = new JDlgContaCliente(null,true);
        jDlgContaCliente.setVisible(true);
       
    }//GEN-LAST:event_jMnContaClienteActionPerformed

    private void jMnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnFuncionarioActionPerformed
        // TODO add your handling code here:
         JDlgClienteVip jDlgFuncionario = new JDlgClienteVip(null,true);
        jDlgFuncionario.setVisible(true);
    }//GEN-LAST:event_jMnFuncionarioActionPerformed

    private void jMnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnLoginActionPerformed
        // TODO add your handling code here:
         JDlgLogin jDlgLogin = new JDlgLogin(null,true);
        jDlgLogin.setVisible(true);
    }//GEN-LAST:event_jMnLoginActionPerformed

    private void jMnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnSairActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jMnSairActionPerformed

    private void jMnAgendamentoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnAgendamentoProdutoActionPerformed
        // TODO add your handling code here:
        JDlgAgendamentoProduto jDlgAgendamentoProduto = new JDlgAgendamentoProduto(null,true);
        jDlgAgendamentoProduto.setVisible(true);
    }//GEN-LAST:event_jMnAgendamentoProdutoActionPerformed

    private void jMnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnProdutoActionPerformed
        // TODO add your handling code here:
         JDlgentrega jDlgProduto = new JDlgentrega(null,true);
        jDlgProduto.setVisible(true);
    }//GEN-LAST:event_jMnProdutoActionPerformed

    private void jMnVendaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnVendaProdutoActionPerformed
        // TODO add your handling code here:
         JDlgVendaProduto jDlgVendaProduto = new JDlgVendaProduto(null,true);
        jDlgVendaProduto.setVisible(true);
    }//GEN-LAST:event_jMnVendaProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipalPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnAgendamentoProduto;
    private javax.swing.JMenu jMnCliente;
    private javax.swing.JMenu jMnContaCliente;
    private javax.swing.JMenu jMnFuncionario;
    private javax.swing.JMenu jMnLogin;
    private javax.swing.JMenu jMnProduto;
    private javax.swing.JMenu jMnSair;
    private javax.swing.JMenu jMnVendaProduto;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}