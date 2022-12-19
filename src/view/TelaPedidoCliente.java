/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.TelaPedidoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jjsco
 */
public class TelaPedidoCliente extends javax.swing.JInternalFrame {

    private final TelaPedidoController controller;
    /**
     * Creates new form TelaCliente
     */
    public TelaPedidoCliente() {
        initComponents();
        controller = new TelaPedidoController(this); 
    }
    

    public JTable getjTableClientes() {
        return jTableClientes;
    }

    public void setjTableClientes(JTable jTableClientes) {
        this.jTableClientes = jTableClientes;
    }

    public JTable getjTableProdutos() {
        return jTableProdutos;
    }

    public void setjTableProdutos(JTable jTableProdutos) {
        this.jTableProdutos = jTableProdutos;
    }
    
    public JTextField getjTextFieldNomeCliente() {
        return jTextFieldNomeCliente;
    }

    public void setjTextFieldNomeCliente(JTextField jTextFieldNomeCliente) {
        this.jTextFieldNomeCliente = jTextFieldNomeCliente;
    }

    public JTextField getjTextFieldidClienteTabCliente() {
        return jTextFieldidClienteTabCliente;
    }

    public void setjTextFieldidClienteTabCliente(JTextField jTextFieldidClienteTabCliente) {
        this.jTextFieldidClienteTabCliente = jTextFieldidClienteTabCliente;
    }

    public JTextField getjTextFieldidProdutoTabProduto() {
        return jTextFieldidProdutoTabProduto;
    }

    public void setjTextFieldidProdutoTabProduto(JTextField jTextFieldidProdutoTabProduto) {
        this.jTextFieldidProdutoTabProduto = jTextFieldidProdutoTabProduto;
    }

    public JTextField getjTextFieldNomeProduto() {
        return jTextFieldNomeProduto;
    }

    public void setjTextFieldNomeProduto(JTextField jTextFieldNomeProduto) {
        this.jTextFieldNomeProduto = jTextFieldNomeProduto;
    }

    public JTextField getjTextFieldQntProdutoTabPedidos() {
        return jTextFieldQntProduto;
    }

    public void setjTextFieldQntProdutoTabPedidos(JTextField jTextFieldQntProdutoTabPedidos) {
        this.jTextFieldQntProduto = jTextFieldQntProdutoTabPedidos;
    }

    public JTable getjTablePedidos() {
        return jTablePedidos;
    }

    public void setjTablePedidos(JTable jTablePedidos) {
        this.jTablePedidos = jTablePedidos;
    }

    public JTextField getjTextFieldNomeProdutoTabPedidos() {
        return jTextFieldNomeProdutoTabProduto;
    }

    public void setjTextFieldNomeProdutoTabPedidos(JTextField jTextFieldNomeProdutoTabPedidos) {
        this.jTextFieldNomeProdutoTabProduto = jTextFieldNomeProdutoTabPedidos;
    }

    public JTextField getjTextFieldPrecoProdTabPedidos() {
        return jTextFieldPrecoProdTabProduto;
    }

    public void setjTextFieldPrecoProdTabPedidos(JTextField jTextFieldPrecoProdTabPedidos) {
        this.jTextFieldPrecoProdTabProduto = jTextFieldPrecoProdTabPedidos;
    }

    public JTextField getjTextFieldNumPedidoCliente() {
        return jTextFieldNumPedidoCliente;
    }

    public void setjTextFieldNumPedidoCliente(JTextField jTextFieldNumPedidoCliente) {
        this.jTextFieldNumPedidoCliente = jTextFieldNumPedidoCliente;
    }

    public JButton getjButtonSolicitarPedido() {
        return jButtonSolicitarPedido;
    }

    public void setjButtonSolicitarPedido(JButton jButtonSolicitarPedido) {
        this.jButtonSolicitarPedido = jButtonSolicitarPedido;
    }

    public JTextField getjTextFieldTotal() {
        return jTextFieldTotal;
    }

    public void setjTextFieldTotal(JTextField jTextFieldTotal) {
        this.jTextFieldTotal = jTextFieldTotal;
    }

    public JTextField getjTextFieldValorAcumulado() {
        return jTextFieldValorAcumulado;
    }

