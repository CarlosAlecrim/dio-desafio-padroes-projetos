package br.com.viverprogramando.strategy;

import br.com.viverprogramando.contrato.Pagamento;

public class Boleto implements Pagamento{

	@Override
	public String efetuarPagamento() {
		// TODO Auto-generated method stub
		return "Boleto";
	}

}
