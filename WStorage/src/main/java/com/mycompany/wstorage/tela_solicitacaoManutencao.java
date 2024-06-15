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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronieli
 */
public class tela_solicitacaoManutencao extends javax.swing.JFrame {
    // Estabelecer conexão com o banco
    Connection conexao = null;
    ResultSet resultado = null;
    PreparedStatement statement = null;
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "247022";
    
    public tela_solicitacaoManutencao() {
        initComponents();
    }
    
    public void LimparCampos() {
        // Classe que limpa todos componetes do frame
        txt_codigoManutencao.setText("");
        rb_equipamento.setSelected(false);
        rb_maquina.setSelected(false);
        txt_codigoProduto.setText("");
        txt_nomeProduto.setText("");
        txt_descricao.setText("");
        lbl_foto.setIcon(null);
        txt_imagem.setText("");
    }
    
    public void CamboBoxLocalizacao (String sql) {
        // Classe que popular o cbx_localizao com as localizações salvas no bd
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
    
    public void CamboBoxManutencao (String sql) {
        // Classe que popular o cbx_manutencao com as manutenções salvas no bd
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
            statement = conexao.prepareStatement(sql);
            statement.execute(); // criar o vetor
            resultado = statement.executeQuery(sql);
            cbx_manutencao.removeAllItems();
            while(resultado.next()){               
                cbx_manutencao.addItem(resultado.getInt("id_manutencao")+ " - " +resultado.getString("nome_manutencao"));
            }
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        pl_solicitarManutencao = new javax.swing.JPanel();
        separator_manutencao = new javax.swing.JSeparator();
        lbl_manutencao = new javax.swing.JLabel();
        txt_codigoManutencao = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        txt_codigoProduto = new javax.swing.JTextField();
        lbl_codigoEqp = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txt_nomeProduto = new javax.swing.JTextField();
        cbx_manutencao = new javax.swing.JComboBox<>();
        lbl_tipoManutencao = new javax.swing.JLabel();
        cbx_localizacao = new javax.swing.JComboBox<>();
        lbl_localizacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descricao = new javax.swing.JTextPane();
        lbl_descricao = new javax.swing.JLabel();
        lbl_imagem = new javax.swing.JLabel();
        btn_exluirImagem = new javax.swing.JButton();
        btn_salvarImagem = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_foto = new javax.swing.JLabel();
        btn_pesquisar = new javax.swing.JButton();
        rb_equipamento = new javax.swing.JRadioButton();
        rb_maquina = new javax.swing.JRadioButton();
        txt_imagem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WStorage");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pl_solicitarManutencao.setBackground(new java.awt.Color(255, 255, 255));

        lbl_manutencao.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_manutencao.setText("Solicitação de Manutenção");

        txt_codigoManutencao.setEnabled(false);

        lbl_codigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_codigo.setText("Código Manutenção");

        lbl_codigoEqp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_codigoEqp.setText("Código Produto");

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nome.setText("Nome Produto");

        cbx_manutencao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_manutencao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        lbl_tipoManutencao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_tipoManutencao.setText("Tipo de Manutenção");

        cbx_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_localizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        lbl_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_localizacao.setText("Localização");

        jScrollPane1.setViewportView(txt_descricao);

        lbl_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_descricao.setText("Descrição Técnica do Ocorrido");

        lbl_imagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_imagem.setText("Imagem do Produto");

        btn_exluirImagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_exluirImagem.setText("Excluir");
        btn_exluirImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exluirImagemActionPerformed(evt);
            }
        });

        btn_salvarImagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_salvarImagem.setText("Salvar");
        btn_salvarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarImagemActionPerformed(evt);
            }
        });

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

        lbl_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_foto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Igor Stein\\Desktop\\SystemWStorage\\SystemWStorage\\WStorage\\src\\main\\java\\imagem\\icon_camera.png")); // NOI18N
        lbl_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_pesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        rb_equipamento.setText("Equipamento");
        rb_equipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_equipamentoActionPerformed(evt);
            }
        });

        rb_maquina.setText("Máquina");
        rb_maquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_maquinaActionPerformed(evt);
            }
        });

        txt_imagem.setEditable(false);
        txt_imagem.setText("imagem");
        txt_imagem.setEnabled(false);

        javax.swing.GroupLayout pl_solicitarManutencaoLayout = new javax.swing.GroupLayout(pl_solicitarManutencao);
        pl_solicitarManutencao.setLayout(pl_solicitarManutencaoLayout);
        pl_solicitarManutencaoLayout.setHorizontalGroup(
            pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separator_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                                .addComponent(lbl_manutencao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btn_salvar)
                        .addGap(145, 145, 145)
                        .addComponent(btn_voltar))
                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_codigoManutencao))
                                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(rb_maquina)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_equipamento)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_imagem)
                                        .addGap(70, 70, 70))))
                            .addComponent(lbl_descricao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_nome)
                                    .addComponent(lbl_codigoEqp)
                                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                                        .addComponent(txt_codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_pesquisar))
                                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                                        .addComponent(lbl_tipoManutencao)
                                        .addGap(53, 53, 53)
                                        .addComponent(lbl_localizacao))
                                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                                        .addComponent(cbx_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pl_solicitarManutencaoLayout.createSequentialGroup()
                                        .addComponent(btn_salvarImagem)
                                        .addGap(86, 86, 86)
                                        .addComponent(btn_exluirImagem)
                                        .addGap(16, 16, 16))
                                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pl_solicitarManutencaoLayout.setVerticalGroup(
            pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_manutencao)
                    .addComponent(txt_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(lbl_imagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                        .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codigoManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_equipamento)
                            .addComponent(rb_maquina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_codigoEqp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pesquisar))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pl_solicitarManutencaoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salvarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exluirImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_tipoManutencao)
                        .addComponent(lbl_localizacao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(lbl_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pl_solicitarManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl_solicitarManutencao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl_solicitarManutencao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        tela_solicitacaoManutencao.this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            if(rb_maquina.isSelected()){
                try {
                    // Verifica se a máquina já está em manutenção
                    String checkSql = "SELECT COUNT(*) FROM Solicitar_Manutencaoes WHERE cod_maquina = ? AND status = 'Sem Agendamento'";
                    int idProduto = Integer.parseInt(txt_codigoProduto.getText());

                    statement = conexao.prepareStatement(checkSql);
                    statement.setInt(1, idProduto);
                    resultado = statement.executeQuery();
                    resultado.next();
                    int count = resultado.getInt(1);
                    resultado.close();
                    statement.close();

                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "A máquina já está em manutenção.", "Erro", JOptionPane.ERROR_MESSAGE);
                        LimparCampos();
                        return;
                    }
                    
                    String sql = "INSERT INTO Solicitar_Manutencaoes (cod_maquina, cod_localizacao, "
                            + "cod_tipo_manutencao, descricao,status,data_emissao) VALUES (?,?,?,?,'Sem Agendamento',NOW());";
                    
                    // Passando combobox para o banco
                    String comboBox = (String) cbx_localizacao.getSelectedItem();
                    String [] partes = comboBox.split(" - ");
                    String id = partes[0].trim();
                    int id_local = Integer.parseInt(id);
                    
                    // Passando combobox para o banco
                    String comboBox2 = (String) cbx_manutencao.getSelectedItem();
                    String [] partes2 = comboBox2.split(" - ");
                    String id2 = partes2[0].trim();
                    int id_manutencao = Integer.parseInt(id2);
                                        
                    statement = conexao.prepareStatement(sql);
                    statement.setInt(1, idProduto);
                    statement.setInt(2, id_local);
                    statement.setInt(3, id_manutencao);
                    statement.setString(4, txt_descricao.getText());
                    // statement.setString(5, ); criar o imagem
                    statement.execute();
                    statement.close();
                    LimparCampos();
                    JOptionPane.showMessageDialog(null, "Manutenção cadastrada com sucesso.", "Manutenção", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (rb_equipamento.isSelected()){
                try {
                    
                    // Verifica se o equipamento já está em manutenção
                    String checkSql = "SELECT COUNT(*) FROM Solicitar_Manutencaoes WHERE cod_equipamentos = ? AND status = 'Sem Agendamento'";
                    int idProduto = Integer.parseInt(txt_codigoProduto.getText());

                    statement = conexao.prepareStatement(checkSql);
                    statement.setInt(1, idProduto);
                    resultado = statement.executeQuery();
                    resultado.next();
                    int count = resultado.getInt(1);
                    resultado.close();
                    statement.close();

                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "O equipamento já está em manutenção.", "Erro", JOptionPane.ERROR_MESSAGE);
                        LimparCampos();
                        return;
                    }
                    
                    String sql = "INSERT INTO Solicitar_Manutencaoes (cod_equipamentos, cod_localizacao, "
                            + "cod_tipo_manutencao, descricao,status,data_emissao) VALUES (?,?,?,?,'Sem Agendamento',NOW());";
                    
                    // Passando combobox para o banco
                    String comboBox = (String) cbx_localizacao.getSelectedItem();
                    String [] partes = comboBox.split(" - ");
                    String id = partes[0].trim();
                    int id_local = Integer.parseInt(id);
                    
                    // Passando combobox para o banco
                    String comboBox2 = (String) cbx_manutencao.getSelectedItem();
                    String [] partes2 = comboBox2.split(" - ");
                    String id2 = partes2[0].trim();
                    int id_manutencao = Integer.parseInt(id2);
                    
                    statement = conexao.prepareStatement(sql);
                    statement.setInt(1, idProduto);
                    statement.setInt(2, id_local);
                    statement.setInt(3, id_manutencao);
                    statement.setString(4, txt_descricao.getText());
                    // statement.setString(5, ); criar o imagem
                    statement.execute();
                    statement.close();
                    LimparCampos();
                    JOptionPane.showMessageDialog(null, "Manutenção cadastrada com sucesso.", "Manutenção", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione Máquina ou Equipamento.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void rb_maquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_maquinaActionPerformed
        rb_equipamento.setSelected(false);     
    }//GEN-LAST:event_rb_maquinaActionPerformed

    private void rb_equipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_equipamentoActionPerformed
        rb_maquina.setSelected(false);        
    }//GEN-LAST:event_rb_equipamentoActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        String id = txt_codigoProduto.getText().trim();
        if(rb_maquina.isSelected()){
            try {
               
                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um ID de Máquina.", "Erro", JOptionPane.ERROR_MESSAGE);
                    txt_codigoProduto.requestFocus();
                    return;
                }

            try {
                // Verifica se o ID contém apenas dígitos
                Integer.parseInt(id);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID da máquina inválido! Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
                txt_codigoProduto.requestFocus();
                txt_codigoProduto.setText("");
                return;
            }    
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "SELECT nome FROM maquinas WHERE id_maquina = ?;";
                statement = conexao.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(id));
                resultado = statement.executeQuery();
                if (!resultado.next()) {
                    JOptionPane.showMessageDialog(null, "Máquina não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                    txt_nomeProduto.requestFocus();
                    txt_nomeProduto.setText("");
                } else {
                    try {
                        String nome = resultado.getString("nome");
                        txt_nomeProduto.setText(nome);
                    } catch (SQLException ex) {
                        Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }   
            } catch (SQLException ex) {
                Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (rb_equipamento.isSelected()){
            
             try {
               
                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um ID de Equipamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                    txt_codigoProduto.requestFocus();
                    return;
                }

            try {
                // Verifica se o ID contém apenas dígitos
                Integer.parseInt(id);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID do Equipamentos inválido! Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
                txt_codigoProduto.requestFocus();
                txt_codigoProduto.setText("");
                return;
            }
                
                conexao = DriverManager.getConnection(url, usuario, senha);
                String sql = "SELECT nome FROM equipamentos WHERE id_equipamento = ?;";
                statement = conexao.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(id));
                resultado = statement.executeQuery();
                if (!resultado.next()) {
                    JOptionPane.showMessageDialog(null, "Equipamentos não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                    txt_nomeProduto.requestFocus();
                    txt_nomeProduto.setText("");
                } else {
                    try {
                        String nome = resultado.getString("nome");
                        txt_nomeProduto.setText(nome);
                    } catch (SQLException ex) {
                        Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }   
            } catch (SQLException ex) {
                Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione Máquina ou Equipamento.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Popular o combBox localizacao
        this.CamboBoxLocalizacao("SELECT * FROM localizacao ORDER BY id_local;");
        
        // Popular o comboBox manutencao
        this.CamboBoxManutencao("SELECT * FROM manutencoes ORDER BY id_manutencao;");
        txt_nomeProduto.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

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

    private void btn_exluirImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exluirImagemActionPerformed
        // Excluindo foto 
          txt_imagem.setText("");
          lbl_foto.setIcon(null);
    }//GEN-LAST:event_btn_exluirImagemActionPerformed

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
            java.util.logging.Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_solicitacaoManutencao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exluirImagem;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_salvarImagem;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbx_localizacao;
    private javax.swing.JComboBox<String> cbx_manutencao;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_codigoEqp;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JLabel lbl_localizacao;
    private javax.swing.JLabel lbl_manutencao;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_tipoManutencao;
    private javax.swing.JPanel pl_solicitarManutencao;
    private javax.swing.JRadioButton rb_equipamento;
    private javax.swing.JRadioButton rb_maquina;
    private javax.swing.JSeparator separator_manutencao;
    private javax.swing.JTextField txt_codigoManutencao;
    private javax.swing.JTextField txt_codigoProduto;
    private javax.swing.JTextPane txt_descricao;
    private javax.swing.JTextField txt_imagem;
    private javax.swing.JTextField txt_nomeProduto;
    // End of variables declaration//GEN-END:variables
}
