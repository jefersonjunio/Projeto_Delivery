/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jjsco
 */
public class ConexaoBanco {
    
    public static Connection getConnection() throws SQLException{
           
        String url = "jdbc:mysql://localhost/sistemapadaria_db";
        String user = "root";
        String password = "";
          
        Connection conexao = DriverManager.getConnection(url, user, password);
        
        return conexao;
    }
}
