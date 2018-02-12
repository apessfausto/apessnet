package br.com.apess.javaweb;

import br.com.apess.javaweb.persistencia.entidade.Usuario;
import br.com.apess.javaweb.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	// metodo principal q chama as opera��es
	public static void main(String[] args) {
		testeExcluir();

	}

	public static void testeAlterar() {
		// update usu�rio
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Jos� da Silva");
		usu.setLogin("jsa");
		usu.setSenha("453");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com Sucesso.");
	}

	public static void testeCadastrar() {
		// criando usu�rio
		Usuario usu = new Usuario();
		usu.setNome("Juliana");
		usu.setLogin("jul");
		usu.setSenha("887");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastras(usu);

		System.out.println("Cadastrado com Sucesso.");
	}

	public static void testeExcluir() {
		// excluir usu�rio
		Usuario usu = new Usuario();
		usu.setId(8);
				
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com Sucesso.");
	}

}
