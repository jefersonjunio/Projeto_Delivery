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


/**
 *
 * @author jjsco
 */
public class ClienteDAO {
    
   private final Connection connection; 
   
   /*Construtor*/
   public ClienteDAO(Connection connection) {
        this.connection = connection;
    }
   
   /*Metodos*/
   
   
    /*
    * Funcao que insere dados do cliente no banco de dados
    * @param cliente Cliente
    */
   public void insertCliente(Cliente cliente) throws SQLException {
            
            String sql = "insert into cliente (nomeCliente, cpfCliente, ruaEndCliente, bairroEndCliente, numeroEndCliente, telefoneCliente, celularCliente, referenciaEndCliente)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?)";
                    
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getRua());
            statement.setString(4, cliente.getBairro());
            statement.setInt(5, cliente.getNumero());
            statement.setString(6, cliente.getTelefone());
            statement.setString(7, cliente.getCelular());
            statement.setString(8, cliente.getReferencia());
            statement.execute();
           
   }
   
   /*
    * Funcao que atualiza os dados do cliente no banco de dados
    * @param cliente Cliente
   */
   public void updateCliente (Cliente cliente) throws SQLException {
        
         String sql = "update cliente set nomeCliente = ?, cpfCliente = ?, ruaEndCliente = ?, bairroEndCliente = ?,"
                 + "numeroEndCliente = ?, telefoneCliente = ?, celularCliente = ?, referenciaEndCliente = ?"
                 + " where idCliente = ?";
                     
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1, cliente.getNome());
         statement.setString(2, cliente.getCpf());
         statement.setString(3, cliente.getRua());
         statement.setString(4, cliente.getBairro());
         statement.setString(5, Integer.toString(cliente.getNumero()));
         statement.setString(6, cliente.getTelefone());
         statement.setString(7, cliente.getCelular());
         statement.setString(8, cliente.getReferencia());
         statement.setString(9, Integer.toString(cliente.getId()));
         
         statement.execute();
        
   }
   
   /*
    * Funcao que deleta dados do cliente no banco de dados
    * @param cliente Cliente
   */
   public void deleteCliente(Cliente cliente) throws SQLException {
       
         String sql = "delete from cliente where idCliente = ?";
         PreparedStatement statement = connection.prepareStatement(sql);
         
         statement.setInt(1, cliente.getId());
         statement.execute();
    
   }
    
   /*
    * Funcao que pesquisa dados do cliente no banco de dados
    * @param cliente Cliente
    * @return ResultSet com o resultado da consulta feita no BD
    */ 
   public ResultSet pesquisaCliente(Cliente cliente) throws SQLException {
        String sql = "select idCliente as ID, nomeCliente as Nome, cpfCliente as CPF, ruaEndCliente as Rua"
                + ", bairroEndCliente as Bairro, numeroEndCliente as Numero, telefoneCliente as Tel,"
                + "celularCliente as Cel, referenciaEndCliente as Ref from cliente where nomeCliente like ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passsando o conteudo da caixa de pesquisa para o ?
        statement.setString(1, cliente.getNome() + "%");
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet;
       
   }
      
}
