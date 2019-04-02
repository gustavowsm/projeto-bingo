/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerificacaoLogin;


import conection.ConectionBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author WHOAMI
 */
public class Atuenticacao {
    public void Logado(){
        Connection con = ConectionBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT email, senha from bingo.usuario where email = ? and senha md5(?)");
        
        stmt.setString(1, (nome do campo));
        stmt.setString(2, (nome do campo));
        
        ResultSet rs = stmt.executeQuery();
        
        String usuario = rs.getNString("email");
        String senha = rs.getNString("senha");
        
        if( usuario.equals(<campo do email>) && senha.equals(<campo da senha>)){
            System.out.println("Usuario logado");
        } else{
                System.out.println("Usuario ou senha errado");
        }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Atuenticacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if (){
            
        }
    }
}
