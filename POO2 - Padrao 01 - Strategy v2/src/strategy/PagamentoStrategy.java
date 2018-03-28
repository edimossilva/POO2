package strategy;

import strategy.modelo.Conta;
import strategy.modelo.pagamento.PagamentoI;

public class PagamentoStrategy {
	public void calcularJuros(Conta conta, PagamentoI pagamentoI) {
		pagamentoI.calcularJuros(conta);
	}
}
