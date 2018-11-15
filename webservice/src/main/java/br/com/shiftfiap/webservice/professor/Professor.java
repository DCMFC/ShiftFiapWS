package br.com.shiftfiap.webservice.professor;

import java.util.List;

import br.com.shiftfiap.webservice.curso.Curso;

public class Professor {
	
	private List<Curso> cursos;
	private String nome;
	private String idProfessor;
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(String idProfessor) {
		this.idProfessor = idProfessor;
	}

}
