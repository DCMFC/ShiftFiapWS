package br.com.shiftfiap.webservice.pagamento;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoAlunoController extends Pagamento{
	
	private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	@GetMapping("/pagamentos/aluno/{nomeCurso}/{valor}")
	public List<Pagamento> pagarCurso(@PathVariable double valor, @PathVariable String nomeCurso)
	{
		Pagamento pagamento = new Pagamento();
		pagamento.setCurso(nomeCurso);
		pagamento.setValor(valor);
		
		this.pagamentos.add(pagamento);
		
		return pagamentos;
	}

}
