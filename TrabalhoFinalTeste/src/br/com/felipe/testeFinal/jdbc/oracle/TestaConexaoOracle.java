package br.com.felipe.testeFinal.jdbc.oracle;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexaoOracle {
	public static void main(String[] args) throws SQLException {
		ConnectionPoolOracle database = new ConnectionPoolOracle();
		Connection connection = database.getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}

}