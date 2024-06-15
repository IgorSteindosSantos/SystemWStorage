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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronieli
 */
public class tela_cadastroEquipamentos extends javax.swing.JFrame {
    // Estabelecer conexão com o banco
    Connection conexao = null;
    ResultSet resultado = null;
    PreparedStatement statement = null;
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "247022";
    
    public tela_cadastroEquipamentos() {
        initComponents();
    }

    public void popularCamboBox (String sql) {
        // Classe criada para popular comboBox localização com dados do banco
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
            
            statement = conexao.prepareStatement(sql);
            statement.execute(); // criar o vetor
            resultado = statement.executeQuery(sql);
            cbx_localizacao.removeAllItems();
            while(resultado.next()){               
                cbx_localizacao.addItem(resultado.getInt("id_local")+ " - " +resultado.getString("nome_local"));
            }
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void id_equipamento () {
        //Classe criada para pupulando txt_codigo com id_local
        try {            
            int ultimoId = 0;
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = "SELECT MAX(id_equipamento)+1 as ultimoID FROM equipamentos;";
            statement = conexao.prepareStatement(sql);
            resultado = statement.executeQuery();
            if (resultado.next()) {
                try {
                    ultimoId = resultado.getInt("ultimoID");
                } catch (SQLException ex) {
                    Logger.getLogger(tela_localizacao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //converter para string
            this.txt_equipamento.setText(String.valueOf(ultimoId));
        } catch (SQLException ex) {
        Logger.getLogger(tela_localizacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void limparCampos() {
        // Classe criada pata limpar campos
        txt_nome.setText("");
        txta_descricao.setText("");
        txt_qtdMinima.setText("");
        txt_qtdSeguranca.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_cadastroEquipamento = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_tituloCadastro = new javax.swing.JLabel();
        txt_equipamento = new javax.swing.JTextField();
        lbl_equipamento = new javax.swing.JLabel();
        txt_data = new javax.swing.JTextField();
        lbl_data = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        chb_ativo = new javax.swing.JCheckBox();
        lbl_localizacao = new javax.swing.JLabel();
        txt_qtdMinima = new javax.swing.JTextField();
        lbl_qtdMinima = new javax.swing.JLabel();
        lbl_qtdSeguranca = new javax.swing.JLabel();
        lbl_descricao = new javax.swing.JLabel();
        lbl_imagem = new javax.swing.JLabel();
        btn_salvarImagem = new javax.swing.JButton();
        btn_excluirImagem = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_descricao = new javax.swing.JTextArea();
        lbl_foto = new javax.swing.JLabel();
        txt_qtdSeguranca = new javax.swing.JTextField();
        cbx_localizacao = new javax.swing.JComboBox<>();
        txt_imagem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WStorage");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_cadastroEquipamento.setBackground(new java.awt.Color(255, 255, 255));
        pn_cadastroEquipamento.setPreferredSize(new java.awt.Dimension(1070, 800));

        lbl_tituloCadastro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_tituloCadastro.setText("Cadastro de Equipamentos");

        txt_equipamento.setEnabled(false);
        txt_equipamento.setPreferredSize(new java.awt.Dimension(64, 20));

        lbl_equipamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_equipamento.setText("Código Equipamento");

        txt_data.setEnabled(false);
        txt_data.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_dataAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbl_data.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_data.setText("Data de Entrada");

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nome.setText("Nome");

        chb_ativo.setText("Ativo");

        lbl_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_localizacao.setText("Localização");

        lbl_qtdMinima.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_qtdMinima.setText("Qtd.Miníma");

        lbl_qtdSeguranca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_qtdSeguranca.setText("Qtd.Segurança");

        lbl_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_descricao.setText("Descrição");

        lbl_imagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_imagem.setText("Imagem do Equipamento");

        btn_salvarImagem.setText("Salvar");
        btn_salvarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarImagemActionPerformed(evt);
            }
        });

        btn_excluirImagem.setText("Excluir");

        btn_salvar.setBackground(new java.awt.Color(32, 107, 165));
        btn_salvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_voltar.setBackground(new java.awt.Color(32, 107, 165));
        btn_voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        txta_descricao.setColumns(20);
        txta_descricao.setRows(5);
        jScrollPane2.setViewportView(txta_descricao);

        lbl_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_localizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        txt_imagem.setEnabled(false);

        javax.swing.GroupLayout pn_cadastroEquipamentoLayout = new javax.swing.GroupLayout(pn_cadastroEquipamento);
        pn_cadastroEquipamento.setLayout(pn_cadastroEquipamentoLayout);
        pn_cadastroEquipamentoLayout.setHorizontalGroup(
            pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                        .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                                .addComponent(lbl_tituloCadastro)
                                .addGap(319, 319, 319)
                                .addComponent(txt_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_cadastroEquipamentoLayout.createSequentialGroup()
                        .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_imagem)
                                .addGap(64, 64, 64))
                            .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                                        .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_localizacao)
                                            .addComponent(lbl_nome)
                                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                                                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_qtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_descricao))
                                                .addGap(39, 39, 39)
                                                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_qtdSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_qtdSeguranca))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                                        .addComponent(lbl_qtdMinima)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                                        .addComponent(btn_salvarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(127, 127, 127)
                                        .addComponent(btn_excluirImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(168, 168, 168))
                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                        .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_equipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_equipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_data)
                            .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(chb_ativo)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(btn_salvar)
                .addGap(210, 210, 210)
                .addComponent(btn_voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                    .addGap(515, 515, 515)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(515, Short.MAX_VALUE)))
        );
        pn_cadastroEquipamentoLayout.setVerticalGroup(
            pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbl_tituloCadastro))
                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txt_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_equipamento)
                    .addComponent(lbl_data)
                    .addComponent(lbl_imagem))
                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbl_nome))
                            .addComponent(chb_ativo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_localizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_qtdSeguranca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_qtdMinima, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salvarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluirImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_qtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_qtdSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(pn_cadastroEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_cadastroEquipamentoLayout.createSequentialGroup()
                    .addGap(322, 322, 322)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(322, 322, 322)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_cadastroEquipamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_cadastroEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        tela_cadastroEquipamentos.this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Populando combobox em ordem pelo id_local
        this.popularCamboBox("SELECT * FROM localizacao ORDER BY id_local");
        id_equipamento();//Atualizar o id_maquina
        txt_imagem.setVisible(false);
        jFileChooser1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        try {            
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = ("INSERT INTO equipamentos (nome,cod_localizacao,qtd_min,qtd_seg,data_emissao,status,descricao,imagem) VALUES (?,?,?,?,?,?,?,?)");
            int qtd_min = Integer.parseInt(txt_qtdMinima.getText());
            int qtd_seg = Integer.parseInt(txt_qtdSeguranca.getText());
            //passando combobox para o banco
            String comboBox = (String) cbx_localizacao.getSelectedItem();
            String [] partes = comboBox.split(" - ");
            String id = partes[0].trim();
            int id_local = Integer.parseInt(id);
            //convertendo data para o banco
            String dia = txt_data.getText().substring(0, 2);
            String mes = txt_data.getText().substring(3, 5);
            String ano = txt_data.getText().substring(6);
            String data = ano+"-"+mes+"-"+dia;
            //colocando status na maquina com o checkbox
            String checkbox = "";
            if(chb_ativo.isSelected()) {
                checkbox+="Ativo";
            } else {
                checkbox+="Desativado";
            }
            statement = conexao.prepareStatement(sql);
            statement.setString(1, txt_nome.getText());
            statement.setInt(2, id_local);
            statement.setInt(3, qtd_min);
            statement.setInt(4, qtd_seg);
            statement.setString(5, data);
            statement.setString(6, checkbox);
            statement.setString(7, txta_descricao.getText());
            statement.setString(8, txt_imagem.getText());
            statement.execute();
            statement.close();
            limparCampos();
            id_equipamento();//Atualizar o id_maquina
            JOptionPane.showInternalMessageDialog(null,"Equipamento cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroEquipamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void txt_dataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_dataAncestorAdded
        // Colocando a data do sistema no txt_data
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        txt_data.setText(data);
    }//GEN-LAST:event_txt_dataAncestorAdded

    private void btn_salvarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarImagemActionPerformed
        // Salvar imagem no txt_imagem para depois enviar pro banco 
        jFileChooser1.setVisible(true);
        int result = this.jFileChooser1.showOpenDialog(this.jFileChooser1);
        if(result == JFileChooser.APPROVE_OPTION){
            String filePath = this.jFileChooser1.getSelectedFile().getAbsolutePath();
            ImageIcon icon = new ImageIcon(filePath);
            this.lbl_foto.setIcon(icon);
            this.txt_imagem.setText(filePath);
        }
    }//GEN-LAST:event_btn_salvarImagemActionPerformed

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
            java.util.logging.Logger.getLogger(tela_cadastroEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastroEquipamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_excluirImagem;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_salvarImagem;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbx_localizacao;
    private javax.swing.JCheckBox chb_ativo;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_data;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_equipamento;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JLabel lbl_localizacao;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_qtdMinima;
    private javax.swing.JLabel lbl_qtdSeguranca;
    private javax.swing.JLabel lbl_tituloCadastro;
    private javax.swing.JPanel pn_cadastroEquipamento;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_equipamento;
    private javax.swing.JTextField txt_imagem;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_qtdMinima;
    private javax.swing.JTextField txt_qtdSeguranca;
    private javax.swing.JTextArea txta_descricao;
    // End of variables declaration//GEN-END:variables
}
