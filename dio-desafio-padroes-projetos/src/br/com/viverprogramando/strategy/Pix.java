package br.com.viverprogramando.strategy;

import br.com.viverprogramando.contrato.Pagamento;

public class Pix implements Pagamento{
	
	public Pix() {
		
	}

	@Override
	public String efetuarPagamento() {
		// TODO Auto-generated method stub
		return "Pix";
	}



}
