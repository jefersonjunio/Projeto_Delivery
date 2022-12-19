/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author jjsco
 */
public class UsuarioDAO {
    
    private final Connection connection;
    
    
    /*Construtor - so pode criar um usuario passando uma conexao com o banco*/
    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    /*Metodos*/
    
    /*
    * Funcao que insere dados do Usuario no banco de dados
    * @param usuario Usuario 
    */
    public void insertUser(Usuario usuario) throws SQLException {
            
            String sql = "insert into usuario (loginUsuario, senhaUsuario, nomeUsuario, cargoUsuario) "
                    + "values (?, ?, ?, ?) ";
                    
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            statement.setString(3, usuario.getNome());
            statement.setString(4, usuario.getCargo());
            statement.execute();
           
    }
    
    /*
    * Funcao que atualiza dados do Usuario no banco de dados
    * @param usuario Usuario 
    */
    public void updateUser (Usuario usuario) throws SQLException {
        
         String sql = "update usuario set loginUsuario = ?, senhaUsuario = ?, nomeUsuario = ?, cargoUsuario = ?"
                 + " where idUsuario = ?";
                     
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1, usuario.getLogin());
         statement.setString(2, usuario.getSenha());
         statement.setString(3, usuario.getNome());
         statement.setString(4, usuario.getCargo());
         statement.setString(5, Integer.toString(usuario.getId()));
         
         statement.execute();
        
    }
    
    /*
    * Funcao que deleta dados do Usuario no banco de dados
    * @param usuario Usuario 
    */
    public void deleteUser(Usuario usuario) throws SQLException {
       
         String sql = "delete from usuario where loginUsuario = ?";
         PreparedStatement statement = connection.prepareStatement(sql);
         
         statement.setString(1, usuario.getLogin());
         statement.execute();
    
    }
    
    /*
    * Funcao que mostra os dados do Usuario no banco de dados
    * @param usuario Usuario 
    */
    public Usuario readUser(Usuario usuario) throws SQLException{
        String sql = "select * from usuario where nomeUsuario = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuario.getNome());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        if(resultSet.next()) {
            int id = resultSet.getInt("idUsuario");
            String nome = resultSet.getString("nomeUsuario");
            String login = resultSet.getString("loginUsuario"); 
            String senha = resultSet.getString("senhaUsuario");
            String cargo = resultSet.getString("cargoUsuario");
            
            Usuario usuarioComDadosDoBanco = new Usuario(id, nome, login, senha, cargo);
            
            return usuarioComDadosDoBanco;
            
        } else {
            return null;
        }
    }
    
     /*
    * Funcao que verifica se existe um Usuario no banco de dados 
    * @param usuarioAutenticar Usuario 
    * @return String com o nome do cargo do Usuario  
    */
    public String existeUsuarioESenhaNoBanco(Usuario usuarioAutenticar) throws SQLException {
        String sql = "select * from usuario where loginUsuario = ? and ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuarioAutenticar.getLogin());
        statement.setString(2, usuarioAutenticar.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        String cargo;
        
        if(resultSet.next()) {
                cargo = resultSet.getString(5);
                return cargo;
            
        } else {
            System.out.println("Usuario nao existe");
        }
        return null;
            
    }
      
}
