package edu.funtec.conexao;

//classe com os mesmos atributos que a tabela do BD "tb_curso"
public class Curso {
	private int id_curso;
	private String nome;
	private int duracaoHoras;
	
	public Curso() {
		
	}
	
	public Curso(int idCurso, String nomeCurso, int duracaoHoras) {
		this.id_curso = idCurso;
		this.nome = nomeCurso;
		this.duracaoHoras = duracaoHoras;
	}

	public Curso(String nomeCurso, int duracaoHoras) {
		this.nome = nomeCurso;
		this.duracaoHoras = duracaoHoras;
	}
	
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	
	public int getId_curso() {
		return id_curso;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDuracaoHoras(int duracaoHoras) {
		this.duracaoHoras = duracaoHoras;
	}
	
	public int getDuracaoHoras() {
		return duracaoHoras;
	}
	
	public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("id=").append(id_curso);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", duracao=").append(duracaoHoras);
        sb.append('}');
        return sb.toString();
    }

}


