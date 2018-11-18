package br.com.shiftfiap.webservice.aluno;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {
	
	Aluno aluno = new Aluno(); 
	
	@PostMapping("/alunos")
	public Aluno novoCadastro(@RequestBody Aluno novoAluno)
	{
		this.aluno = novoAluno;
		return aluno;
	}
	
}
