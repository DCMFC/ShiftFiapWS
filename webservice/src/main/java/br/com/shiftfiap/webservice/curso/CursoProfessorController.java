package br.com.shiftfiap.webservice.curso;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoProfessorController extends Curso{
	
	private List<Curso> cursos = new ArrayList<Curso>();
	
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	@GetMapping("/cursos/professor/{nomeCurso}")
	public void cadastrarCurso(String nomeCurso)
	{
		Curso curso = new Curso();
		
		curso.setNome(nomeCurso);
		this.cursos.add(curso);
	}
	
	@GetMapping("/cursos/professor/mensagem/{nomeCurso}/{reposta}")
	public void responderMensagem(@PathVariable String resposta, @PathVariable String nomeCurso)
	{
		this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).findFirst().get().getMensagens().add(resposta);
	}
	

}
