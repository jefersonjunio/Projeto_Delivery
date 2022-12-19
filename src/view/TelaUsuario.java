/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.TelaUsuarioController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**     
 *
 * @author jjsco
 */
public class TelaUsuario extends javax.swing.JInternalFrame {
    
    private final TelaUsuarioController controller;
    /**
     * Creates new form TelaUsuario
     */
    public TelaUsuario() {
        initComponents();
        controller = new TelaUsuarioController(this); 
    }
    
    /*Getters and Setters*/

    public JComboBox<String> getjComboBoxCargo() {
        return jComboBoxCargo;
    }

    public void setjComboBoxCargo(JComboBox<String> jComboBoxCargo) {
        this.jComboBoxCargo = jComboBoxCargo;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public void setjTextFieldId(JTextField jTextFieldId) {
        this.jTextFieldId = jTextFieldId;
    }

    public JTextField getjTextFieldLogin() {
        return jTextFieldLogin;
    }

    public void setjTextFieldLogin(JTextField jTextFieldLogin) {
        this.jTextFieldLogin = jTextFieldLogin;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JButton getBtnAtualizarUsu() {
        return btnAtualizarUsu;
    }

    public void setBtnAtualizarUsu(JButton btnAtualizarUsu) {
        this.btnAtualizarUsu = btnAtualizarUsu;
    }

    public JButton getBtnCadastrarUsu() {
        return btnCadastrarUsu;
    }

    public void setBtnCadastrarUsu(JButton btnCadastrarUsu) {
        this.btnCadastrarUsu = btnCadastrarUsu;
    }

    public JButton getBtnMostrarUsu() {
        return btnMostrarUsu;
    }

    public void setBtnMostrarUsu(JButton btnMostrarUsu) {
        this.btnMostrarUsu = btnMostrarUsu;
    }

    public JButton getBtnRemoverUsu() {
        return btnRemoverUsu;
    }

    public void setBtnRemoverUsu(JButton btnRemoverUsu) {
        this.btnRemoverUsu = btnRemoverUsu;
    }

    public JButton getjButtonLimparCampos() {
        return jButtonLimparCampos;
    }

    public void setjButtonLimparCampos(JButton jButtonLimparCampos) {
        this.jButtonLimparCampos = jButtonLimparCampos;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        btnCadastrarUsu = new javax.swing.JButton();
        btnRemoverUsu = new javax.swing.JButton();
        btnMostrarUsu = new javax.swing.JButton();
        btnAtualizarUsu = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuário");
        setPreferredSize(new java.awt.Dimension(576, 447));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 30, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("*Senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jPasswordFieldSenha.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPasswordFieldSenha.setToolTipText("Senha do Usuário");
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 195, -1));

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldId.setToolTipText("ID do Usuário");
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 78, -1));

        jTextFieldNome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldNome.setToolTipText("Nome do Usuário");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 195, -1));

        jTextFieldLogin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldLogin.setToolTipText("Login do Usuário");
        getContentPane().add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, -1));

        jComboBoxCargo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendente", "Administrador", " " }));
        jComboBoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCargoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 140, -1));

        btnCadastrarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/216487_add_user_icon (1).png"))); // NOI18N
        btnCadastrarUsu.setToolTipText("Cadastrar");
        btnCadastrarUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarUsu.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCadastrarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 90, 100));

        btnRemoverUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/216494_user_delete_icon.png"))); // NOI18N
        btnRemoverUsu.setToolTipText("Remover");
        btnRemoverUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverUsu.setPreferredSize(new java.awt.Dimension(80, 80));
        btnRemoverUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoverUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 90, 100));

        btnMostrarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/216498_user_icon.png"))); // NOI18N
        btnMostrarUsu.setToolTipText("Mostrar Usuario");
        btnMostrarUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarUsu.setPreferredSize(new java.awt.Dimension(80, 80));
        btnMostrarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 90, 100));

        btnAtualizarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/216388_refresh_icon.png"))); // NOI18N
        btnAtualizarUsu.setToolTipText("Atualizar Cadastro");
        btnAtualizarUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarUsu.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAtualizarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 90, 100));

        jButtonLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/limparCampos.png"))); // NOI18N
        jButtonLimparCampos.setToolTipText("Limpar Campos");
        jButtonLimparCampos.setPreferredSize(new java.awt.Dimension(80, 80));
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimparCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, 100));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/TelaFundoUsuario (1).jpg"))); // NOI18N
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 410));

        setBounds(0, 0, 796, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCargoActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void btnMostrarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsuActionPerformed
        try {
            controller.mostraUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarUsuActionPerformed

    private void btnCadastrarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuActionPerformed
        controller.salvaUsuario();
    }//GEN-LAST:event_btnCadastrarUsuActionPerformed

    private void btnAtualizarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarUsuActionPerformed
        controller.alteraDadosUsuario();
    }//GEN-LAST:event_btnAtualizarUsuActionPerformed

    private void btnRemoverUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverUsuActionPerformed
        controller.deletaDadosUsuario();
    }//GEN-LAST:event_btnRemoverUsuActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        controller.limparCampos();
        getBtnCadastrarUsu().setEnabled(true);
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarUsu;
    private javax.swing.JButton btnCadastrarUsu;
    private javax.swing.JButton btnMostrarUsu;
    private javax.swing.JButton btnRemoverUsu;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}