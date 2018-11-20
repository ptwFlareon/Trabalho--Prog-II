package br.com.nicolasg.DAO;

import br.com.nicolasg.model.Cliente;
import br.com.nicolasg.model.Marca;
import br.com.nicolasg.services.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class DaoCliente {

    private Connection conn;
    
    public DaoCliente() {        
         this.conn = (Connection) Conexao.getInstance().getConn();
    }
    
    public String InserirCliente(Cliente cli){
        Cliente c = cli;
        String sql = "insert into cliente (nome) values (?)";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, cli.getNome());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
}
