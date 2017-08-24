package br.com.felipe.testeFinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.felipe.testeFinal.model.Usuario;

public class UsuarioDAO {


	private final Connection con;

	public UsuarioDAO(Connection con) {
		this.con = con;
	}

    public Usuario login(String login, String senha) throws SQLException {
        Usuario usuario = null;
        String sql = "SELECT * FROM Usuario WHERE login=? AND senha=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1, login);
        ps.setObject(2, senha);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            usuario = new Usuario();
            usuario.setUsuario(rs.getString("NOME"));
            /// ....
        }
        return usuario;
    }
}
