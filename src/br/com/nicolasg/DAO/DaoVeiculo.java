package br.com.nicolasg.DAO;

import br.com.nicolasg.model.Veiculo;
import br.com.nicolasg.services.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoVeiculo {
    
    private Connection conn;

    public DaoVeiculo() {
        this.conn = (Connection) Conexao.getInstance().getConn();
    }

    public String InserirVeiculo(Veiculo vei){
        //Veiculo v = vei;
         String sql = "insert into veiculo (numplaca, cor, ano, tipocombustivel,"
                 + " numeportas,quilometragem,renavam,chassi,valorlocacaohora, "
                 + "valorlovacaokm,situacao) values (?, '?', ?, '?', ?, ?, ?, ?, ?, "
                 + "?, '?')";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, vei.getNumPlaca());
            ps.setString(2, vei.getCor());
            ps.setString(3, vei.getAno());
            ps.setString(4, vei.getTipoCombustivel());
            ps.setInt(5, vei.getNumePortas());
            ps.setDouble(6, vei.getQuilometragem());
            ps.setString(7, vei.getRenavam());
            ps.setString(8, vei.getChassi());
            ps.setDouble(9, vei.getValorLocacaoHora());
            ps.setDouble(10, vei.getValorLocacaoKm());
            ps.setString(11, vei.getSituacao());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
}
