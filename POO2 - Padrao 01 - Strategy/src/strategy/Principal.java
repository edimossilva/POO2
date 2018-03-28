package strategy;

import strategy.pagamento.PagamentoCartao;
import strategy.pagamento.PagamentoDinheiro;

public class Principal {
	public static void main(String[] args) {
		PagamentoStrategy pagamentoStrategy = new PagamentoStrategy();
		pagamentoStrategy.calcularJuros(100, new PagamentoCartao());
		pagamentoStrategy.calcularJuros(100, new PagamentoDinheiro());
	}
}
