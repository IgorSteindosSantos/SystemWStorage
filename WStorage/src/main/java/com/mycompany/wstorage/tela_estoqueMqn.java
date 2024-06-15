/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.wstorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Igor Stein
 */
public class tela_estoqueMqn extends javax.swing.JFrame {
    //Estabelecendo conexão com o banco
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "";
    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet resultado = null;
    
    /**
     * Creates new form tela_estoqueMqn
     */
    public tela_estoqueMqn() {
        initComponents();
    }
    
    public void  tb_maquina (String sql){
    try {
        conexao = DriverManager.getConnection(url,usuario,senha);            
        statement = (PreparedStatement)conexao.prepareStatement(sql);
        statement.execute(); // criar o vetor
        resultado = statement.executeQuery(sql);
        DefaultTableModel model = (DefaultTableModel) tb_estoqueMaquinas.getModel();
        model.setNumRows(0);
                    
            while (resultado.next()){
                model.addRow(new Object[] {
                //retorna os dados da tabela do BD, cada campo e um coluna.
                resultado.getString("id_maquina"),
                resultado.getString("nome"),
                resultado.getString("numero_serie"),
                resultado.getString("dimensoes"),
                resultado.getString("modelo"),
                resultado.getString("nome_local"),
                resultado.getString("status")
                });
            }
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(tela_localizacao.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        lbl_estoque = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_pesquisar = new javax.swing.JTextField();
        btn_equipamentos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_estoqueMaquinas = new javax.swing.JTable();
        lbl_home = new javax.swing.JLabel();
        lbl_pesquisar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WStorage");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_estoque.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_estoque.setText("Estoque Máquinas");

        txt_pesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_pesquisar.setForeground(new java.awt.Color(204, 204, 204));
        txt_pesquisar.setText("Pesquisar por...");
        txt_pesquisar.setToolTipText("");
        txt_pesquisar.setPreferredSize(new java.awt.Dimension(64, 30));

        btn_equipamentos.setBackground(new java.awt.Color(32, 107, 165));
        btn_equipamentos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_equipamentos.setForeground(new java.awt.Color(255, 255, 255));
        btn_equipamentos.setText("Equipamentos");
        btn_equipamentos.setPreferredSize(new java.awt.Dimension(98, 30));
        btn_equipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipamentosActionPerformed(evt);
            }
        });

        tb_estoqueMaquinas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tb_estoqueMaquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Numero de Serie", "Dimensoes", "Modelo", "Localização", "Situação"
            }
        ));
        jScrollPane1.setViewportView(tb_estoqueMaquinas);

        lbl_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Igor Stein\\Desktop\\SystemWStorage\\SystemWStorage\\WStorage\\src\\main\\java\\imagem\\icon_home.png")); // NOI18N
        lbl_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homeMouseClicked(evt);
            }
        });

        lbl_pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Igor Stein\\Desktop\\SystemWStorage\\SystemWStorage\\WStorage\\src\\main\\java\\imagem\\icon_pesquisar.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_estoque)
                        .addGap(17, 17, 17))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_pesquisar)
                        .addGap(48, 48, 48)
                        .addComponent(btn_equipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_home)
                        .addGap(18, 18, 18))
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl_estoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_pesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_equipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_equipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipamentosActionPerformed
        // TODO add your handling code here:
        tela_estoqueMqn.this.dispose();
        tela_estoqueEqp btn_equipamentos = new tela_estoqueEqp();
        btn_equipamentos.setVisible(true);
    }//GEN-LAST:event_btn_equipamentosActionPerformed

    private void lbl_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homeMouseClicked
        // TODO add your handling code here:
        tela_estoqueMqn.this.dispose();
        tela_menu jLabel1 = new tela_menu();
        jLabel1.setVisible(true);
    }//GEN-LAST:event_lbl_homeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.tb_maquina("SELECT m.id_maquina, m.nome,m.numero_serie,m.dimensoes, m.modelo, l.nome_local,m.status"
                + "      FROM maquinas m"
                + "      INNER JOIN localizacao l"
                + "      ON m.cod_localizacao = l.id_local"
                + "      ORDER BY id_maquina");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(tela_estoqueMqn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_estoqueMqn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_estoqueMqn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_estoqueMqn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_estoqueMqn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_equipamentos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_estoque;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_pesquisar;
    private javax.swing.JTable tb_estoqueMaquinas;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables
}
