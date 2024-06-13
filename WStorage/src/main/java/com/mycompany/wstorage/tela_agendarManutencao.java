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
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor Stein
 */
public class tela_agendarManutencao extends javax.swing.JFrame {

    //Estabelecendo conexão com o banco
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "247022";
    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet resultado = null;
    
    public tela_agendarManutencao() {
        initComponents();
    }
    
    private void calcularHoras() {
        try {
            // Ler e validar os horários
            LocalTime startTime = LocalTime.parse(txt_inicio.getText());
            LocalTime endTime = LocalTime.parse(txt_final.getText());

            // Validar se endTime é maior que startTime
            if (endTime.isBefore(startTime)) {
                throw new IllegalArgumentException("Horário final deve ser maior que o horário inicial.");
            }

            // Calcular a diferença de tempo
            Duration duration = Duration.between(startTime, endTime);

            // Extrair horas da diferença de tempo
            long hours = duration.toHours();
            long minutes = duration.toMinutes() % 60;

            // Exibir o resultado em horas no JLabel
            txt_tempoEstimado.setText(hours + " horas, " + minutes + " minutos ");

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de hora inválido.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void CamboBoxLocalizacao (String sql) {
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
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
            statement = conexao.prepareStatement(sql);
            statement.execute(); // criar o vetor
            resultado = statement.executeQuery(sql);
            cbx_tipoManutencao.removeAllItems();
            while(resultado.next()){               
                cbx_tipoManutencao.addItem(resultado.getInt("id_manutencao")+ " - " +resultado.getString("nome_manutencao"));
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

        jPanel1 = new javax.swing.JPanel();
        lbl_agendar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lbl_codigoProduto = new javax.swing.JLabel();
        txt_codigoProduto = new javax.swing.JTextField();
        lbl_dataAgendamento = new javax.swing.JLabel();
        ftxt_dataAgendamento = new javax.swing.JFormattedTextField();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_inicializacao = new javax.swing.JLabel();
        lbl_finalizacao = new javax.swing.JLabel();
        lbl_tempoEstimado = new javax.swing.JLabel();
        txt_tempoEstimado = new javax.swing.JTextField();
        lbl_tipoManutencao = new javax.swing.JLabel();
        cbx_tipoManutencao = new javax.swing.JComboBox<>();
        lbl_localizacao = new javax.swing.JLabel();
        cbx_localizacao = new javax.swing.JComboBox<>();
        lbl_descricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_descricao = new javax.swing.JTextArea();
        btn_salvar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        btn_pesquisar = new javax.swing.JButton();
        txt_inicio = new javax.swing.JFormattedTextField();
        txt_final = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_agendar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_agendar.setText("Agendamento de Manutenção");

        lbl_codigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_codigo.setText("Código Manutenção");

        txt_codigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_codigo.setEnabled(false);

        lbl_codigoProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_codigoProduto.setText("Código Produto");

        lbl_dataAgendamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_dataAgendamento.setText("Data do Agendamento");

        try {
            ftxt_dataAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxt_dataAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftxt_dataAgendamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nome.setText("Nome Produto");

        txt_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_nome.setEnabled(false);

        lbl_inicializacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_inicializacao.setText("Inicialização");

        lbl_finalizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_finalizacao.setText("Finalização");

        lbl_tempoEstimado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_tempoEstimado.setText("Tempo Estimado");

        txt_tempoEstimado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_tempoEstimado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tempoEstimado.setEnabled(false);

        lbl_tipoManutencao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_tipoManutencao.setText("Tipo de Manutenção");

        cbx_tipoManutencao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_tipoManutencao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        lbl_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_localizacao.setText("Localização");

        cbx_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_localizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        lbl_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_descricao.setText("Descrição Técnica da Manutenção");

        txta_descricao.setColumns(20);
        txta_descricao.setRows(5);
        jScrollPane1.setViewportView(txta_descricao);

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

        btn_pesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        try {
            txt_inicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_inicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_inicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        try {
            txt_final.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_final.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_final.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_agendar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descricao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_nome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lbl_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_codigo))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_codigoProduto)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txt_codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btn_pesquisar)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_tipoManutencao)
                                            .addComponent(cbx_tipoManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_localizacao)
                                            .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(ftxt_dataAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(lbl_inicializacao)
                                                            .addGap(185, 185, 185)))
                                                    .addGap(159, 159, 159))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_finalizacao)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(txt_final, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jButton1)))
                                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_tempoEstimado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(129, 129, 129))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(lbl_tempoEstimado))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(lbl_dataAgendamento)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(btn_salvar)
                .addGap(150, 150, 150)
                .addComponent(btn_voltar)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_agendar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_codigo)
                                    .addComponent(lbl_codigoProduto)
                                    .addComponent(lbl_dataAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_pesquisar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(ftxt_dataAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lbl_nome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_finalizacao))))
                    .addComponent(lbl_inicializacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_final, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipoManutencao)
                    .addComponent(lbl_localizacao)
                    .addComponent(lbl_tempoEstimado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_tipoManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tempoEstimado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(lbl_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        tela_agendarManutencao.this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        try {                                              
            String id = txt_codigoProduto.getText().trim();
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
                txt_nome.requestFocus();
                txt_nome.setText("");
            } else {
                try {
                    String nome = resultado.getString("nome");
                    txt_nome.setText(nome);
                } catch (SQLException ex) {
                    Logger.getLogger(tela_solicitacaoManutencao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) { 
                Logger.getLogger(tela_agendarManutencao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);

            // Verificar se a máquina já está em manutenção no mesmo dia
            String checkSql = "SELECT COUNT(*) FROM Solicitar_Manutencaoes WHERE cod_maquina = ? AND data_agendada = ? AND status = 'Agendado'";
            int idProduto = Integer.parseInt(txt_codigoProduto.getText());

            // Converter data para formato adequado para consulta SQL
            String dia = ftxt_dataAgendamento.getText().substring(0, 2);
            String mes = ftxt_dataAgendamento.getText().substring(3, 5);
            String ano = ftxt_dataAgendamento.getText().substring(6);
            String data = ano + "-" + mes + "-" + dia;

            statement = conexao.prepareStatement(checkSql);
            statement.setInt(1, idProduto);
            statement.setString(2, data);

            resultado = statement.executeQuery();
            resultado.next();
            int quantidadeMaquinasNoMesmoDia = resultado.getInt(1);
            resultado.close();
            statement.close();

            if (quantidadeMaquinasNoMesmoDia > 0) {
                JOptionPane.showMessageDialog(null, "Esta máquina já está em manutenção para esta data.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Verificar se já existem três máquinas agendadas para este dia
            String countSql = "SELECT COUNT(*) FROM Solicitar_Manutencaoes WHERE data_agendada = ? AND status = 'Agendado'";

            statement = conexao.prepareStatement(countSql);
            statement.setString(1, data);

            resultado = statement.executeQuery();
            resultado.next();
            int quantidadeTotalMaquinasNoDia = resultado.getInt(1);
            resultado.close();
            statement.close();

            if (quantidadeTotalMaquinasNoDia >= 3) {
                JOptionPane.showMessageDialog(null, "Limite de três máquinas agendadas para esta data já foi atingido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Se não houverem problemas, proceda com a inserção da manutenção
            String sql = "INSERT INTO Solicitar_Manutencaoes (cod_maquina, cod_localizacao, "
                    + "cod_tipo_manutencao, descricao, tempoEstimado, data_agendada, status, data_emissao) VALUES (?,?,?,?,?,?, 'Agendado', NOW())";

            // Restante do código para preparar e executar a inserção
            String comboBox = (String) cbx_localizacao.getSelectedItem();
            String[] partes = comboBox.split(" - ");
            String idLocal = partes[0].trim();
            int id_local = Integer.parseInt(idLocal);

            String comboBox2 = (String) cbx_tipoManutencao.getSelectedItem();
            String[] partes2 = comboBox2.split(" - ");
            String idManutencao = partes2[0].trim();
            int id_manutencao = Integer.parseInt(idManutencao);

            statement = conexao.prepareStatement(sql);
            statement.setInt(1, idProduto);
            statement.setInt(2, id_local);
            statement.setInt(3, id_manutencao);
            statement.setString(4, txta_descricao.getText());
            statement.setString(5, txt_tempoEstimado.getText());
            statement.setString(6, data);

            statement.execute();
            statement.close();

            JOptionPane.showMessageDialog(null, "Manutenção cadastrada com sucesso.", "Manutenção", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(tela_agendarManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        this.CamboBoxLocalizacao("SELECT * FROM localizacao ORDER BY id_local;");
        this.CamboBoxManutencao("SELECT * FROM manutencoes ORDER BY id_manutencao;");
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        calcularHoras();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tela_agendarManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_agendarManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_agendarManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_agendarManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_agendarManutencao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbx_localizacao;
    private javax.swing.JComboBox<String> cbx_tipoManutencao;
    private javax.swing.JFormattedTextField ftxt_dataAgendamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_agendar;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_codigoProduto;
    private javax.swing.JLabel lbl_dataAgendamento;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_finalizacao;
    private javax.swing.JLabel lbl_inicializacao;
    private javax.swing.JLabel lbl_localizacao;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_tempoEstimado;
    private javax.swing.JLabel lbl_tipoManutencao;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_codigoProduto;
    private javax.swing.JFormattedTextField txt_final;
    private javax.swing.JFormattedTextField txt_inicio;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_tempoEstimado;
    private javax.swing.JTextArea txta_descricao;
    // End of variables declaration//GEN-END:variables
}
