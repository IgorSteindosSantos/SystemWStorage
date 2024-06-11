/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.wstorage;

//import static com.mycompany.wstorage.tela_lista_cadastroMaquinas.id;
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
 * @author Podol
 */
public class tela_cadastroMaquinas extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet resultado = null;
    String url = "jdbc:mysql://localhost/wstorage_db";
    String usuario = "root";
    String senha = "";
    
    public void limparCampos() {
    txt_nome.setText("");
    txt_modelo.setText("");
    txt_modelo.setText("");
    txt_fabricante.setText("");
    txt_linkmanual.setText("");
    txt_modelo.setText("");
    txt_numeroSerie.setText("");
    txta_descricao.setText("");
    txt_dimensoes.setText("");
    }
   
    public void popularCamboBox (String sql) {
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
            
            PreparedStatement banco = (PreparedStatement)conexao.prepareStatement(sql);
            banco.execute(); // criar o vetor
            resultado = banco.executeQuery(sql);
            cbx_localizacao.removeAllItems();
            while(resultado.next()){               
                cbx_localizacao.addItem(resultado.getInt("id_local")+ " - " +resultado.getString("nome_local"));
            }
            banco.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void id_maquina () {
        try {
            //Pupulando txt_codigo com id_local
            int ultimoId = 0;
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = "SELECT MAX(id_maquina)+1 as ultimoID FROM maquinas;";
            PreparedStatement pst = conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                try {
                    ultimoId = rs.getInt("ultimoID");
                } catch (SQLException ex) {
                    Logger.getLogger(tela_localizacao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //converter para string
            this.txt_idmaquina.setText(String.valueOf(ultimoId));
        } catch (SQLException ex) {
        Logger.getLogger(tela_localizacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public tela_cadastroMaquinas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();
        lbl_cadastroMaquinas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_idmaquina = new javax.swing.JLabel();
        txt_idmaquina = new javax.swing.JTextField();
        lbl_numeroserie = new javax.swing.JLabel();
        txt_numeroSerie = new javax.swing.JTextField();
        jCheckBox_status = new javax.swing.JCheckBox();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_dataemissao = new javax.swing.JLabel();
        lbl_modelo = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        lbl_localizacao = new javax.swing.JLabel();
        cbx_localizacao = new javax.swing.JComboBox<>();
        lbl_fabricante = new javax.swing.JLabel();
        txt_fabricante = new javax.swing.JTextField();
        lbl_dimensoes = new javax.swing.JLabel();
        txt_dimensoes = new javax.swing.JTextField();
        lbl_linkmanual = new javax.swing.JLabel();
        txt_linkmanual = new javax.swing.JTextField();
        lbl_descricao = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_imgmaquina = new javax.swing.JLabel();
        btn_salvarimg = new javax.swing.JButton();
        btn_exluirimg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_descricao = new javax.swing.JTextArea();
        txt_dataemissao = new javax.swing.JTextField();
        txt_imagem = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WStorage");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_cadastroMaquinas.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_cadastroMaquinas.setText("Cadastro de Máquinas");

        lbl_idmaquina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_idmaquina.setText("Código Máquina");

        txt_idmaquina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_idmaquina.setEnabled(false);
        txt_idmaquina.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_numeroserie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_numeroserie.setText("Número de série");

        txt_numeroSerie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_numeroSerie.setPreferredSize(new java.awt.Dimension(64, 26));

        jCheckBox_status.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox_status.setText("Status Ativo");
        jCheckBox_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_statusActionPerformed(evt);
            }
        });

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nome.setText("Nome");

        txt_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbl_dataemissao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_dataemissao.setText("Data de Emissão");

        lbl_modelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_modelo.setText("Modelo");

        txt_modelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_modelo.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_localizacao.setText("Localização");

        cbx_localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbx_localizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_localizacao.setPreferredSize(new java.awt.Dimension(72, 26));

        lbl_fabricante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_fabricante.setText("Fabricante");

        txt_fabricante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_fabricante.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_dimensoes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_dimensoes.setText("Dimensões");

        txt_dimensoes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_dimensoes.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_linkmanual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_linkmanual.setText("Link para o manual");

        txt_linkmanual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_linkmanual.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_descricao.setText("Descrição");

        btn_salvar.setBackground(new java.awt.Color(32, 107, 165));
        btn_salvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar.setText("Salva");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(32, 107, 165));
        btn_excluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("Excluir");

        btn_voltar.setBackground(new java.awt.Color(32, 107, 165));
        btn_voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        lbl_imgmaquina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_imgmaquina.setText("Imagem da Máquina");

        btn_salvarimg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_salvarimg.setText("Salvar");
        btn_salvarimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarimgActionPerformed(evt);
            }
        });

        btn_exluirimg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_exluirimg.setText("Excluir");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txta_descricao.setColumns(20);
        txta_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txta_descricao.setRows(5);
        jScrollPane2.setViewportView(txta_descricao);

        txt_dataemissao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_dataemissao.setEnabled(false);
        txt_dataemissao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_dataemissaoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txt_imagem.setEditable(false);
        txt_imagem.setText("jTextField1");
        txt_imagem.setEnabled(false);

        btn_editar.setBackground(new java.awt.Color(32, 107, 165));
        btn_editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cadastroMaquinas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_idmaquina)
                                    .addComponent(lbl_nome)
                                    .addComponent(txt_idmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_numeroserie)
                                    .addComponent(txt_numeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_nome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbl_fabricante)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbl_modelo)
                                            .addGap(143, 143, 143)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_localizacao)
                                    .addComponent(lbl_dimensoes)
                                    .addComponent(txt_dimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_linkmanual)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_linkmanual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jCheckBox_status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(lbl_dataemissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addGap(39, 39, 39)
                                                            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(txt_dataemissao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btn_salvarimg)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(btn_exluirimg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(15, 15, 15)))))
                                        .addGap(54, 54, 54))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_imgmaquina)
                                .addGap(99, 99, 99))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_descricao)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btn_voltar)
                                .addGap(130, 130, 130)
                                .addComponent(btn_excluir)
                                .addGap(133, 133, 133)
                                .addComponent(btn_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_salvar)
                                .addGap(78, 78, 78)))
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbl_cadastroMaquinas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txt_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_imgmaquina, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_idmaquina)
                        .addComponent(lbl_numeroserie)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBox_status)
                                .addComponent(txt_numeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_idmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nome)
                            .addComponent(lbl_dataemissao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txt_dataemissao))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_modelo)
                                    .addComponent(lbl_localizacao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fabricante)
                            .addComponent(lbl_dimensoes)
                            .addComponent(lbl_linkmanual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_linkmanual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_salvarimg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exluirimg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(lbl_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        txt_idmaquina.getAccessibleContext().setAccessibleDescription("");
        txt_numeroSerie.getAccessibleContext().setAccessibleDescription("");
        txt_nome.getAccessibleContext().setAccessibleDescription("");
        txt_modelo.getAccessibleContext().setAccessibleDescription("");
        cbx_localizacao.getAccessibleContext().setAccessibleDescription("");
        txt_fabricante.getAccessibleContext().setAccessibleDescription("");
        txt_dimensoes.getAccessibleContext().setAccessibleDescription("");
        txt_linkmanual.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed

        tela_cadastroMaquinas.this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Populando combobox em ordem pelo id_local
        this.popularCamboBox("SELECT * FROM localizacao ORDER BY id_local");
        jFileChooser1.setVisible(false);//Ocutando amba procurar imagem
        id_maquina();//Atualizar o id_maquina
        //popularCampos();
        txt_imagem.setVisible(false);
        btn_excluir.setVisible(false);
        btn_editar.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_salvarimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarimgActionPerformed
        // TODO add your handling code here: 
        jFileChooser1.setVisible(true);
        int result = this.jFileChooser1.showOpenDialog(this.jFileChooser1);
        if(result == JFileChooser.APPROVE_OPTION){
            String filePath = this.jFileChooser1.getSelectedFile().getAbsolutePath();
            ImageIcon icon = new ImageIcon(filePath);
            this.jLabel2.setIcon(icon);
            this.txt_imagem.setText(filePath);
        }
    }//GEN-LAST:event_btn_salvarimgActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
                    
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
            String sql = "INSERT INTO maquinas (numero_serie,nome,modelo,fabricante,dimensoes,link_manual,descricao,data_emissao,cod_localizacao,status,imagens) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            int num = Integer.parseInt(txt_numeroSerie.getText());
            double numD = Double.parseDouble(txt_dimensoes.getText());
            //passando combobox para o banco
            String comboBox = (String) cbx_localizacao.getSelectedItem();
            String [] partes = comboBox.split(" - ");
            String id = partes[0].trim();
            int id_local = Integer.parseInt(id);
            //convertendo data para o banco 
            String dia = txt_dataemissao.getText().substring(0, 2);
            String mes = txt_dataemissao.getText().substring(3, 5);       
            String ano = txt_dataemissao.getText().substring(6);
            String data = ano+"-"+mes+"-"+dia;
            //colocando status na maquina com o checkbox
            String checkbox = "";
            if(jCheckBox_status.isSelected()) {
                checkbox+="Ativo";
            } else {
                checkbox+="Desativado";
            }
            statement = conexao.prepareStatement(sql);
            statement.setInt(1, num);
            statement.setString(2, txt_nome.getText());
            statement.setString(3, txt_modelo.getText());
            statement.setString(4, txt_fabricante.getText());
            statement.setDouble(5, numD);
            statement.setString(6, txt_linkmanual.getText());
            statement.setString(7, txta_descricao.getText());
            statement.setString(8, data);
            statement.setInt(9, id_local);
            statement.setString(10, checkbox);
            statement.setString(11, txt_imagem.getText());
            statement.execute();
            statement.close();
            limparCampos();
            id_maquina();//Atualizar o id_maquina
            JOptionPane.showInternalMessageDialog(null,"Máquina cadastrada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void txt_dataemissaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_dataemissaoAncestorAdded
        //Populando txt_dataemissao com a data atual do sistema
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        txt_dataemissao.setText(data);
    }//GEN-LAST:event_txt_dataemissaoAncestorAdded

    private void jCheckBox_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_statusActionPerformed
        // TODO add your handling code here:
        /*String checkbox = "";
        if(cbx_localizacao.isEnabled()) {
            checkbox+="Ativo";
        } else {
            checkbox+="Desativado";
        }*/
    }//GEN-LAST:event_jCheckBox_statusActionPerformed

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
            java.util.logging.Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastroMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastroMaquinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_exluirimg;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_salvarimg;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbx_localizacao;
    private javax.swing.JCheckBox jCheckBox_status;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_cadastroMaquinas;
    private javax.swing.JLabel lbl_dataemissao;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_dimensoes;
    private javax.swing.JLabel lbl_fabricante;
    private javax.swing.JLabel lbl_idmaquina;
    private javax.swing.JLabel lbl_imgmaquina;
    private javax.swing.JLabel lbl_linkmanual;
    private javax.swing.JLabel lbl_localizacao;
    private javax.swing.JLabel lbl_modelo;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_numeroserie;
    private javax.swing.JTextField txt_dataemissao;
    private javax.swing.JTextField txt_dimensoes;
    private javax.swing.JTextField txt_fabricante;
    private javax.swing.JTextField txt_idmaquina;
    private javax.swing.JTextField txt_imagem;
    private javax.swing.JTextField txt_linkmanual;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numeroSerie;
    private javax.swing.JTextArea txta_descricao;
    // End of variables declaration//GEN-END:variables

}
