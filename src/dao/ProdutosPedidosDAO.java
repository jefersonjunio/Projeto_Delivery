/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Pedido;
import model.ProdutosPedidos;

/**
 *
 * @author jjsco
 */
public class ProdutosPedidosDAO {
    
    private final Connection connection;
    
    
    /*Construtor - so pode criar um usuario passando uma conexao com o banco*/
    public ProdutosPedidosDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insertPedidoNaTabelaProdPedidos(ProdutosPedidos produto) throws SQLException {
        String sql = "insert into produtospedidos (itemPedido, quantidade, preco, Produto_idProduto, Pedido_idPedidos, Pedido_Cliente_idCliente) "
                + "values (?,?,?,?,?,?)";
                
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passsando o conteudo da caixa de pesquisa para o ?
        statement.setString(1, produto.getItemPedido());
        statement.setInt(2, produto.getQuantidade());
        statement.setDouble(3, produto.getPreco() * produto.getQuantidade());
        statement.setInt(4, produto.getIdProduto());
        statement.setInt(5, produto.getIdPedidos());
        statement.setInt(6, produto.getIdCliente());
        statement.execute();
         
    }
    
    public void insertPedidoFinalNaTabelaProdPedidos(ProdutosPedidos produto) throws SQLException {
        String sql = "insert into produtospedidos (precoTotal, Produto_idProduto, Pedido_idPedidos, Pedido_Cliente_idCliente) "
                + "values (?,?,?,?)";
                
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passsando o conteudo da caixa de pesquisa para o ?
        
        statement.setDouble(1, produto.getPrecoTotal());
        statement.setInt(2, produto.getIdProduto());
        statement.setInt(3, produto.getIdPedidos());
        statement.setInt(4, produto.getIdCliente());
        statement.execute();
         
    }

    
}
