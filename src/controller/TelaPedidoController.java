/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoBanco;
import dao.PedidoDAO;
import dao.ProdutoDAO;
import dao.ProdutosPedidosDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Pedido;
import model.Produto;
import model.ProdutosPedidos;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import view.TelaPedidoCliente;


/**
 *
 * @author jjsco
 */
public class TelaPedidoController {
    
    private TelaPedidoCliente view; 
    
    
    /*Construtor*/
    public TelaPedidoController(TelaPedidoCliente view) {
        this.view = view;
    }
    
   
    public void mostraCliente() throws SQLException {
        
        //Buscar um nome da view
        String nome = view.getjTextFieldNomeCliente().getText();
       
        Cliente cliente = new Cliente(nome);
        
        //Verificar se o nome existe no banco de dados
        Connection conexao = new ConexaoBanco().getConnection();
        PedidoDAO pedidoDAO = new PedidoDAO(conexao);
        
        ResultSet resultadoClienteNoBancoDeDados = (ResultSet) pedidoDAO.pesquisaCliente(cliente);
        
        view.getjTableClientes().setModel(DbUtils.resultSetToTableModel(resultadoClienteNoBancoDeDados));
        

    }
    
    public void mostraIdPedidoSolicitado() throws SQLException {
        
        //Buscar um id da view
        int id = Integer.parseInt(view.getjButtonSolicitarPedido().getText());
       
        Pedido pedido = new Pedido(id);
        
        //Verificar se o id existe no banco de dados
        Connection conexao = new ConexaoBanco().getConnection();
        PedidoDAO pedidoDAO = new PedidoDAO(conexao);
        
        Pedido resultadoIdPedidoBanco = (Pedido) pedidoDAO.pesquisaIdPedido(pedido);
        
        view.getjTextFieldNumPedidoCliente().setText(Integer.toString(resultadoIdPedidoBanco.getChaveEstrangeiraCliente()));
       
    }
    
    public void setarCamposTabelaClientes() {
        int setar = view.getjTableClientes().getSelectedRow();
        view.getjTextFieldidClienteTabCliente().setText(view.getjTableClientes().getModel().getValueAt(setar, 0).toString());   
     
    }
    
    public void mostraPedidoNaTabela() throws SQLException {
        
        //Verificar se o nome existe no banco de dados
        Connection conexao = new ConexaoBanco().getConnection();
        PedidoDAO pedidoDAO = new PedidoDAO(conexao);
        
        ResultSet resultadoProdutoNoBancoDeDados = (ResultSet) pedidoDAO.pesquisaPedido();
        
        view.getjTablePedidos().setModel(DbUtils.resultSetToTableModel(resultadoProdutoNoBancoDeDados));

    }
    
    public void mostraProduto() throws SQLException {
        
        //Buscar um nome da view
        String nome = view.getjTextFieldNomeProduto().getText();
       
        Produto produto = new Produto(nome);
        
        //Verificar se o nome existe no banco de dados
        Connection conexao = new ConexaoBanco().getConnection();
        ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
        
        ResultSet resultadoClienteNoBancoDeDados = (ResultSet) produtoDAO.pesquisaProduto(produto);
        
        view.getjTableProdutos().setModel(DbUtils.resultSetToTableModel(resultadoClienteNoBancoDeDados));

    }
    
    public void setarCamposTabelaProduto() {
       
        int setar= view.getjTableProdutos().getSelectedRow();
                
        view.getjTextFieldidProdutoTabProduto().setText(view.getjTableProdutos().getModel().getValueAt(setar, 0).toString());
        view.getjTextFieldPrecoProdTabPedidos().setText(view.getjTableProdutos().getModel().getValueAt(setar, 1).toString());
        view.getjTextFieldNomeProdutoTabPedidos().setText(view.getjTableProdutos().getModel().getValueAt(setar, 2).toString());
    }
    
