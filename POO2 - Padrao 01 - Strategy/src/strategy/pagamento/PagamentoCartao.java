package strategy.pagamento;

public class PagamentoCartao implements PagamentoI {

	@Override
	public void calcularJuros(float valor) {
		System.out.println(valor * 1.1);
	}

}
