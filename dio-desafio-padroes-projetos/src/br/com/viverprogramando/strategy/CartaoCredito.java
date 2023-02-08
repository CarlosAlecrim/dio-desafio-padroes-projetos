package br.com.viverprogramando.strategy;

import br.com.viverprogramando.contrato.Pagamento;

public class CartaoCredito implements Pagamento{

	@Override
	public String efetuarPagamento() {
		// TODO Auto-generated method stub
		return "cartao de credito";
	}
	
	
	

}
