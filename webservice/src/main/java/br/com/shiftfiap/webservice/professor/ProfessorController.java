package br.com.shiftfiap.webservice.professor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
	
	Professor professor = new Professor();
	
	@PostMapping("/professores")
	public Professor novoCadastro(@RequestBody Professor novoProfessor)
	{
		this.professor = novoProfessor;
		return professor;
	}
		
}
