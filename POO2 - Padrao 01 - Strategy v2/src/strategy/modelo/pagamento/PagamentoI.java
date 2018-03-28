package strategy.modelo.pagamento;

import strategy.modelo.Conta;

public interface PagamentoI {
	void calcularJuros(Conta conta);
}