    public void setjTextFieldValorAcumulado(JTextField jTextFieldValorAcumulado) {
        this.jTextFieldValorAcumulado = jTextFieldValorAcumulado;
    }

    public JButton getjButtonFinalizaPedido() {
        return jButtonFinalizaPedido;
    }

    public void setjButtonFinalizaPedido(JButton jButtonFinalizaPedido) {
        this.jButtonFinalizaPedido = jButtonFinalizaPedido;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldidProdutoTabProduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQntProduto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNomeProdutoTabProduto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPrecoProdTabProduto = new javax.swing.JTextField();
        jButtonSolicitarPedido = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldNumPedidoCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonAtualizarListaPedidos = new javax.swing.JButton();
        jButtonFinalizaPedido = new javax.swing.JButton();
        jTextFieldValorAcumulado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldidClienteTabCliente = new javax.swing.JTextField();
        jLabelPapelDeParede = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Pedido Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(796, 449));
        setMinimumSize(new java.awt.Dimension(796, 449));
        setPreferredSize(new java.awt.Dimension(796, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeCliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldNomeCliente.setToolTipText("Nome do Cliente");
        jTextFieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeClienteActionPerformed(evt);
            }
        });
        jTextFieldNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeClienteKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 42, 110, 30));

        jTableClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTableClientes.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ));
        jTableClientes.setToolTipText("Tabela de clientes cadastrados");
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jTableClientes.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTableClientesInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 340, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconPesquisa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, 39));

        jTableProdutos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTableProdutos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço"
            }
        ));
        jTableProdutos.setToolTipText("Tabela de produtos cadastrados");
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProdutos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 370, 70));

        jTextFieldNomeProduto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldNomeProduto.setToolTipText("Nome do produto");
        jTextFieldNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeProdutoKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Produto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jTextFieldidProdutoTabProduto.setEditable(false);
        jTextFieldidProdutoTabProduto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldidProdutoTabProduto.setToolTipText("ID do produto");
        getContentPane().add(jTextFieldidProdutoTabProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 100, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconPesquisa.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*ID do produto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/216178_add_document_icon.png"))); // NOI18N
        jButton1.setToolTipText("Adicionar Produto");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 70, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("*Quantidade");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jTextFieldQntProduto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldQntProduto.setText("1");
        jTextFieldQntProduto.setToolTipText("Quantidade de produto");
        jTextFieldQntProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQntProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQntProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 40, -1));

        jTablePedidos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jTablePedidos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID do Pedido", "Solicitante"
            }
        ));
        jTablePedidos.setToolTipText("Tabela de pedidos solicitados");
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jTablePedidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTablePedidosKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePedidos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 200, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total à pagar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 20));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldTotal.setText("0");
        jTextFieldTotal.setToolTipText("Total à pagar");
        getContentPane().add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jTextFieldNomeProdutoTabProduto.setEditable(false);
        jTextFieldNomeProdutoTabProduto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldNomeProdutoTabProduto.setToolTipText("Nome do produto");
        getContentPane().add(jTextFieldNomeProdutoTabProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Preço");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jTextFieldPrecoProdTabProduto.setEditable(false);
        jTextFieldPrecoProdTabProduto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldPrecoProdTabProduto.setToolTipText("Preço do produto");
        jTextFieldPrecoProdTabProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoProdTabProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPrecoProdTabProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 70, -1));

        jButtonSolicitarPedido.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSolicitarPedido.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonSolicitarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSolicitarPedido.setText("Solicitar Pedido");
        jButtonSolicitarPedido.setToolTipText("Solicitar Pedido");
        jButtonSolicitarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitarPedidoActionPerformed(evt);
            }
        });
        jButtonSolicitarPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSolicitarPedidoKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonSolicitarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldNumPedidoCliente.setEditable(false);
        jTextFieldNumPedidoCliente.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextFieldNumPedidoCliente.setToolTipText("ID do pedido");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("*N°");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNumPedidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNumPedidoCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 60));

        jButtonAtualizarListaPedidos.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAtualizarListaPedidos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonAtualizarListaPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtualizarListaPedidos.setText("Atualizar");
        jButtonAtualizarListaPedidos.setToolTipText("Atualizar pedido solicitado");
        jButtonAtualizarListaPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarListaPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarListaPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 100, 30));

        jButtonFinalizaPedido.setBackground(new java.awt.Color(204, 204, 204));
        jButtonFinalizaPedido.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonFinalizaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/1291768_delivery_fast_quick_truck_logistics_icon.png"))); // NOI18N
        jButtonFinalizaPedido.setToolTipText("Finalizar Pedido");
        jButtonFinalizaPedido.setEnabled(false);
        jButtonFinalizaPedido.setMaximumSize(new java.awt.Dimension(80, 80));
        jButtonFinalizaPedido.setMinimumSize(new java.awt.Dimension(80, 80));
        jButtonFinalizaPedido.setPreferredSize(new java.awt.Dimension(80, 80));
        jButtonFinalizaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizaPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFinalizaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, 60));

        jTextFieldValorAcumulado.setEditable(false);
        jTextFieldValorAcumulado.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldValorAcumulado.setText("0");
        jTextFieldValorAcumulado.setToolTipText("Preço acumulado");
        jTextFieldValorAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorAcumuladoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 80, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cliente");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preço Acumulado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextFieldidClienteTabCliente.setEditable(false);
        jTextFieldidClienteTabCliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextFieldidClienteTabCliente.setToolTipText("ID do cliente cadastrado");
        jTextFieldidClienteTabCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldidClienteTabClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldidClienteTabCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 60, -1));

        jLabelPapelDeParede.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPapelDeParede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/cakes-g36fe2d6fe_1280 (1).jpg"))); // NOI18N
        getContentPane().add(jLabelPapelDeParede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 410));

        getAccessibleContext().setAccessibleDescription("");

        setBounds(0, 0, 796, 439);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         controller.salvaProdPedidosNaTab();
         controller.precoTotal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteKeyReleased
        try {
            controller.mostraCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldNomeClienteKeyReleased

    private void jTextFieldidClienteTabClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldidClienteTabClienteActionPerformed
       
    }//GEN-LAST:event_jTextFieldidClienteTabClienteActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        controller.setarCamposTabelaClientes();
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTextFieldNomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyReleased
        try {
            controller.mostraProduto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyReleased

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        controller.setarCamposTabelaProduto();
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void jButtonSolicitarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitarPedidoActionPerformed
        controller.solicitaPedido();
        try {
            controller.mostraPedidoNaTabela();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jButtonSolicitarPedidoActionPerformed

    private void jTableClientesInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTableClientesInputMethodTextChanged
        
    }//GEN-LAST:event_jTableClientesInputMethodTextChanged

    private void jTablePedidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePedidosKeyPressed
        
    }//GEN-LAST:event_jTablePedidosKeyPressed

    private void jButtonSolicitarPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSolicitarPedidoKeyPressed
        
    }//GEN-LAST:event_jButtonSolicitarPedidoKeyPressed

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        controller.setarCampoDaTabelaPedido();
    }//GEN-LAST:event_jTablePedidosMouseClicked

    private void jButtonAtualizarListaPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarListaPedidosActionPerformed
        try {
            controller.mostraPedidoNaTabela();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAtualizarListaPedidosActionPerformed

    private void jButtonFinalizaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizaPedidoActionPerformed
        try {
            //controller.salvaPedidoFinal();
            controller.imprimeRelatorio();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonFinalizaPedidoActionPerformed

    private void jTextFieldQntProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQntProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQntProdutoActionPerformed

    private void jTextFieldPrecoProdTabProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoProdTabProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoProdTabProdutoActionPerformed

    private void jTextFieldValorAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorAcumuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorAcumuladoActionPerformed

    private void jTextFieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAtualizarListaPedidos;
    private javax.swing.JButton jButtonFinalizaPedido;
    private javax.swing.JButton jButtonSolicitarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPapelDeParede;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldNomeProdutoTabProduto;
    private javax.swing.JTextField jTextFieldNumPedidoCliente;
    private javax.swing.JTextField jTextFieldPrecoProdTabProduto;
    private javax.swing.JTextField jTextFieldQntProduto;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldValorAcumulado;
    private javax.swing.JTextField jTextFieldidClienteTabCliente;
    private javax.swing.JTextField jTextFieldidProdutoTabProduto;
    // End of variables declaration//GEN-END:variables
}