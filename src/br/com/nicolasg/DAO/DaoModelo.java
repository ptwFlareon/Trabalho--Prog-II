package br.com.nicolasg.DAO;

import br.com.nicolasg.model.Modelo;
import br.com.nicolasg.services.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class DaoModelo {

     private Connection conn;
    
    public DaoModelo() {
        this.conn = (Connection) Conexao.getInstance().getConn();
    }
    
    public String InserirModelo(Modelo mod){
        Modelo m = mod;
         String sql = "insert into modelo (nome) values (?)";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, mod.getTitulo());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
}
