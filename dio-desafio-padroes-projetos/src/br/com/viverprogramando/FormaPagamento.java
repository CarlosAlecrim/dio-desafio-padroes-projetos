package br.com.viverprogramando;

import br.com.viverprogramando.contrato.Pagamento;

public class FormaPagamento {
	
	private Pagamento pagamento;

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public String pagar() {
		if (pagamento == null){
			return "Escolha uma forma de pagamento";
		}else {
		return pagamento.efetuarPagamento();
		}
	}
	
	public Boolean existe() {
		
		if(pagamento == null)
			return false;
		else
			return true;
					
					
	}

}
