/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoBanco;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaUsuario;

/**
 *
 * @author jjsco
 */
public class TelaUsuarioController {
    
    private TelaUsuario view; 
    
    
    /*Construtor*/
    public TelaUsuarioController(TelaUsuario view) {
        this.view = view;
    }
    
    public void salvaUsuario() {
        
        if(view.getjTextFieldNome().getText().isEmpty() ||
           view.getjTextFieldLogin().getText().isEmpty() ||
           view.getjPasswordFieldSenha().getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {
        
            String nome = view.getjTextFieldNome().getText();
            String login = view.getjTextFieldLogin().getText();
            String senha = view.getjPasswordFieldSenha().getText();
            String cargo = (String) view.getjComboBoxCargo().getSelectedItem();

            Usuario usuario = new Usuario(nome, login, senha, cargo);

            Connection conexao;
            try {
                conexao = new ConexaoBanco().getConnection();
                UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);

                usuarioDAO.insertUser(usuario);

                JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
                
                limparCampos();
            } catch (SQLException ex) {
                Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }
    
    public void mostraUsuario() throws SQLException {
        
        if(view.getjTextFieldNome().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome!");
        } else {
        
            //Buscar um nome da view
            String nome = view.getjTextFieldNome().getText();

            Usuario usuario = new Usuario(nome);

            //Verificar se o nome existe no banco de dados
            Connection conexao = new ConexaoBanco().getConnection();
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);

            Usuario existeUsuarioNoBancoDeDados = usuarioDAO.readUser(usuario);

            //Se existir 
            if(existeUsuarioNoBancoDeDados != null) {
                view.getjTextFieldId().setText(Integer.toString(existeUsuarioNoBancoDeDados.getId()));
                view.getjTextFieldLogin().setText(existeUsuarioNoBancoDeDados.getLogin());
                view.getjPasswordFieldSenha().setText(existeUsuarioNoBancoDeDados.getSenha());
                view.getjComboBoxCargo().setSelectedItem(existeUsuarioNoBancoDeDados.getCargo());

                view.getBtnCadastrarUsu().setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null,"Usuario e/ou nao existe! ");
            }
        
        }
    }
    
    public void alteraDadosUsuario() {
       
        if(view.getjTextFieldNome().getText().isEmpty() ||
           view.getjTextFieldLogin().getText().isEmpty() ||
           view.getjPasswordFieldSenha().getText().isEmpty() ||
           view.getjTextFieldId().getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {
        
            int id = Integer.parseInt( view.getjTextFieldId().getText());
            String nome = view.getjTextFieldNome().getText();
            String login = view.getjTextFieldLogin().getText();
            String senha = view.getjPasswordFieldSenha().getText();
            String cargo = (String) view.getjComboBoxCargo().getSelectedItem();

            Usuario usuario = new Usuario(id ,nome, login, senha, cargo);

            Connection conexao;
            try {
                conexao = new ConexaoBanco().getConnection();
                UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);

                usuarioDAO.updateUser(usuario);

                JOptionPane.showMessageDialog(null, "Atualização feita com sucesso!");
                limparCampos();
                view.getBtnCadastrarUsu().setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
    
    public void deletaDadosUsuario() {
        
        if(view.getjTextFieldNome().getText().isEmpty() ||
           view.getjTextFieldLogin().getText().isEmpty() ||
           view.getjPasswordFieldSenha().getText().isEmpty() ||
           view.getjTextFieldId().getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {
        
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o usuario?", "Alerta", JOptionPane.YES_NO_OPTION);

            if(confirma == JOptionPane.YES_OPTION) {
                    String nome = view.getjTextFieldNome().getText();
                    String login = view.getjTextFieldLogin().getText();
                    String senha = view.getjPasswordFieldSenha().getText();
                    String cargo = (String) view.getjComboBoxCargo().getSelectedItem();

                    Usuario usuario = new Usuario(nome, login, senha, cargo);

                    Connection conexao;
                    try {
                        conexao = new ConexaoBanco().getConnection();
                        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);

                        usuarioDAO.deleteUser(usuario);

                        JOptionPane.showMessageDialog(null, "Usuario foi deletado!");
                        limparCampos();
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
        }
    }
    
    public void limparCampos() {
        view.getjTextFieldId().setText(null);
        view.getjTextFieldNome().setText(null);
        view.getjTextFieldLogin().setText(null);
        view.getjPasswordFieldSenha().setText(null);
    }

}
