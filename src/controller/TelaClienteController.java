/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDAO;
import dao.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import net.proteanit.sql.DbUtils;

import view.TelaCliente;


/**
 *
 * @author jjsco
 */
public class TelaClienteController {
    private TelaCliente view; 
    
    /*Construtor*/
    public TelaClienteController(TelaCliente view){
        this.view = view;
    }
    
    /*
    * Funcao que salva os dados do cliente no banco de dados
    * @param cliente Cliente
    */
    public void salvaCliente() {
        
        if(view.getjTextFieldNomeCliente().getText().isEmpty() ||
           view.getjTextFieldCpfCliente().getText().isEmpty() || 
           view.getjTextFieldRuaCliente().getText().isEmpty() ||
           view.getjTextFieldBairroCliente().getText().isEmpty() ||  
           view.getjTextFieldNumCliente().getText().isEmpty()) {
           
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {
        
            String nome = view.getjTextFieldNomeCliente().getText();
            String cpf = view.getjTextFieldCpfCliente().getText();
            String rua = view.getjTextFieldRuaCliente().getText();
            String bairro = view.getjTextFieldBairroCliente().getText();
            int numero = Integer.parseInt(view.getjTextFieldNumCliente().getText());
            String telefone = view.getjTextFieldTelCliente().getText();
            String celular = view.getjTextFieldCelCliente().getText();
            String referencia = view.getjTextFieldReferenciaCliente().getText();

            Cliente cliente = new Cliente(nome, cpf, rua, bairro, numero, telefone, celular, referencia);

            Connection conexao;
            try {
                conexao = new ConexaoBanco().getConnection();
                ClienteDAO clienteDAO = new ClienteDAO(conexao);

                clienteDAO.insertCliente(cliente);

                JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");

                limparCampos();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void mostraCliente() throws SQLException {
        
        //Buscar um nome da view
        String nome = view.getjTextFieldPesquisar().getText();
       
        Cliente cliente = new Cliente(nome);
        
        //Verificar se o nome existe no banco de dados
        Connection conexao = new ConexaoBanco().getConnection();
        ClienteDAO clienteDAO = new ClienteDAO(conexao);
        
        ResultSet resultadoClienteNoBancoDeDados = (ResultSet) clienteDAO.pesquisaCliente(cliente);
        
        view.getjTableCliente().setModel(DbUtils.resultSetToTableModel(resultadoClienteNoBancoDeDados));

    }
    
    //método para setar os campos do formulario com o conteudo da tabela
    public void setarCampos() {
        int setar = view.getjTableCliente().getSelectedRow();
        
        view.getjTextFieldIdCLiente().setText(view.getjTableCliente().getModel().getValueAt(setar, 0).toString());
        view.getjTextFieldNomeCliente().setText(view.getjTableCliente().getModel().getValueAt(setar, 1).toString());
        view.getjTextFieldCpfCliente().setText(view.getjTableCliente().getModel().getValueAt(setar, 2).toString());
        view.getjTextFieldRuaCliente().setText(view.getjTableCliente().getModel().getValueAt(setar, 3).toString());
        view.getjTextFieldBairroCliente().setText(view.getjTableCliente().getModel().getValueAt(setar, 4).toString());
        view.getjTextFieldNumCliente().setText(view.getjTableCliente().getModel().getValueAt(setar, 5).toString());
        view.getjTextFieldTelCliente().setText(view.getjTableCliente().getModel().getValueAt(setar, 6).toString());
        view.getjTextFieldCelCliente().setText(view.getjTableCliente().getModel().getValueAt(setar, 7).toString());
        view.getjTextFieldReferenciaCliente().setText(view.getjTableCliente().getModel().getValueAt(setar, 8).toString());
        
        //desabilita o botao adicionar
        view.getjButtonCadastrar().setEnabled(false);
        
    }
    
    
    public void alteraDadosCliente() {
        if(view.getjTextFieldNomeCliente().getText().isEmpty() ||
           view.getjTextFieldCpfCliente().getText().isEmpty() || 
           view.getjTextFieldRuaCliente().getText().isEmpty() ||
           view.getjTextFieldBairroCliente().getText().isEmpty() ||  
           view.getjTextFieldNumCliente().getText().isEmpty() ||
           view.getjTextFieldIdCLiente().getText().isEmpty()) {
           
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {
        
            int id = Integer.parseInt( view.getjTextFieldIdCLiente().getText());
            String nome = view.getjTextFieldNomeCliente().getText();
            String cpf = view.getjTextFieldCpfCliente().getText();
            String rua = view.getjTextFieldRuaCliente().getText();
            String bairro = view.getjTextFieldBairroCliente().getText();
            int numero = Integer.parseInt(view.getjTextFieldNumCliente().getText());
            String telefone = view.getjTextFieldTelCliente().getText();
            String celular = view.getjTextFieldCelCliente().getText();
            String referencia = view.getjTextFieldReferenciaCliente().getText();

            Cliente cliente = new Cliente(id, nome, cpf, rua, bairro, numero, telefone, celular, referencia);

            Connection conexao;
            try {
                conexao = new ConexaoBanco().getConnection();
                ClienteDAO clienteDAO = new ClienteDAO(conexao);

                clienteDAO.updateCliente(cliente);

                JOptionPane.showMessageDialog(null, "Atualização do cliente feita com sucesso!");

                limparCampos();

                //habilita o botao cadastrar
                view.getjButtonCadastrar().setEnabled(true);


            } catch (SQLException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }
    
    public void deletaDadosCliente() {
        
        if(view.getjTextFieldNomeCliente().getText().isEmpty() ||
           view.getjTextFieldCpfCliente().getText().isEmpty() || 
           view.getjTextFieldRuaCliente().getText().isEmpty() ||
           view.getjTextFieldBairroCliente().getText().isEmpty() ||  
           view.getjTextFieldNumCliente().getText().isEmpty() ||
           view.getjTextFieldIdCLiente().getText().isEmpty()) {
           
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            
        } else {
        
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cliente?", "Alerta", JOptionPane.YES_NO_OPTION);

            if(confirma == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt( view.getjTextFieldIdCLiente().getText());
                String nome = view.getjTextFieldNomeCliente().getText();
                String cpf = view.getjTextFieldCpfCliente().getText();
                String rua = view.getjTextFieldRuaCliente().getText();
                String bairro = view.getjTextFieldBairroCliente().getText();
                int numero = Integer.parseInt(view.getjTextFieldNumCliente().getText());
                String telefone = view.getjTextFieldTelCliente().getText();
                String celular = view.getjTextFieldCelCliente().getText();
                String referencia = view.getjTextFieldReferenciaCliente().getText();

                Cliente cliente = new Cliente(id, nome, cpf, rua, bairro, numero, telefone, celular, referencia);

                Connection conexao;
                try {
                    conexao = new ConexaoBanco().getConnection();
                    ClienteDAO clienteDAO = new ClienteDAO(conexao);

                    clienteDAO.deleteCliente(cliente);

                    JOptionPane.showMessageDialog(null, "O cliente foi deletado!");

                    limparCampos();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
    
    public void limparCampos() {
            view.getjTextFieldPesquisar().setText(null);
            view.getjTextFieldNomeCliente().setText(null);
            view.getjTextFieldCpfCliente().setText(null);
            view.getjTextFieldBairroCliente().setText(null);
            view.getjTextFieldRuaCliente().setText(null);
            view.getjTextFieldIdCLiente().setText(null);
            view.getjTextFieldCelCliente().setText(null);
            view.getjTextFieldNumCliente().setText(null);
            view.getjTextFieldReferenciaCliente().setText(null);
            view.getjTextFieldTelCliente().setText(null);
            ((DefaultTableModel) view.getjTableClientes().getModel()).setRowCount(0);
    }
}
