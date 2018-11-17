package br.com.shiftfiap.webservice.professor;

import br.com.shiftfiap.webservice.curso.CursoProfessor;
import br.com.shiftfiap.webservice.pagamento.PagamentoProfessor;

public class Professor {
	
	private CursoProfessor cursos;
	private String nome;
	private String idProfessor;
	private PagamentoProfessor pagamentos;
	
	public CursoProfessor getCursos() {
		return cursos;
	}
	public void setCursos(CursoProfessor cursos) {
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
	
	public PagamentoProfessor getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(PagamentoProfessor pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	public void cadastrarCurso(String nomeCurso, String descricao, String url, String nomeProfessor)
	{
		this.cadastrarCurso(nomeCurso, descricao, url, nomeProfessor);
	}
	
	public void receberPagamento(String nomeCurso)
	{
		this.pagamentos.receberPagamento(nomeCurso);
	}

}
