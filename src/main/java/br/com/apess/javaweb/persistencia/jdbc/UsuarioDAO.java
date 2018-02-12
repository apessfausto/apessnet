package br.com.apess.javaweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.apess.javaweb.persistencia.entidade.Usuario;

public class UsuarioDAO {

	private Connection con = ConexaoFactory.getConnection();

	public void cadastras(Usuario usu) {

		// string de persistencia no banco
		String sql = "insert into usuario(nome, login, senha) values (?,?,?)";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());

			// Executando SQL no Banco
			preparador.execute();
			// encerrando o objeto de conexção
			preparador.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void alterar(Usuario usu) {

		// string de persistencia no banco
		String sql = "UPDATE usuario SET nome=?, login=?, senha=? where id=?";

		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			;

			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());

			// Executando SQL no Banco
			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void excluir(Usuario usu) {
		// string de persistencia no banco
		String sql = "DELETE from usuario WHERE  id=?";

		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			
			preparador.setInt(1, usu.getId());

			// Executando SQL no Banco
			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		
	}

}
