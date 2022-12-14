package modelo.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDTO {

    private String tipo;

    private String nome;

    private String email;

    @Override()
    public String toString() {
        return String.format("%s:%s:%s", tipo, nome, email);
    }

    public UsuarioDTO(ResultSet usuario) throws SQLException {
        while (usuario.next()) {
            setTipo(usuario.getString("tipo"));
            setEmail(usuario.getString("email"));
            setNome(usuario.getString("nome"));
        }
    }

    ;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
