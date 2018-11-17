package br.com.shiftfiap.webservice.pagamento;

import java.util.ArrayList;
import java.util.List;

public class PagamentoAluno extends Pagamento{
	
	private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public void pagarCurso(double valor, String nomeCurso)
	{
		Pagamento pagamento = new Pagamento();
		pagamento.setCurso(nomeCurso);
		pagamento.setValor(valor);
		
		this.pagamentos.add(pagamento);
	}

}
