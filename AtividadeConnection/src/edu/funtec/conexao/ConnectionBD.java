package edu.funtec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBD {

	private final static String driver = "org.postgresql.Driver";
	private final static String usuario = "postgres";
	private final static String senha = "treinamento";//treinamento
	private final static String host = "localhost";
	private final static String porta = "5432";
	private final static String banco = "AulaCon";//AulaCon
	private final static String url =  "jdbc:postgresql://" + host + ":" + porta + "/" + banco;
	private static Connection conexao = null;
		
	public static Connection conectar() {
		try {
			Class.forName(driver);
			conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão efetuada com sucesso");
		 
		}catch (Exception ex) {
			ex.printStackTrace();
			//System.out.println("falhou");
		}
		return conexao;
	}
		
	public void fechar() {
		try {
			//conexao.fechar();
			conexao.close();
			System.out.println("Conexão encerrada");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		 	
}
