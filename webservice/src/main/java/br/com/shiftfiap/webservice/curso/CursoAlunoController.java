package br.com.shiftfiap.webservice.curso;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoAlunoController{
	
	private List<Curso> cursos = new ArrayList<Curso>();
	
	@GetMapping("/cursos/aluno/{nomeCurso}")
	public List<Curso> realizarCurso(@PathVariable String nomeCurso)
	{
		Curso curso = new Curso();
		curso.setNome(nomeCurso);
		this.cursos.add(curso);
		
		return cursos;
	}
	
	@GetMapping("/cursos/aluno/{nomeCurso}/avaliacao/{nota}")
	public List<Curso> avaliarCurso(@PathVariable String nomeCurso, @PathVariable Integer nota) 
	{
		//this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).forEach(c -> c.getNotas().add(nota));
		for(Curso curso : cursos)
			if(curso.getNome().equals(nomeCurso))
				curso.getNotas().add(nota);
		
		return cursos;
		
	}
	
	@GetMapping("/cursos/aluno/diploma/{nomeCurso}")
	public String gerarDiploma(@PathVariable String nomeCurso)
	{
		//return this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).findFirst().get().getDiploma();
		String diploma = "";
		
		for(Curso curso : cursos)
			if(curso.getNome().equals(nomeCurso))
				diploma = curso.getDiploma();
		
		return diploma;
	}
	
	@GetMapping("/cursos/aluno/{nomeCurso}/mensagem/{mensagem}")
	public List<Curso> enviarMensagem(@PathVariable String nomeCurso, @PathVariable String mensagem)
	{
		//this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).findFirst().get().getMensagens().add(mensagem);		
		for(Curso curso : cursos)
			if(curso.getNome().equals(nomeCurso))
				curso.getMensagens().add(mensagem);
		
		return cursos;
	}
	
}