    public void solicitaPedido() {
        
        if (view.getjTextFieldidClienteTabCliente().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo id do cliente!");
        
        } else {
        
            int idCliente = Integer.parseInt(view.getjTextFieldidClienteTabCliente().getText());

            Pedido pedido = new Pedido( idCliente);

            Connection conexao;
            try {
                conexao = new ConexaoBanco().getConnection();
                PedidoDAO pedidoDAO = new PedidoDAO(conexao);

                pedidoDAO.insertPedido(pedido);

                JOptionPane.showMessageDialog(null, "Solicitacao do pedido feita com sucesso!");

            } catch (SQLException ex) {
                Logger.getLogger(TelaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
    
    public void salvaProdPedidosNaTab() {
        if(view.getjTextFieldidProdutoTabProduto().getText().isEmpty() || 
           view.getjTextFieldNumPedidoCliente().getText().isEmpty() ||
           view.getjTextFieldidClienteTabCliente().getText().isEmpty() ||
           view.getjTextFieldQntProdutoTabPedidos().getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        
        } else {
            int idCliente = Integer.parseInt( view.getjTextFieldidClienteTabCliente().getText());
            String itemPedido = view.getjTextFieldNomeProdutoTabPedidos().getText();
            int quantidade = Integer.parseInt(view.getjTextFieldQntProdutoTabPedidos().getText());
            String preco = (String) view.getjTextFieldPrecoProdTabPedidos().getText();
            int idProduto = Integer.parseInt(view.getjTextFieldidProdutoTabProduto().getText());
            int idPedido = Integer.parseInt(view.getjTextFieldNumPedidoCliente().getText());
            float alteradoPreco = Float.parseFloat(preco);
            
            ProdutosPedidos produtosPed = new ProdutosPedidos(idPedido, itemPedido, quantidade, alteradoPreco, idProduto, idPedido, idCliente);
        
            Connection conexao;
            try {
                conexao = new ConexaoBanco().getConnection();
                ProdutosPedidosDAO prodPedidosDAO = new ProdutosPedidosDAO(conexao);

                prodPedidosDAO.insertPedidoNaTabelaProdPedidos(produtosPed);

                JOptionPane.showMessageDialog(null, "Item adicionado no pedido!");

                view.getjButtonFinalizaPedido().setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(TelaClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }    
    }
    
    public void salvaPedidoFinal() {
        int idCliente = Integer.parseInt( view.getjTextFieldidClienteTabCliente().getText());
        String precoFinal = (String) view.getjTextFieldTotal().getText();
        int idProduto = Integer.parseInt(view.getjTextFieldidProdutoTabProduto().getText());
        int idPedido = Integer.parseInt(view.getjTextFieldNumPedidoCliente().getText());
        
        float alteradoPreco = Float.parseFloat(precoFinal);
        
        ProdutosPedidos produtosPed = new ProdutosPedidos(alteradoPreco, idProduto, idPedido, idCliente);
        
        Connection conexao;
        try {
            conexao = new ConexaoBanco().getConnection();
            ProdutosPedidosDAO prodPedidosDAO = new ProdutosPedidosDAO(conexao);
            
            prodPedidosDAO.insertPedidoFinalNaTabelaProdPedidos(produtosPed);
            
            JOptionPane.showMessageDialog(null, "Pedido finalizado!");
        } catch (SQLException ex) {
            Logger.getLogger(TelaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void precoTotal() {
        
        float total = 0;
        float valorAcumulado = 0;
        int quantidade;
        float preco = 0;
        String converteTotal;
        
        valorAcumulado = Float.parseFloat(view.getjTextFieldValorAcumulado().getText());
        quantidade =  Integer.parseInt(view.getjTextFieldQntProdutoTabPedidos().getText());
        preco = Float.parseFloat(view.getjTextFieldPrecoProdTabPedidos().getText());
        
        total = (quantidade * preco) + valorAcumulado;
        
        DecimalFormat df = new DecimalFormat("###.00");
        
        //converteTotal = Float.toString(total);
        
        view.getjTextFieldTotal().setText(df.format(total).replace(",", "."));
        view.getjTextFieldValorAcumulado().setText(df.format(total).replace(",", "."));
    }
    
    public void setarCampoDaTabelaPedido() {
        int setar = view.getjTablePedidos().getSelectedRow();
  
        view.getjTextFieldNumPedidoCliente().setText(view.getjTablePedidos().getModel().getValueAt(setar, 0).toString());   
    }
  
    public void imprimeRelatorio() throws SQLException {
        Connection conexao = new ConexaoBanco().getConnection();
        
        HashMap filtro = new HashMap();
        filtro.put("idPedido", Integer.parseInt(view.getjTextFieldNumPedidoCliente().getText()));
        try {
            JasperPrint print = JasperFillManager.fillReport( getClass().getResourceAsStream("/relatorio/Blank_A4.jasper"), filtro, conexao);
            JasperViewer.viewReport(print, false);
            
            limparCampos();
        } catch (JRException ex) {
            Logger.getLogger(TelaPedidoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void limparCampos() {
            view.getjTextFieldNomeCliente().setText(null);
            view.getjTextFieldNomeProduto().setText(null);
            view.getjTextFieldTotal().setText("0");
            view.getjTextFieldValorAcumulado().setText("0");
            view.getjTextFieldQntProdutoTabPedidos().setText("1");
            view.getjTextFieldPrecoProdTabPedidos().setText("0");
            view.getjTextFieldNomeProdutoTabPedidos().setText(null);
            view.getjTextFieldNumPedidoCliente().setText(null);
            view.getjTextFieldidClienteTabCliente().setText(null);
            view.getjTextFieldidProdutoTabProduto().setText(null);
            
            ((DefaultTableModel)view.getjTableProdutos().getModel()).setRowCount(0);
            ((DefaultTableModel)view.getjTablePedidos().getModel()).setRowCount(0);
            ((DefaultTableModel)view.getjTableClientes().getModel()).setRowCount(0); 
    }
    
}
