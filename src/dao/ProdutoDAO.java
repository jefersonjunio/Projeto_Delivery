/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Produto;

/**
 *
 * @author jjsco
 */
public class ProdutoDAO {
    
    private final Connection connection;
    
    
    /*Construtor - so pode criar um usuario passando uma conexao com o banco*/
    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public ResultSet pesquisaProduto(Produto produto) throws SQLException {
        String sql = "select idProduto as ID, precoDoProduto as Preço, nomeDoProduto as Nome from produto where nomeDoProduto like ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passsando o conteudo da caixa de pesquisa para o ?
        statement.setString(1, produto.getNome() + "%");
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet;
       
    }
     
    public void insertProduto(Produto produto) throws SQLException {
        String sql = "insert into produto (precoDoProduto, nomeDoProduto) values (?,?)";
                
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passsando o conteudo da caixa de pesquisa para o ?
        statement.setDouble(1, produto.getPreco());
        statement.setString(2, produto.getNome());
        
        statement.execute();
         
       
    }
    
    public void updateProduto (Produto produto) throws SQLException {
        
         String sql = "update produto set precoDoProduto = ?, nomeDoProduto = ? where idProduto = ?";
                     
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setDouble(1, produto.getPreco());
         statement.setString(2, produto.getNome());
         statement.setInt(3, produto.getId());
         
         statement.execute();
        
    }
    
    public void deleteProduto(Produto produto) throws SQLException {
       
         String sql = "delete from produto where idProduto = ?";
         PreparedStatement statement = connection.prepareStatement(sql);
         
         statement.setInt(1, produto.getId());
         statement.execute();
    
    }
}
