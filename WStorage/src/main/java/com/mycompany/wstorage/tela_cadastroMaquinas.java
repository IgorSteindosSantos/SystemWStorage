/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.wstorage;

/**
 *
 * @author Podol
 */
public class tela_cadastroMaquinas extends javax.swing.JFrame {

    /**
     * Creates new form tela_cadastroMaquinas
     */
    public tela_cadastroMaquinas() {
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

        jPanel1 = new javax.swing.JPanel();
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
        txt_dataemissao = new javax.swing.JTextField();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btn_salvar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_imgmaquina = new javax.swing.JLabel();
        btn_salvarimg = new javax.swing.JButton();
        btn_exluirimg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WStorage");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_cadastroMaquinas.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_cadastroMaquinas.setText("Cadastro de Máquinas");

        lbl_idmaquina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_idmaquina.setText("Código Máquina");

        txt_idmaquina.setBackground(new java.awt.Color(204, 204, 204));
        txt_idmaquina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_idmaquina.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_numeroserie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_numeroserie.setText("Número de série");

        txt_numeroSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_numeroSerie.setPreferredSize(new java.awt.Dimension(64, 26));

        jCheckBox_status.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox_status.setText("Ativo");

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_nome.setText("Nome");

        txt_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbl_dataemissao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_dataemissao.setText("Data de Emissão");

        txt_dataemissao.setBackground(new java.awt.Color(204, 204, 204));
        txt_dataemissao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_dataemissao.setMinimumSize(new java.awt.Dimension(64, 26));
        txt_dataemissao.setPreferredSize(new java.awt.Dimension(64, 26));

        lbl_modelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_modelo.setText("Modelo");

        txt_modelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_modelo.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_localizacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_localizacao.setText("Localização");

        cbx_localizacao.setPreferredSize(new java.awt.Dimension(72, 26));

        lbl_fabricante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_fabricante.setText("Fabricante");

        txt_fabricante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_fabricante.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_dimensoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_dimensoes.setText("Dimensões");

        txt_dimensoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_dimensoes.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_linkmanual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_linkmanual.setText("Link para o manual");

        txt_linkmanual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_linkmanual.setMinimumSize(new java.awt.Dimension(64, 26));

        lbl_descricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_descricao.setText("Descrição");

        jScrollPane1.setViewportView(jTextPane1);

        btn_salvar.setBackground(new java.awt.Color(32, 107, 165));
        btn_salvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar.setText("Salva");

        btn_excluir.setBackground(new java.awt.Color(32, 107, 165));
        btn_excluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("Excluir");

        btn_voltar.setBackground(new java.awt.Color(32, 107, 165));
        btn_voltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        lbl_imgmaquina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_imgmaquina.setText("Imagem da Máquina");

        btn_salvarimg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_salvarimg.setText("Salvar");

        btn_exluirimg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_exluirimg.setText("Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_cadastroMaquinas)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txt_fabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lbl_modelo)
                                                                .addComponent(lbl_fabricante))
                                                            .addGap(0, 0, Short.MAX_VALUE)))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_localizacao)
                                                        .addComponent(cbx_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl_dimensoes)
                                                        .addComponent(txt_dimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(txt_nome)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_idmaquina)
                                                        .addComponent(lbl_nome)
                                                        .addComponent(txt_idmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_numeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl_numeroserie))))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(44, 44, 44)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_dataemissao)
                                                        .addComponent(jCheckBox_status, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_dataemissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl_linkmanual)
                                                        .addComponent(txt_linkmanual, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(357, 357, 357)
                                                    .addComponent(lbl_imgmaquina))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGap(339, 339, 339)
                                                    .addComponent(btn_salvarimg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btn_exluirimg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(lbl_descricao))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(btn_salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_excluir)
                        .addGap(18, 18, 18)
                        .addComponent(btn_voltar)))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_cadastroMaquinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_idmaquina)
                    .addComponent(lbl_numeroserie)
                    .addComponent(lbl_imgmaquina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_status)
                    .addComponent(txt_idmaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_numeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_dataemissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_dataemissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_modelo)
                    .addComponent(lbl_localizacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_localizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salvarimg)
                        .addComponent(btn_exluirimg))
                    .addComponent(txt_modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fabricante)
                    .addComponent(lbl_dimensoes)
                    .addComponent(lbl_linkmanual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txt_dimensoes, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txt_linkmanual, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbl_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_excluir)
                    .addComponent(btn_voltar))
                .addGap(17, 17, 17))
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

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        tela_cadastroMaquinas.this.dispose();
        tela_lista_cadastraMaquinas btn_voltar = new tela_lista_cadastraMaquinas();
        btn_voltar.setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed

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
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_exluirimg;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_salvarimg;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbx_localizacao;
    private javax.swing.JCheckBox jCheckBox_status;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
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
    private javax.swing.JTextField txt_linkmanual;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numeroSerie;
    // End of variables declaration//GEN-END:variables
}
