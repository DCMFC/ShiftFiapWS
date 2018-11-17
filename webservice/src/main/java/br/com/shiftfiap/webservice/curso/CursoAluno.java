package br.com.shiftfiap.webservice.curso;

import java.util.ArrayList;
import java.util.List;

public class CursoAluno extends Curso{
	
	private List<Curso> cursos = new ArrayList<Curso>();
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void realizarCurso(String nomeCurso)
	{
		Curso curso = new Curso();
		curso.setNome(nomeCurso);
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
	
	public void enviarMensagem(String nomeCurso, String mensagem)
	{
		this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).findFirst().get().getMensagens().add(mensagem);
	}
	

}
