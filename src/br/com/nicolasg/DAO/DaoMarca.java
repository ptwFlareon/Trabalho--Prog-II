package br.com.nicolasg.DAO;

import br.com.nicolasg.model.Marca;
import br.com.nicolasg.services.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class DaoMarca {

    private Connection conn;

    public DaoMarca() {
        this.conn = (Connection) Conexao.getInstance().getConn();
    }
    
    public String InserirMarca(Marca mar){
        Marca m = mar;
        String sql = "insert into marcas (Titulo) values (?)";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, mar.getTitulo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

}