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
 * @author isantos
 */
public class tela_servico extends javax.swing.JFrame {
    // Estabelecer conexão com o banco
    ResultSet resultado = null;
    Connection conexao = null;
    PreparedStatement statement = null;
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "";
    
    public tela_servico() {
        initComponents();
    }
    
    public void  tb_manutencoes (String sql){
        // Classe para popular tabela com as informações do namco
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);            
            statement = (PreparedStatement)conexao.prepareStatement(sql);
            statement.execute(); // criar o vetor
            resultado = statement.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) tb_servicos.getModel();
            model.setNumRows(0);

                while (resultado.next()){
                    model.addRow(new Object[] {
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("id_servico"),
                    resultado.getString("nome_servico"),
                    });
                }
                statement.close();
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(tela_localizacao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void limparCampos() {
        // Classe para limpar os campos
        txt_nome.setText("");
        txt_codigo.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pl_servicos = new javax.swing.JPanel();
        lbl_servico = new javax.swing.JLabel();
        s_servicos = new javax.swing.JSeparator();
        txt_pesquisar = new javax.swing.JTextField();
        s_servicos2 = new javax.swing.JSeparator();
        lbl_home = new javax.swing.JLabel();
        sp_tbServicos = new javax.swing.JScrollPane();
        tb_servicos = new javax.swing.JTable();
        pl_cadastros = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        btn_cadastra = new javax.swing.JButton();
        btn_deletar = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        lbl_pesquisar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WStorage");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pl_servicos.setBackground(new java.awt.Color(255, 255, 255));

        lbl_servico.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_servico.setText("Serviços");

        txt_pesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbl_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Igor Stein\\Desktop\\SystemWStorage\\SystemWStorage\\WStorage\\src\\main\\java\\imagem\\icon_home.png")); // NOI18N
        lbl_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homeMouseClicked(evt);
            }
        });

        tb_servicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ));
        tb_servicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_servicosMouseClicked(evt);
            }
        });
        sp_tbServicos.setViewportView(tb_servicos);

        pl_cadastros.setBackground(new java.awt.Color(255, 255, 255));
        pl_cadastros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pl_cadastros.setPreferredSize(new java.awt.Dimension(426, 293));

        lbl_codigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_codigo.setText("Código");

        txt_codigo.setEnabled(false);

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nome.setText("Nome");

        txt_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btn_cadastra.setBackground(new java.awt.Color(32, 107, 165));
        btn_cadastra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cadastra.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastra.setText("Cadastra");
        btn_cadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastraActionPerformed(evt);
            }
        });

        btn_deletar.setBackground(new java.awt.Color(32, 107, 165));
        btn_deletar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_deletar.setForeground(new java.awt.Color(255, 255, 255));
        btn_deletar.setText("Deletar");
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        btn_atualizar.setBackground(new java.awt.Color(32, 107, 165));
        btn_atualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_atualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pl_cadastrosLayout = new javax.swing.GroupLayout(pl_cadastros);
        pl_cadastros.setLayout(pl_cadastrosLayout);
        pl_cadastrosLayout.setHorizontalGroup(
            pl_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_cadastrosLayout.createSequentialGroup()
                .addGroup(pl_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pl_cadastrosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(pl_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nome)
                            .addComponent(lbl_codigo)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pl_cadastrosLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btn_cadastra)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_atualizar)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pl_cadastrosLayout.setVerticalGroup(
            pl_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_cadastrosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl_codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lbl_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pl_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        lbl_pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Igor Stein\\Desktop\\SystemWStorage\\SystemWStorage\\WStorage\\src\\main\\java\\imagem\\icon_pesquisar.png")); // NOI18N

        javax.swing.GroupLayout pl_servicosLayout = new javax.swing.GroupLayout(pl_servicos);
        pl_servicos.setLayout(pl_servicosLayout);
        pl_servicosLayout.setHorizontalGroup(
            pl_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_servicosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pl_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_servico)
                    .addGroup(pl_servicosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(sp_tbServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(pl_cadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pl_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(s_servicos, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(s_servicos2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pl_servicosLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbl_pesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 816, Short.MAX_VALUE)
                            .addComponent(lbl_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pl_servicosLayout.setVerticalGroup(
            pl_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_servicosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_servico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s_servicos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pl_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pl_servicosLayout.createSequentialGroup()
                        .addGroup(pl_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(pl_servicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pl_servicosLayout.createSequentialGroup()
                                .addComponent(s_servicos2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_tbServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pl_servicosLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(pl_cadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbl_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl_servicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl_servicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homeMouseClicked
        tela_servico.this.dispose();
    }//GEN-LAST:event_lbl_homeMouseClicked

    private void btn_cadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastraActionPerformed
        try {
            // Inserir dados no banco
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = "INSERT INTO servicos (nome_servico) VALUES (?)";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, txt_nome.getText());
            statement.execute();
            statement.close();
            limparCampos();//Limpar os TXT ao clicar no BTN
            this.tb_manutencoes("SELECT * FROM servicos");
        } catch (SQLException ex) {
            Logger.getLogger(tela_servico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_cadastraActionPerformed

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
        try {
            // Deletar dados do banco
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = "DELETE FROM servicos WHERE id_servico = ?";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, txt_codigo.getText());
            statement.execute();
            statement.close();
            limparCampos();//Limpar os TXT ao clicar no BTN
            this.tb_manutencoes("SELECT * FROM servicos");
        } catch (SQLException ex) {
            Logger.getLogger(tela_servico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deletarActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        try {
            // Atualizar dados do banco
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = "UPDATE servicos SET nome_servico = ? WHERE id_servico = ?";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, txt_nome.getText());
            statement.setString(2, txt_codigo.getText());
            statement.execute();
            statement.close();
            limparCampos();//Limpar os TXT ao clicar no BTN
            this.tb_manutencoes("SELECT * FROM servicos");
        } catch (SQLException ex) {
            Logger.getLogger(tela_servico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void tb_servicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_servicosMouseClicked
        // Popular tabela conforme os txt
        int linha = tb_servicos.getSelectedRow();
        txt_codigo.setText(tb_servicos.getValueAt(linha, 0).toString());
        txt_nome.setText(tb_servicos.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_tb_servicosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.tb_manutencoes("SELECT * FROM servicos");
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
            java.util.logging.Logger.getLogger(tela_servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_servico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_cadastra;
    private javax.swing.JButton btn_deletar;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_pesquisar;
    private javax.swing.JLabel lbl_servico;
    private javax.swing.JPanel pl_cadastros;
    private javax.swing.JPanel pl_servicos;
    private javax.swing.JSeparator s_servicos;
    private javax.swing.JSeparator s_servicos2;
    private javax.swing.JScrollPane sp_tbServicos;
    private javax.swing.JTable tb_servicos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables
}
