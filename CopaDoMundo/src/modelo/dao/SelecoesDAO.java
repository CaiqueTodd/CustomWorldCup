package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.dto.SelecoesDTO;

public class SelecoesDAO {

    Connection conexao;

    PreparedStatement pstm;

    ResultSet rs;
    
    ArrayList<SelecoesDTO> lista = new ArrayList<>();

    public ResultSet selecoes() {
        conexao = new ConexaoDAO().getConnection();
        String sql = "SELECT * FROM selecoes ORDER BY selecao";
        try {
            pstm = conexao.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
            return null;
        }
    }
    
    public ArrayList<SelecoesDTO> selecoesLista() {
        conexao = new ConexaoDAO().getConnection();
        String sql = "SELECT * FROM selecoes";
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                SelecoesDTO objSelecoes = new SelecoesDTO();
                objSelecoes.setId_selecoes(rs.getInt("id"));
                objSelecoes.setSelecoes(rs.getString("selecao"));
                
                lista.add(objSelecoes);
            }
            
            
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
            return null;
        }
        
        return lista;
    }
}
