package br.com.shiftfiap.webservice.pagamento;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoProfessorController extends Pagamento{

	private List<Pagamento> pagamentos = new ArrayList<Pagamento>();

	@GetMapping("/pagamentos/professor/{nomeCurso}")
	public List<Pagamento> receberPagamento(@PathVariable String nomeCurso)
	{
		Pagamento pagamento = new Pagamento();
		pagamento.setCurso(nomeCurso);
		this.pagamentos.add(pagamento);
		
		return pagamentos;
	}
		
}
