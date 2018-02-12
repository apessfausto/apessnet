package br.com.apess.javaweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
			try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5435/apessnet", "postgres", "fausto19841");
			} catch (SQLException e) {
			
				//exessão nativa da API
 				throw new RuntimeException(e);
			
			}
		

	}

}
