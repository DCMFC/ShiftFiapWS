package br.com.shiftfiap.webservice.pagamento;

import java.util.ArrayList;
import java.util.List;

public class PagamentoProfessor extends Pagamento{

	private List<Pagamento> pagamentos = new ArrayList<Pagamento>();

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	public void receberPagamento(String nomeCurso)
	{
		Pagamento pagamento = new Pagamento();
		pagamento.setCurso(nomeCurso);
		this.pagamentos.add(pagamento);
	}
}
