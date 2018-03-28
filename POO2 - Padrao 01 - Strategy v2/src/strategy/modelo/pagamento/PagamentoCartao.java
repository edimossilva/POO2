package strategy.modelo.pagamento;

import strategy.modelo.Conta;

public class PagamentoCartao implements PagamentoI {

	@Override
	public void calcularJuros(Conta conta) {
		float jurosAdicionais = (float) (conta.getQuantidade() * 0.03);
		System.out.println(conta.getValor() * (1 + jurosAdicionais));
	}

}
