package br.com.shiftfiap.webservice.professor;

import br.com.shiftfiap.webservice.curso.CursoProfessorController;

public class Professor {
	
	private CursoProfessorController cursos;
	private String nome;
	
	public CursoProfessorController getCursos() {
		return cursos;
	}
	public void setCursos(CursoProfessorController cursos) {
		this.cursos = cursos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
