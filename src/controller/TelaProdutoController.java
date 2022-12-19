/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoBanco;
import dao.ProdutoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import net.proteanit.sql.DbUtils;
import view.TelaPedidoCliente;
import view.TelaProduto;

/**
 *
 * @author jjsco
 */
public class TelaProdutoController {
    
    private TelaProduto view; 
    
    
    /*Construtor*/
    public TelaProdutoController(TelaProduto view) {
        this.view = view;
    }
    
    public void mostraProduto() throws SQLException {
        
        //Buscar um nome da view
        String nome = view.getjTextFieldNomeProduto().getText();
       
        Produto produto = new Produto(nome);
        
        //Verificar se o nome existe no banco de dados
        Connection conexao = new ConexaoBanco().getConnection();
        ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
        
        ResultSet resultadoProdutoNoBancoDeDados = (ResultSet) produtoDAO.pesquisaProduto(produto);
        
        view.getjTableProdutos().setModel(DbUtils.resultSetToTableModel(resultadoProdutoNoBancoDeDados));

    }
    
    public void setarCamposTabelaProduto() {
       
        int setar= view.getjTableProdutos().getSelectedRow();
         
        view.getjTextFieldNomeProduto().setText(view.getjTableProdutos().getModel().getValueAt(setar, 2).toString());
        view.getjTextFieldidProduto().setText(view.getjTableProdutos().getModel().getValueAt(setar, 0).toString());
        view.getjTextFieldPrecoProduto().setText(view.getjTableProdutos().getModel().getValueAt(setar, 1).toString());
        view.getjButtonCadastrarProd().setEnabled(false);
    
    }
    
    public void salvaProduto() {
        
        if(view.getjTextFieldNomeProduto().getText().isEmpty() ||
           view.getjTextFieldPrecoProduto().getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {

            String nome = view.getjTextFieldNomeProduto().getText();
            String preco = (view.getjTextFieldPrecoProduto().getText());
            float formatPreco = Float.parseFloat(preco);

            Produto produto = new Produto(formatPreco, nome);

            Connection conexao;
            try {
                conexao = new ConexaoBanco().getConnection();
                ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

                produtoDAO.insertProduto(produto);

                JOptionPane.showMessageDialog(null, "Produto inserido no sistema com sucesso!");
                limparCampos();

            } catch (SQLException ex) {
                Logger.getLogger(TelaPedidoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
    public void alteraDadosProduto() {
        
         if(view.getjTextFieldNomeProduto().getText().isEmpty() ||
           view.getjTextFieldPrecoProduto().getText().isEmpty() || 
           view.getjTextFieldidProduto().getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {
        
            int id = Integer.parseInt( view.getjTextFieldidProduto().getText());
            String nome = view.getjTextFieldNomeProduto().getText();
            String preco = (view.getjTextFieldPrecoProduto().getText());

            float formatPreco = Float.parseFloat(preco);

            Produto produto = new Produto(id, formatPreco, nome);

            Connection conexao;
            try {
                conexao = new ConexaoBanco().getConnection();
                ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

                produtoDAO.updateProduto(produto);

                JOptionPane.showMessageDialog(null, "Atualização feita com sucesso!");
                limparCampos();
                
                view.getjButtonCadastrarProd().setEnabled(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void deletaDadosProduto() {
        
         if(view.getjTextFieldNomeProduto().getText().isEmpty() ||
           view.getjTextFieldPrecoProduto().getText().isEmpty() || 
           view.getjTextFieldidProduto().getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {
        
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto?", "Alerta", JOptionPane.YES_NO_OPTION);

            if(confirma == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt( view.getjTextFieldidProduto().getText());
                String nome = view.getjTextFieldNomeProduto().getText();
                float preco = Float.parseFloat(view.getjTextFieldPrecoProduto().getText());

                Produto produto = new Produto(id, preco, nome);

                Connection conexao;
                try {
                    conexao = new ConexaoBanco().getConnection();
                    ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

                    produtoDAO.deleteProduto(produto);

                    JOptionPane.showMessageDialog(null, "O produto foi deletado!");

                    limparCampos();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
         }
    }
    
    
    public void limparCampos() {
            view.getjTextFieldidProduto().setText(null);
            view.getjTextFieldNomeProduto().setText(null);
            view.getjTextFieldPrecoProduto().setText(null);
            ((DefaultTableModel)view.getjTableProdutos().getModel()).setRowCount(0);
    }
}
