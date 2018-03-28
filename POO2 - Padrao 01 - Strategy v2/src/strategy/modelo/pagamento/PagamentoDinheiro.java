package strategy.modelo.pagamento;

import strategy.modelo.Conta;

public class PagamentoDinheiro implements PagamentoI {

	@Override
	public void calcularJuros(Conta conta) {
		if (conta.getQuantidade() > 1) {
			throw new IllegalArgumentException("Pagamento em dinheiro nao pode ser parcelado");
		}
		System.out.println(conta.getValor() * 0.95);
	}

}
