package br.com.shiftfiap.webservice.curso;

import java.util.ArrayList;
import java.util.List;

import br.com.shiftfiap.webservice.professor.Professor;

public class Curso {

	private String nome;
	private String descricao;
	private String urlVideo;
	private Professor professor;
	private List<Integer> notas = new ArrayList<Integer>();
	private List<String> mensagens = new ArrayList<String>();
	private String diploma;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUrlVideo() {
		return urlVideo;
	}
	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Integer> getNotas() {
		return notas;
	}
	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}
	public List<String> getMensagens() {
		return mensagens;
	}
	public void setMensagens(List<String> mensagens) {
		this.mensagens = mensagens;
	}
	public String getDiploma() {
		return diploma;
	}
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}
}
