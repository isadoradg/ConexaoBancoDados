package edu.funtec.conexao;

import java.sql.*;
import java.util.List;

public class CursoExecution {

	public static void main(String[] args) {
		
		CursoDAO cursoDAO = new CursoDAO();
		
		//Consulta dos dados inseridos na tabela curso
		List<Curso> cursos = cursoDAO.list();
		cursos.stream().forEach(System.out::println);
		
		//Consulta com filtro
		System.out.println();
		Curso cursoConsulta = cursoDAO.getById(2);
		
		//Insercao de curso
		System.out.println();
		Curso cursoInsersao = new Curso(5, "Marketing e Negócios", 96);
		cursoDAO.create(cursoInsersao);
		cursos.stream().forEach(System.out::println);
		
		//Deletar curso
		System.out.println();
		cursoDAO.delete(5);
		cursos.stream().forEach(System.out::println);
		
		//Atualizar curso
		System.out.println();
		Curso cursoAtualizar = cursoDAO.getById(2);
		cursoAtualizar.setNome("Inglês/Espanhol Básico");
		cursoAtualizar.setDuracaoHoras(96);
		cursoDAO.update(cursoAtualizar);
		System.out.println();
		cursos.stream().forEach(System.out::println);
		
		ConnectionBD conecction = new ConnectionBD();
		conecction.fechar();
		
	}
	
}




