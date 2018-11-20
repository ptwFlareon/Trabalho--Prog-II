package br.com.nicolasg.DAO;

import br.com.nicolasg.model.Locacao;
import br.com.nicolasg.services.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoLocacao {
    
    private Connection conn;

    public DaoLocacao() {
        this.conn = (Connection) Conexao.getInstance().getConn();
    }

    public String InserirLocacao(Locacao loc){
        Locacao l = loc;
        String sql = "insert into locacao (horainicio, horafim, kminicio, "
                 + "kmfim, kmrodado, tempohoras, vlhora, vlkm, valortotal, "
                 + "situacao) values ('?', '?', ?, ?, ?, ?, ?, ?, ?, '?')";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, loc.getHoraInicio());
            ps.setString(2, loc.getHoraFim());
            ps.setDouble(3, loc.getKmInicio());
            ps.setDouble(4, loc.getKmFim());
            ps.setDouble(5, loc.getKmRodado());
            ps.setDouble(6, loc.getTempoHoras());
            ps.setDouble(7, loc.getValorHora());
            ps.setDouble(8, loc.getValorKm());
            ps.setDouble(9, loc.getValorTotal());
            ps.setString(10, loc.getSituacao());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
}
