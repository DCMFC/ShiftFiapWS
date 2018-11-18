package br.com.shiftfiap.webservice.curso;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoAlunoController extends Curso{
	
	private List<Curso> cursos = new ArrayList<Curso>();
	
	@GetMapping("/cursos/aluno/{nomeCurso}")
	public void realizarCurso(@PathVariable String nomeCurso)
	{
		Curso curso = new Curso();
		curso.setNome(nomeCurso);
		this.cursos.add(curso);
	}
	
	@GetMapping("/cursos/aluno/{nomeCurso}/avaliacao/{nota}")
	public void avaliarCurso(@PathVariable String nomeCurso, @PathVariable Integer nota) 
	{
		this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).forEach(c -> c.getNotas().add(nota));
	}
	
	@GetMapping("/cursos/aluno/diploma/{nomeCurso}")
	public String gerarDiploma(@PathVariable String nomeCurso)
	{
		return this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).findFirst().get().getDiploma();
	}
	
	@GetMapping("/cursos/aluno/{nomeCurso}/mensagem/{mensagem}")
	public void enviarMensagem(@PathVariable String nomeCurso, @PathVariable String mensagem)
	{
		this.cursos.stream().filter(curso -> curso.getNome().equals(nomeCurso)).findFirst().get().getMensagens().add(mensagem);		
	}
	
}
