/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fundamentos.java;

/**
 *
 * @author 3_DEV
 */
public class FormPizza extends javax.swing.JFrame {

    /**
     * Creates new form FormPizza
     */
    public FormPizza() {
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

        jLabel1 = new javax.swing.JLabel();
        jTFp1Nome = new javax.swing.JTextField();
        jTFp1preco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFp2Nome = new javax.swing.JTextField();
        jTFp2preco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFp3Nome = new javax.swing.JTextField();
        jTFbebidaPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFp3preco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSdividirConta = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAconta = new javax.swing.JTextArea();
        jBcalcularConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conta");

        jTFp1Nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFp1Nome.setText("Nome da pizza 1");
        jTFp1Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFp1NomeActionPerformed(evt);
            }
        });

        jTFp1preco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFp1preco.setToolTipText("preço");
        jTFp1preco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFp1preco.setName(""); // NOI18N
        jTFp1preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFp1precoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Pizza 1:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Pizza 2:");

        jTFp2Nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFp2Nome.setText("Nome da pizza 2");
        jTFp2Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFp2NomeActionPerformed(evt);
            }
        });

        jTFp2preco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFp2preco.setToolTipText("preço");
        jTFp2preco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFp2preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFp2precoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Pizza 3:");

        jTFp3Nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFp3Nome.setText("Nome da pizza 3");
        jTFp3Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFp3NomeActionPerformed(evt);
            }
        });

        jTFbebidaPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFbebidaPreco.setToolTipText("");
        jTFbebidaPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFbebidaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFbebidaPrecoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("dividir conta em: ");

        jTFp3preco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFp3preco.setToolTipText("preço");
        jTFp3preco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFp3preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFp3precoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Valor total Bebidas:");

        jSdividirConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSdividirConta.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jTAconta.setEditable(false);
        jTAconta.setColumns(20);
        jTAconta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTAconta.setRows(4);
        jTAconta.setTabSize(4);
        jScrollPane1.setViewportView(jTAconta);

        jBcalcularConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBcalcularConta.setText("Calcular conta");
        jBcalcularConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcalcularContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFbebidaPreco)
                            .addComponent(jSdividirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBcalcularConta)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFp2Nome)
                            .addComponent(jTFp1Nome)
                            .addComponent(jTFp3Nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFp2preco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFp1preco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFp3preco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFp1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFp1preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFp2Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFp2preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFp3Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFp3preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFbebidaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSdividirConta)
                    .addComponent(jBcalcularConta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFp1precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFp1precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFp1precoActionPerformed

    private void jTFp1NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFp1NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFp1NomeActionPerformed

    private void jTFp2NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFp2NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFp2NomeActionPerformed

    private void jTFp2precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFp2precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFp2precoActionPerformed

    private void jTFp3NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFp3NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFp3NomeActionPerformed

    private void jTFbebidaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFbebidaPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbebidaPrecoActionPerformed

    private void jTFp3precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFp3precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFp3precoActionPerformed

    private void jBcalcularContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcalcularContaActionPerformed
        // TODO add your handling code here:
        
        float precoP1 = Float.parseFloat(jTFp1preco.getText());
        float precoP2 = Float.parseFloat(jTFp2preco.getText());
        float precoP3 = Float.parseFloat(jTFp3preco.getText());
        float precoBebida = Float.parseFloat(jTFbebidaPreco.getText());
        
        int quant_pessoas = (int) jSdividirConta.getValue();
        
        float valor = precoP1 + precoP2 + precoP3 + precoBebida;
        
        float gorjeta = valor / 10;
        
        float valorTotal = valor + gorjeta;
        
        float valorPorPessoa = valorTotal / quant_pessoas;
        
        jTAconta.setText(String.valueOf("Valor: R$"+valor+"\nValor gorjeta(10%): R$"+gorjeta+"\nValor Total: R$"+valorTotal+"\nValor Por Pessoa("+quant_pessoas+"): R$"+valorPorPessoa));
        
    }//GEN-LAST:event_jBcalcularContaActionPerformed

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
            java.util.logging.Logger.getLogger(FormPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcalcularConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSdividirConta;
    private javax.swing.JTextArea jTAconta;
    private javax.swing.JTextField jTFbebidaPreco;
    private javax.swing.JTextField jTFp1Nome;
    private javax.swing.JTextField jTFp1preco;
    private javax.swing.JTextField jTFp2Nome;
    private javax.swing.JTextField jTFp2preco;
    private javax.swing.JTextField jTFp3Nome;
    private javax.swing.JTextField jTFp3preco;
    // End of variables declaration//GEN-END:variables
}
