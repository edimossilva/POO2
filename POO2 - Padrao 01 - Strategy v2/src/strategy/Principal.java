package strategy;

import strategy.modelo.Conta;
import strategy.modelo.pagamento.PagamentoCartao;
import strategy.modelo.pagamento.PagamentoDinheiro;

public class Principal {
	public static void main(String[] args) {
		PagamentoStrategy pagamentoStrategy = new PagamentoStrategy();
		Conta conta1 = new Conta(1000, 1, "celular");
		Conta conta2 = new Conta(1000, 10, "notebook");

		pagamentoStrategy.calcularJuros(conta1, new PagamentoCartao());
		pagamentoStrategy.calcularJuros(conta2, new PagamentoCartao());
	}
}
