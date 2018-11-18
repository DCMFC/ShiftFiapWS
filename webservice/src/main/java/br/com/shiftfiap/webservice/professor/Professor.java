package br.com.shiftfiap.webservice.professor;

import br.com.shiftfiap.webservice.curso.CursoProfessorController;
import br.com.shiftfiap.webservice.pagamento.PagamentoProfessorController;

public class Professor {
	
	private CursoProfessorController cursos;
	private String nome;
	private PagamentoProfessorController pagamentos;
	
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
	
	public PagamentoProfessorController getPagamentos() {
		return pagamentos;
	}
	
	public void setPagamentos(PagamentoProfessorController pagamentos) {
		this.pagamentos = pagamentos;
	}
}
