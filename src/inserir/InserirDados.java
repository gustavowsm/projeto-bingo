package inserir;

import conection.ConectionBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WHOAMI
 */
public class InserirDados {
    
    public void Inserir(){
        Connection con = ConectionBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO `usuario` (`nome`, `rg`, `cpf`, `email`, `senha`, `data_nascimento`, `endereco`, `cep`, `perfil_ativo`, `jogos_feitos`, `cartelas_compradas`, `jogos_ativos`) VALUES (?, ?, ?, ?, md5(?),?, ?, ?, ?, ?, ?, ?)");
            
            stmt.setString(1, (nome do campo));
            stmt.setString(2, (nome do campo));
            stmt.setString(3, (nome do campo));
            stmt.setString(4, (nome do campo));
            stmt.setString(5, (nome do campo));
            stmt.setDate(6, (nome do campo));
            stmt.setString(7, (nome do campo));
            stmt.setString(8, (nome do campo));
            stmt.setInt(9, (nome do campo));
            stmt.setInt(10, (nome do campo));
            stmt.setInt(11, (nome do campo));
            stmt.setInt(12, (nome do campo));
            
            stmt.executeQuery();
            
            System.out.println("Cadastro realizado com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(InserirDados.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConectionBanco.closeConnection(con, stmt);
        }
        
    }
}
