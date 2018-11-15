package br.com.shiftfiap.webservice.aluno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.shiftfiap.webservice.curso.Curso;

public class Aluno {

	private String nome;
	private Date dataNascimento;
	private String cidade;
	private String estado;
	private String nivelEducacional;
	private String profissao;
	private String cartaoCredito;
	private String idAluno;
	private List<Curso> cursos = new ArrayList<Curso>();
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNivelEducacional() {
		return nivelEducacional;
	}
	public void setNivelEducacional(String nivelEducacional) {
		this.nivelEducacional = nivelEducacional;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public String getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(String idAluno) {
		this.idAluno = idAluno;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void realizarCurso(Curso curso)
	{
		this.cursos.add(curso);
	}
	
	public void avaliarCurso(String nomeCurso, Integer nota) 
	{
		this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).forEach(c -> c.getNotas().add(nota));
		
	}
	
	public String gerarDiploma(String nomeCurso)
	{
		return this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).findFirst().get().getDiploma();
	}
	
	
}
