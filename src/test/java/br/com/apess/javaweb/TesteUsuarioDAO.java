package br.com.apess.javaweb;

import br.com.apess.javaweb.persistencia.entidade.Usuario;
import br.com.apess.javaweb.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	// metodo principal q chama as operações
	public static void main(String[] args) {
		testeExcluir();

	}

	public static void testeAlterar() {
		// update usuário
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("José da Silva");
		usu.setLogin("jsa");
		usu.setSenha("453");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com Sucesso.");
	}

	public static void testeCadastrar() {
		// criando usuário
		Usuario usu = new Usuario();
		usu.setNome("Juliana");
		usu.setLogin("jul");
		usu.setSenha("887");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastras(usu);

		System.out.println("Cadastrado com Sucesso.");
	}

	public static void testeExcluir() {
		// excluir usuário
		Usuario usu = new Usuario();
		usu.setId(8);
				
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com Sucesso.");
	}

}
