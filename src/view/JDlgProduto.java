/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JbsProduto;
import dao.ProdutoDAO;
import java.util.List;
import tools.Util;
import view.JDlgProdutoIA;

/**
 *
 * @author Janaína B da Silva
 */
public class JDlgProduto extends javax.swing.JDialog {
    
//    JDlgProdutoIA jDlgProdutoIA;
    ProdutoDAO produtoDAO;
    JbsProduto jbsProduto;
    ProdutoControle produtoControle;
    private JDlgProdutoIA jDlgProdutoIA;
    /**
     * Creates new form JDlgProduto
     */
    public JDlgProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         setTitle("Cadastro de Produto");
        setLocationRelativeTo(null);
        
        jDlgProdutoIA = new JDlgProdutoIA(null, true);
        produtoDAO = new ProdutoDAO();
        List lista = produtoDAO.listAll();
        produtoControle = new ProdutoControle();
        produtoControle.setList(lista);
        jTable1.setModel(produtoControle);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        JBS_jBtnIncluir = new javax.swing.JButton();
        JBS_jBtnAlterar = new javax.swing.JButton();
        JBS_jBtnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JBS_jBtnIncluir.setText("Incluir");
        JBS_jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBS_jBtnIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(JBS_jBtnIncluir);

        JBS_jBtnAlterar.setText("Alterar");
        JBS_jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBS_jBtnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(JBS_jBtnAlterar);

        JBS_jBtnExcluir.setText("Excluir");
        JBS_jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBS_jBtnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(JBS_jBtnExcluir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBS_jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBS_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        jDlgProdutoIA.setTitle("Inclusão");
        jDlgProdutoIA.setVisible(true);
    }//GEN-LAST:event_JBS_jBtnIncluirActionPerformed

    private void JBS_jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBS_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        jDlgProdutoIA.setTitle("Alteração");
        jDlgProdutoIA.setVisible(true);
    }//GEN-LAST:event_JBS_jBtnAlterarActionPerformed

    private void JBS_jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBS_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if(Util.perguntar("Deseja excuir o produto?") == true){

        }
    }//GEN-LAST:event_JBS_jBtnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgProduto dialog = new JDlgProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBS_jBtnAlterar;
    private javax.swing.JButton JBS_jBtnExcluir;
    private javax.swing.JButton JBS_jBtnIncluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
