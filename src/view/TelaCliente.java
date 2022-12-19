/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.TelaClienteController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jjsco
 */
public class TelaCliente extends javax.swing.JInternalFrame {

    private final TelaClienteController controller;
    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
        initComponents();
        controller = new TelaClienteController(this); 
    }

    public JTextField getjTextFieldPesquisar() {
        return jTextFieldPesquisar;
    }

    public void setjTextFieldPesquisar(JTextField jTextFieldPesquisar) {
        this.jTextFieldPesquisar = jTextFieldPesquisar;
    }

    public JTable getjTableClientes() {
        return jTableCliente;
    }

    public void setjTableClientes(JTable jTableClientes) {
        this.jTableCliente = jTableClientes;
    }

    
    public JTable getjTableCliente() {
        return jTableCliente;
    }

    public void setjTableCliente(JTable jTableCliente) {
        this.jTableCliente = jTableCliente;
    }
    
    
    
    public JTextField getjTextFieldBairroCliente() {
        return jTextFieldBairroCliente;
    }

    public void setjTextFieldBairroCliente(JTextField jTextFieldBairroCliente) {
        this.jTextFieldBairroCliente = jTextFieldBairroCliente;
    }

    public JTextField getjTextFieldCelCliente() {
        return jTextFieldCelCliente;
    }

    public void setjTextFieldCelCliente(JTextField jTextFieldCelCliente) {
        this.jTextFieldCelCliente = jTextFieldCelCliente;
    }

    public JTextField getjTextFieldCpfCliente() {
        return jTextFieldCpfCliente;
    }

    public void setjTextFieldCpfCliente(JTextField jTextFieldCpfCliente) {
        this.jTextFieldCpfCliente = jTextFieldCpfCliente;
    }

    public JTextField getjTextFieldIdCLiente() {
        return jTextFieldIdCLiente;
    }

    public void setjTextFieldIdCLiente(JTextField jTextFieldIdCLiente) {
        this.jTextFieldIdCLiente = jTextFieldIdCLiente;
    }

    public JTextField getjTextFieldNomeCliente() {
        return jTextFieldNomeCliente;
    }

    public void setjTextFieldNomeCliente(JTextField jTextFieldNomeCliente) {
        this.jTextFieldNomeCliente = jTextFieldNomeCliente;
    }

    public JTextField getjTextFieldNumCliente() {
        return jTextFieldNumCliente;
    }

    public void setjTextFieldNumCliente(JTextField jTextFieldNumCliente) {
        this.jTextFieldNumCliente = jTextFieldNumCliente;
    }

    public JTextField getjTextFieldReferenciaCliente() {
        return jTextFieldReferenciaCliente;
    }

    public void setjTextFieldReferenciaCliente(JTextField jTextFieldReferenciaCliente) {
        this.jTextFieldReferenciaCliente = jTextFieldReferenciaCliente;
    }

    public JTextField getjTextFieldRuaCliente() {
        return jTextFieldRuaCliente;
    }

    public void setjTextFieldRuaCliente(JTextField jTextFieldRuaCliente) {
        this.jTextFieldRuaCliente = jTextFieldRuaCliente;
    }

    public JTextField getjTextFieldTelCliente() {
        return jTextFieldTelCliente;
    }

    public void setjTextFieldTelCliente(JTextField jTextFieldTelCliente) {
        this.jTextFieldTelCliente = jTextFieldTelCliente;
    }

    public JButton getjButtonAtualizar() {
        return jButtonAtualizar;
    }

    public void setjButtonAtualizar(JButton jButtonAtualizar) {
        this.jButtonAtualizar = jButtonAtualizar;
    }

    public JButton getjButtonCadastrar() {
        return jButtonCadastrar;
    }

    public void setjButtonCadastrar(JButton jButtonCadastrar) {
        this.jButtonCadastrar = jButtonCadastrar;
    }

    public JButton getjButtonExcluir() {
        return jButtonExcluir;
    }

    public void setjButtonExcluir(JButton jButtonExcluir) {
        this.jButtonExcluir = jButtonExcluir;
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

        jLabelid = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelReferencia = new javax.swing.JLabel();
        jTextFieldIdCLiente = new javax.swing.JTextField();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jTextFieldCpfCliente = new javax.swing.JTextField();
        jTextFieldTelCliente = new javax.swing.JTextField();
        jTextFieldNumCliente = new javax.swing.JTextField();
        jTextFieldBairroCliente = new javax.swing.JTextField();
        jTextFieldRuaCliente = new javax.swing.JTextField();
        jTextFieldCelCliente = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jLabelLupa = new javax.swing.JLabel();
        jTextFieldReferenciaCliente = new javax.swing.JTextField();
        jButtonLimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabelTelaDeFundo = new javax.swing.JLabel();
        jLabelTelaDeFundo1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cliente");
        setPreferredSize(new java.awt.Dimension(796, 449));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelid.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelid.setForeground(new java.awt.Color(255, 255, 255));
        jLabelid.setText("*ID");
        getContentPane().add(jLabelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 30, -1));

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("*Nome");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabelCPF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setText("*CPF");
        getContentPane().add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        jLabelRua.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelRua.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRua.setText("*Rua");
        getContentPane().add(jLabelRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabelBairro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBairro.setText("*Bairro");
        getContentPane().add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabelCelular.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCelular.setText("Celular");
        getContentPane().add(jLabelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabelNumero.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("*Numero");
        getContentPane().add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("Telefone");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 20));

        jLabelReferencia.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelReferencia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReferencia.setText("Referência");
        getContentPane().add(jLabelReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jTextFieldIdCLiente.setEditable(false);
        jTextFieldIdCLiente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldIdCLiente.setToolTipText("ID cliente");
        jTextFieldIdCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdCLienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdCLiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 60, -1));

        jTextFieldNomeCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldNomeCliente.setToolTipText("Nome cliente");
        jTextFieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 210, -1));

        jTextFieldCpfCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldCpfCliente.setToolTipText("CPF cliente");
        getContentPane().add(jTextFieldCpfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 140, -1));

        jTextFieldTelCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldTelCliente.setToolTipText("Telefone cliente");
        getContentPane().add(jTextFieldTelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 150, -1));

        jTextFieldNumCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldNumCliente.setToolTipText("Numero endereço cliente");
        getContentPane().add(jTextFieldNumCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 80, -1));

        jTextFieldBairroCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldBairroCliente.setToolTipText("Bairro cliente");
        jTextFieldBairroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBairroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 130, -1));

        jTextFieldRuaCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldRuaCliente.setToolTipText("Rua cliente");
        getContentPane().add(jTextFieldRuaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, -1));

        jTextFieldCelCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldCelCliente.setToolTipText("Celular cliente");
        getContentPane().add(jTextFieldCelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 100, -1));

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconAtualizar.png"))); // NOI18N
        jButtonAtualizar.setToolTipText("Atualizar dados");
        jButtonAtualizar.setMaximumSize(new java.awt.Dimension(80, 80));
        jButtonAtualizar.setMinimumSize(new java.awt.Dimension(80, 80));
        jButtonAtualizar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconAdd.png"))); // NOI18N
        jButtonCadastrar.setToolTipText("Cadastrar cliente");
        jButtonCadastrar.setMaximumSize(new java.awt.Dimension(80, 80));
        jButtonCadastrar.setMinimumSize(new java.awt.Dimension(80, 80));
        jButtonCadastrar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconRemover.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir cliente");
        jButtonExcluir.setMaximumSize(new java.awt.Dimension(80, 80));
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(80, 80));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jTextFieldPesquisar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldPesquisar.setToolTipText("Nome do cliente");
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });
        jTextFieldPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, -1));

        jLabelLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconPesquisa.png"))); // NOI18N
        getContentPane().add(jLabelLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 40));

        jTextFieldReferenciaCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldReferenciaCliente.setToolTipText("Referência endereço cliente ");
        getContentPane().add(jTextFieldReferenciaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 280, -1));

        jButtonLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/limparCampos.png"))); // NOI18N
        jButtonLimparCampos.setToolTipText("Limpar campos");
        jButtonLimparCampos.setPreferredSize(new java.awt.Dimension(80, 80));
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimparCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jTableCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Bairro", "Rua", "Num", "Telefone", "Celular"
            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jTableCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableClienteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 750, 110));

        jLabelTelaDeFundo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelTelaDeFundo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelaDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/TeladeFundoCliente.jpg"))); // NOI18N
        getContentPane().add(jLabelTelaDeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 410));

        jLabelTelaDeFundo1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelTelaDeFundo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelaDeFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/TeladeFundoCliente.jpg"))); // NOI18N
        getContentPane().add(jLabelTelaDeFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdCLienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdCLienteActionPerformed

    private void jTextFieldBairroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroClienteActionPerformed

    private void jTextFieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeClienteActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        controller.salvaCliente();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyReleased
        try {
            controller.mostraCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldPesquisarKeyReleased

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        controller.alteraDadosCliente();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        controller.deletaDadosCliente();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        controller.limparCampos();
        getjButtonCadastrar().setEnabled(true);
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jTextFieldPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyPressed
        
    }//GEN-LAST:event_jTextFieldPesquisarKeyPressed

    private void jTableClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableClienteKeyPressed
       
    }//GEN-LAST:event_jTableClienteKeyPressed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
       
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        controller.setarCampos();
    }//GEN-LAST:event_jTableClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelLupa;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelReferencia;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelTelaDeFundo;
    private javax.swing.JLabel jLabelTelaDeFundo1;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldBairroCliente;
    private javax.swing.JTextField jTextFieldCelCliente;
    private javax.swing.JTextField jTextFieldCpfCliente;
    private javax.swing.JTextField jTextFieldIdCLiente;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNumCliente;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldReferenciaCliente;
    private javax.swing.JTextField jTextFieldRuaCliente;
    private javax.swing.JTextField jTextFieldTelCliente;
    // End of variables declaration//GEN-END:variables
}
