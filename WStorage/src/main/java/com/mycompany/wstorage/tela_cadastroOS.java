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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Podol
 */
public class tela_cadastroOS extends javax.swing.JFrame {

    //Estabelecendo conexão com o banco
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "247022";
    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet resultado = null;
    
    public tela_cadastroOS() {
        initComponents();
    }

    public void  tb_equipamentos (){
        try {
        conexao = DriverManager.getConnection(url, usuario, senha);
        String sql = "SELECT * FROM OSequipamentos WHERE ordem_servico_id = ?;";
        
        statement = conexao.prepareStatement(sql);
        int idos = Integer.parseInt(txt_id.getText()); 
        statement.setInt(1, idos);
        resultado = statement.executeQuery();
        
        // Limpar tabela
        DefaultTableModel model = (DefaultTableModel) tb_equipamentos.getModel();
        model.setRowCount(0);
        
        // Adicionar resultados na tabela
        while (resultado.next()) {
            int codEquipamento = resultado.getInt("id_equipamento");
            String nome = resultado.getString("nome");
            String local = resultado.getString("nome_local");
            int quantidade = resultado.getInt("quantidade");
            model.addRow(new Object[]{codEquipamento, nome, local, quantidade});
        }
        
        resultado.close();
        statement.close();
    } catch (SQLException ex) {
        Logger.getLogger(tela_cadastroOS.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_dados = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_servico = new javax.swing.JLabel();
        cbx_servico = new javax.swing.JComboBox<>();
        lbl_localizacao = new javax.swing.JLabel();
        cbx_localizacao = new javax.swing.JComboBox<>();
        lbl_descricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_descricao = new javax.swing.JTextArea();
        lbl_identificador = new javax.swing.JLabel();
        txt_identificador = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        pn_equipamento = new javax.swing.JPanel();
        lbl_codEquipamento = new javax.swing.JLabel();
        txt_codEquipamento = new javax.swing.JTextField();
        lbl_nomeEquipamento = new javax.swing.JLabel();
        txt_nomeEquipamento = new javax.swing.JTextField();
        lbl_nomeEquipamento1 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();
        btn_adiconar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_psgEquipamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_avancar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_equipamentos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1314, 800));

        pn_dados.setBackground(new java.awt.Color(255, 255, 255));
        pn_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Da Ordem de Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        lbl_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_id.setText("Código O.S");

        txt_id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_id.setEnabled(false);
        txt_id.setMinimumSize(new java.awt.Dimension(64, 30));
        txt_id.setPreferredSize(new java.awt.Dimension(64, 30));

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nome.setText("Nome do Funcionário");

        txt_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_nome.setEnabled(false);
        txt_nome.setMinimumSize(new java.awt.Dimension(64, 25));
        txt_nome.setPreferredSize(new java.awt.Dimension(73, 30));

        lbl_servico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_servico.setText("Tipo de Serviço");

        cbx_servico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_servico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_servico.setPreferredSize(new java.awt.Dimension(72, 30));

        lbl_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_localizacao.setText("Localização");

        cbx_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_localizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_localizacao.setToolTipText("");
        cbx_localizacao.setMinimumSize(new java.awt.Dimension(72, 30));
        cbx_localizacao.setPreferredSize(new java.awt.Dimension(72, 25));

        lbl_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_descricao.setText("Descrição da Ordem de Serviço");

        txta_descricao.setColumns(20);
        txta_descricao.setRows(5);
        jScrollPane2.setViewportView(txta_descricao);

        lbl_identificador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_identificador.setText("Identificador Funcionário");

        txt_identificador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_identificador.setMinimumSize(new java.awt.Dimension(64, 25));
        txt_identificador.setPreferredSize(new java.awt.Dimension(73, 30));

        btn_pesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_dadosLayout = new javax.swing.GroupLayout(pn_dados);
        pn_dados.setLayout(pn_dadosLayout);
        pn_dadosLayout.setHorizontalGroup(
            pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_descricao)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_dadosLayout.createSequentialGroup()
                            .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_localizacao))
                            .addGap(18, 18, 18)
                            .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_servico)
                                .addComponent(cbx_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn_dadosLayout.createSequentialGroup()
                        .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_dadosLayout.createSequentialGroup()
                                .addComponent(lbl_identificador)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pn_dadosLayout.createSequentialGroup()
                                .addComponent(txt_identificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_pesquisar)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pn_dadosLayout.setVerticalGroup(
            pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(lbl_identificador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisar))
                .addGap(27, 27, 27)
                .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_servico)
                    .addComponent(lbl_localizacao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_descricao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pn_equipamento.setBackground(new java.awt.Color(255, 255, 255));
        pn_equipamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Equipamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        lbl_codEquipamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_codEquipamento.setText("Código Equipamento");

        txt_codEquipamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_codEquipamento.setEnabled(false);

        lbl_nomeEquipamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nomeEquipamento.setText("Nome Equipamento");

        txt_nomeEquipamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nomeEquipamento.setEnabled(false);

        lbl_nomeEquipamento1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nomeEquipamento1.setText("Quantidade");

        txt_quantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_quantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_quantidade.setEnabled(false);

        btn_adiconar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_adiconar.setText("Adicionar");
        btn_adiconar.setEnabled(false);
        btn_adiconar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adiconarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setEnabled(false);

        btn_psgEquipamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_psgEquipamento.setText("Pesquisar");
        btn_psgEquipamento.setEnabled(false);
        btn_psgEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_psgEquipamentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Adicione os equipamentos");

        javax.swing.GroupLayout pn_equipamentoLayout = new javax.swing.GroupLayout(pn_equipamento);
        pn_equipamento.setLayout(pn_equipamentoLayout);
        pn_equipamentoLayout.setHorizontalGroup(
            pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_equipamentoLayout.createSequentialGroup()
                .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_equipamentoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_codEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_codEquipamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_psgEquipamento))
                    .addGroup(pn_equipamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_equipamentoLayout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(btn_excluir))
                    .addGroup(pn_equipamentoLayout.createSequentialGroup()
                        .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nomeEquipamento))
                        .addGap(18, 18, 18)
                        .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nomeEquipamento1))
                        .addGap(22, 22, 22)
                        .addComponent(btn_adiconar)))
                .addContainerGap())
        );
        pn_equipamentoLayout.setVerticalGroup(
            pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_equipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_adiconar)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nomeEquipamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_codEquipamento)))
                    .addComponent(lbl_nomeEquipamento1))
                .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_equipamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_equipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_psgEquipamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_equipamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_excluir)
                        .addGap(15, 15, 15))))
        );

        btn_avancar.setBackground(new java.awt.Color(32, 107, 165));
        btn_avancar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_avancar.setForeground(new java.awt.Color(255, 255, 255));
        btn_avancar.setText("Emitir O.S");
        btn_avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_avancarActionPerformed(evt);
            }
        });

        btn_voltar.setBackground(new java.awt.Color(32, 107, 165));
        btn_voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        tb_equipamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tb_equipamentos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tb_equipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Localização", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tb_equipamentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pn_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_equipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btn_avancar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(398, 398, 398))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pn_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                    .addComponent(pn_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_avancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
    
    public void CamboBoxServico (String sql) {
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
            
            statement = conexao.prepareStatement(sql);
            statement.execute(); // criar o vetor
            resultado = statement.executeQuery(sql);
            cbx_servico.removeAllItems();
            while(resultado.next()){               
                cbx_servico.addItem(resultado.getInt("id_servico")+ " - " +resultado.getString("nome_servico"));
            }
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btn_avancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_avancarActionPerformed
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = "INSERT INTO OrdemServico (cod_identificacao, cod_localizacao, cod_servico, descricao, data_emissao) VALUES (?,?,?,?,NOW());";
            int idFuncionario = Integer.parseInt(txt_identificador.getText());
            //passando combobox para o banco
            String comboBox = (String) cbx_localizacao.getSelectedItem();
            String [] partes = comboBox.split(" - ");
            String id = partes[0].trim();
            int id_local = Integer.parseInt(id);
            //passando combobox para o banco
            String comboBox2 = (String) cbx_servico.getSelectedItem();
            String [] partes2 = comboBox2.split(" - ");
            String id2 = partes2[0].trim();
            int id_servico = Integer.parseInt(id2);
            statement = conexao.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idFuncionario);
            statement.setInt(2, id_local);
            statement.setInt(3, id_servico);
            statement.setString(4, txta_descricao.getText());
            statement.execute();
            
            
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
            int ordemServicoId = generatedKeys.getInt(1);
            // Guardar o ID gerado para a próxima atualização
            txt_id.setText(String.valueOf(ordemServicoId));
        }
            statement.close();
            txt_quantidade.setEnabled(true);
            txt_codEquipamento.setEnabled(true);
            btn_psgEquipamento.setEnabled(true);
            btn_adiconar.setEnabled(true);
            btn_excluir.setEnabled(true);
            jLabel1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_avancarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        tela_cadastroOS.this.dispose();
        /*tela_lista_cadastroOS btn_voltar = new tela_lista_cadastroOS();
        btn_voltar.setVisible(true);*/
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        String idFuncionario = txt_identificador.getText().trim();

        if (idFuncionario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um ID de funcionário.", "Erro", JOptionPane.ERROR_MESSAGE);
            txt_identificador.requestFocus();
            return;
        }

        try {
            // Verifica se o ID contém apenas dígitos
            Integer.parseInt(idFuncionario);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID do funcionário inválido! Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            txt_identificador.requestFocus();
            txt_identificador.setText("");
            return;
        }

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "SELECT nome FROM funcionarios WHERE id_funcionario = ?;";
            statement = conexao.prepareStatement(sql);
            statement.setInt(1, Integer.parseInt(idFuncionario));
            resultado = statement.executeQuery();

            if (!resultado.next()) {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                txt_identificador.requestFocus();
                txt_identificador.setText("");
            } else {
                String nome = resultado.getString("nome");
                txt_nome.setText(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroOS.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.CamboBoxLocalizacao("SELECT * FROM localizacao ORDER BY id_local;");
        this.CamboBoxServico("SELECT * FROM servicos ORDER BY id_servico;");
        jLabel1.setVisible(false);
    }//GEN-LAST:event_formWindowGainedFocus

    private void btn_psgEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_psgEquipamentoActionPerformed
        String idEquipamento = txt_codEquipamento.getText().trim();

        if (idEquipamento.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um Código de Equipamento.", "Erro", JOptionPane.ERROR_MESSAGE);
            txt_codEquipamento.requestFocus();
            return;
        }

        try {
            // Verifica se o ID contém apenas dígitos
            Integer.parseInt(idEquipamento);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Código do Equipamento inválido! Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            txt_codEquipamento.requestFocus();
            txt_codEquipamento.setText("");
            return;
        }

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "SELECT nome FROM equipamentos WHERE id_equipamento = ?;";
            statement = conexao.prepareStatement(sql);
            statement.setInt(1, Integer.parseInt(idEquipamento));
            resultado = statement.executeQuery();

            if (!resultado.next()) {
                JOptionPane.showMessageDialog(null, "Equipamento não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                txt_codEquipamento.requestFocus();
                txt_codEquipamento.setText("");
            } else {
                String nome = resultado.getString("nome");
                txt_nomeEquipamento.setText(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroOS.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar Equipamento: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_psgEquipamentoActionPerformed

    private void btn_adiconarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adiconarActionPerformed
        try {
        conexao = DriverManager.getConnection(url, usuario, senha);
        
        // SQL para inserir um equipamento na ordem de serviço
        String sqlInsert = "INSERT INTO OSequipamentos (ordem_servico_id, cod_equipamento, quantidade) VALUES (?, ?, ?)";
        
        // Obtendo valores dos campos
        int ordemServicoId = Integer.parseInt(txt_id.getText());
        int codEquipamento = Integer.parseInt(txt_codEquipamento.getText());
        int quantidade = Integer.parseInt(txt_quantidade.getText());
        
        // Preparando e executando a inserção
        statement = conexao.prepareStatement(sqlInsert);
        statement.setInt(1, ordemServicoId);
        statement.setInt(2, codEquipamento);
        statement.setInt(3, quantidade);
        statement.executeUpdate();
        
        statement.close();
        tb_equipamentos();
        // Exibindo mensagem de sucesso ou atualizando a interface conforme necessário
        JOptionPane.showMessageDialog(this, "Equipamento adicionado com sucesso!");
        
    } catch (SQLException ex) {
        Logger.getLogger(tela_cadastroOS.class.getName()).log(Level.SEVERE, null, ex);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.");
    }
        
    }//GEN-LAST:event_btn_adiconarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_cadastroOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastroOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adiconar;
    private javax.swing.JButton btn_avancar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_psgEquipamento;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbx_localizacao;
    private javax.swing.JComboBox<String> cbx_servico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_codEquipamento;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_identificador;
    private javax.swing.JLabel lbl_localizacao;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nomeEquipamento;
    private javax.swing.JLabel lbl_nomeEquipamento1;
    private javax.swing.JLabel lbl_servico;
    private javax.swing.JPanel pn_dados;
    private javax.swing.JPanel pn_equipamento;
    private javax.swing.JTable tb_equipamentos;
    private javax.swing.JTextField txt_codEquipamento;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_identificador;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nomeEquipamento;
    private javax.swing.JTextField txt_quantidade;
    private javax.swing.JTextArea txta_descricao;
    // End of variables declaration//GEN-END:variables
}
