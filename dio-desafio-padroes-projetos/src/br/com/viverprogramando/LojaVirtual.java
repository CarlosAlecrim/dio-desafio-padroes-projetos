package br.com.viverprogramando;

import java.util.Scanner;

import br.com.viverprogramando.strategy.Boleto;
import br.com.viverprogramando.strategy.CartaoCredito;
import br.com.viverprogramando.strategy.Pix;

public class LojaVirtual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Loja on-line");
		
		System.out.println("Digite  a Forma de pagamento: 0 - Boleto, 1 - Cartao de Crédito, 2 - Pix");
		
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		FormaPagamento formaPagamento = new FormaPagamento();
		switch (valor) {
		case 0: {
			Boleto boleto = new Boleto();
			formaPagamento.setPagamento(boleto);
			break;
		}
		case 1: {
			CartaoCredito cartaoCredito = new CartaoCredito();
			formaPagamento.setPagamento(cartaoCredito);
			break;
		}
		case 2: {
			Pix pix = new Pix();
			formaPagamento.setPagamento(pix);
			break;
		}
		default:
			System.out.println("Não encontramos este método de pagamento :(");
		}
		
		if (formaPagamento.existe()) {
			System.out.println("Compra no "+ formaPagamento.pagar()+" realizado com sucesso!");
		}
		
		

	}

}
