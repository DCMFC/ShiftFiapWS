package br.com.shiftfiap.webservice.curso;

import java.util.ArrayList;
import java.util.List;

import br.com.shiftfiap.webservice.professor.Professor;

public class CursoProfessor extends Curso{
	
	private List<Curso> cursos = new ArrayList<Curso>();
	
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void cadastrarCurso(String nomeCurso, String descricao, String url, String nomeProfessor)
	{
		Curso curso = new Curso();
		
		curso.setNome(nomeCurso);
		curso.setDescricao(descricao);
		curso.setUrlVideo(url);
		
		Professor professor = new Professor();
		professor.setNome(nomeProfessor);
		
		curso.setProfessor(professor);
		
		this.cursos.add(curso);
		
	}
	
	public void responderMensagem(String nomeCurso, String resposta)
	{
		this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).findFirst().get().getMensagens().add(resposta);
	}

}
