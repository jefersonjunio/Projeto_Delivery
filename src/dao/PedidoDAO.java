/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;
import model.Pedido;

/**
 *
 * @author jjsco
 */
public class PedidoDAO {
    
    private final Connection connection;
    
    
    /*Construtor - so pode criar um pedido passando uma conexao com o banco*/
    public PedidoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public ResultSet pesquisaCliente(Cliente cliente) throws SQLException {
        String sql = "select idCliente as ID, nomeCliente as Nome, cpfCliente as CPF from cliente where nomeCliente like ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passsando o conteudo da caixa de pesquisa para o ?
        statement.setString(1, cliente.getNome() + "%");
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet;
       
    }
    
    public void insertPedido(Pedido pedido) throws SQLException {
        String sql = "insert into pedido (Cliente_idCliente) values (?)";
                
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passsando o conteudo da caixa de pesquisa para o ?
        statement.setInt(1, pedido.getChaveEstrangeiraCliente());
        statement.execute();
         
       
    }
    
    public ResultSet pesquisaIdPedido(Pedido pedido) throws SQLException {
        
        String sql = "select idPedidos as ID from pedido where idPedidos = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passsando o conteudo da caixa de pesquisa para o ?
        statement.setInt(1, pedido.getChaveEstrangeiraCliente());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet;
       
    }
    
    public ResultSet pesquisaPedido() throws SQLException {
        String sql = "select PED.idPedidos as ID_Pedido, CLI.nomeCliente as Nome from pedido as PED "
                + "inner join cliente as CLI on (CLI.idCliente = PED.Cliente_idCliente) order by PED.idPedidos desc;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet;
       
    }
    
}
