package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.dto.CadastroDTO;

public class RegistraDAO {

    Connection conexao;

    PreparedStatement pstm;

    public void registraUsuario(CadastroDTO cadastros) {
        String sql = "INSERT INTO usuarios (tipo, nome, email, senha) VALUES ('comum', ?, ?, ?)";
        conexao = new ConexaoDAO().getConnection();
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, cadastros.getNome());
            pstm.setString(2, cadastros.getEmail());
            pstm.setString(3, cadastros.getSenha());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Usuário ja existente! Tente novamente");
        }
    }
}
