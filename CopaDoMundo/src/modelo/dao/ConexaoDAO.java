package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    private String usuario = "root";
    private String senha = "255613";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "worldcup";
  
    public Connection getConnection() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
