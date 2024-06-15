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
public class tela_lista_manutencoes extends javax.swing.JFrame {
    
    // Variavel publica para passar ID mantenção para tela editar manutencao
    public static String idM;
    // Estabelecendo conexão com o banco
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "";
    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet resultado = null;
    
    
    public tela_lista_manutencoes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_listaManutencoes = new javax.swing.JPanel();
        lbl_manutencoes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_pesquisar = new javax.swing.JTextField();
        lbl_pesquisar = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_agendar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_home = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_manutencaoAgendada = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WStorage");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        pn_listaManutencoes.setBackground(new java.awt.Color(255, 255, 255));
        pn_listaManutencoes.setPreferredSize(new java.awt.Dimension(1200, 825));

        lbl_manutencoes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_manutencoes.setText("Histórico de Manutenções");

        txt_pesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_pesquisar.setText("Pesquisar por...");

        lbl_pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Igor Stein\\Desktop\\SystemWStorage\\SystemWStorage\\WStorage\\src\\main\\java\\imagem\\icon_pesquisar.png")); // NOI18N

        btn_novo.setBackground(new java.awt.Color(32, 107, 165));
        btn_novo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(255, 255, 255));
        btn_novo.setText("Nova");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_agendar.setBackground(new java.awt.Color(32, 107, 165));
        btn_agendar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_agendar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agendar.setText("Agendar");
        btn_agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agendarActionPerformed(evt);
            }
        });

        lbl_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Igor Stein\\Desktop\\SystemWStorage\\SystemWStorage\\WStorage\\src\\main\\java\\imagem\\icon_home.png")); // NOI18N
        lbl_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homeMouseClicked(evt);
            }
        });

        tb_manutencaoAgendada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tb_manutencaoAgendada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo de Manutenção", "Data de Emissão", "Data de Previsão", "Status"
            }
        ));
        tb_manutencaoAgendada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_manutencaoAgendadaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_manutencaoAgendada);

        javax.swing.GroupLayout pn_listaManutencoesLayout = new javax.swing.GroupLayout(pn_listaManutencoes);
        pn_listaManutencoes.setLayout(pn_listaManutencoesLayout);
        pn_listaManutencoesLayout.setHorizontalGroup(
            pn_listaManutencoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_listaManutencoesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pn_listaManutencoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_listaManutencoesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_listaManutencoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(lbl_manutencoes)
                        .addGroup(pn_listaManutencoesLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_pesquisar)
                            .addGap(39, 39, 39)
                            .addComponent(btn_novo)
                            .addGap(43, 43, 43)
                            .addComponent(btn_agendar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE)
                            .addComponent(lbl_home)
                            .addGap(10, 10, 10))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pn_listaManutencoesLayout.setVerticalGroup(
            pn_listaManutencoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_listaManutencoesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl_manutencoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_listaManutencoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_listaManutencoesLayout.createSequentialGroup()
                        .addGroup(pn_listaManutencoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_novo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_listaManutencoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_listaManutencoes, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    public void  tb_manutencoes (String sql){
        // Classe criada para popular tabela de manutenções
        try {
        conexao = DriverManager.getConnection(url, usuario, senha);
        statement = conexao.prepareStatement(sql);
        resultado = statement.executeQuery();
        DefaultTableModel model = (DefaultTableModel) tb_manutencaoAgendada.getModel();
        model.setNumRows(0);
                while (resultado.next()){
                    model.addRow(new Object[] {
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("id_SM"),
                    resultado.getString("nome"),
                    resultado.getString("nome_manutencao"),
                    resultado.getString("data_formatada"),
                    resultado.getString("data_formatadaA"),
                    resultado.getString("status")
                    });
                }
                resultado.close();
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(tela_localizacao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void lbl_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homeMouseClicked
        tela_lista_manutencoes.this.dispose();
        tela_menu lbl_home = new tela_menu();
        lbl_home.setVisible(true);
    }//GEN-LAST:event_lbl_homeMouseClicked

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        tela_solicitacaoManutencao btn_novo = new tela_solicitacaoManutencao();
        btn_novo.setVisible(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_agendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendarActionPerformed
        tela_agendarManutencao btn_agendar = new tela_agendarManutencao();
        btn_agendar.setVisible(true);
    }//GEN-LAST:event_btn_agendarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.tb_manutencoes("SELECT id_SM, nome, nome_manutencao, data_formatada, data_formatadaA, status FROM vw_Manutencoes");
    }//GEN-LAST:event_formWindowGainedFocus

    private void tb_manutencaoAgendadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_manutencaoAgendadaMouseClicked
        // Pegando id da linha selecionada e colocando para variavel publica
        int linha = tb_manutencaoAgendada.getSelectedRow();
        idM = tb_manutencaoAgendada.getValueAt(linha, 0).toString();
     
        tela_manutencaoEditar objeto2 = new tela_manutencaoEditar();
        objeto2.setVisible(true);
    }//GEN-LAST:event_tb_manutencaoAgendadaMouseClicked

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
            java.util.logging.Logger.getLogger(tela_lista_manutencoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_lista_manutencoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_lista_manutencoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_lista_manutencoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_lista_manutencoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agendar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_manutencoes;
    private javax.swing.JLabel lbl_pesquisar;
    private javax.swing.JPanel pn_listaManutencoes;
    private javax.swing.JTable tb_manutencaoAgendada;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables
}
