package strategy.pagamento;

public class PagamentoDinheiro implements PagamentoI{

	@Override
	public void calcularJuros(float valor) {
		System.out.println(valor*1.05);
	}
	
}
