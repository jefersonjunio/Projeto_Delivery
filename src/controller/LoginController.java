/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import dao.ConexaoBanco;
import dao.UsuarioDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author jjsco
 */
public class LoginController {
    
    private Login view;
    
    /*Construtor*/
    public LoginController(Login view) {
        this.view = view;
    }
 
    /*Metodos*/
    
    /*
    * Funcao que autentica o login e senha do usuario
    * 
    */
    public void autenticarUsuario() throws SQLException {
        
        //Buscar um usuario da view
        String login = view.getjTextFieldLogin().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        //Instancia um novo Usuario
        Usuario usuarioAutenticar = new Usuario(login, senha);
        
        //Faz a conexao com o banco de dados
        Connection conexao = new ConexaoBanco().getConnection();
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
        
        //Retorna o nome do cargo do Usuario caso exista no banco de dados
        String cargo = usuarioDAO.existeUsuarioESenhaNoBanco(usuarioAutenticar);
             
        //Se existir direciona para o menu
        if("Administrador".equals(cargo)) {
            
            MenuPrincipal entrarMenu = new MenuPrincipal();
            entrarMenu.setVisible(true);
            MenuPrincipal.MenuBarAdm.setEnabled(true);
            conexao.close();
            
        } else if("Atendente".equals(cargo)) {
            
            MenuPrincipal entrarMenu = new MenuPrincipal();
            entrarMenu.setVisible(true);
            conexao.close();
        } else {
            JOptionPane.showMessageDialog(null,"Usuario e/ou Senha nao existe! ");
        }
        
    }
    
    
}
