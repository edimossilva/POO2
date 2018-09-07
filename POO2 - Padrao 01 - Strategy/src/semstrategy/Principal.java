package semstrategy;

public class Principal {
	public static void main(String[] args) {
		Venda venda = new Venda(100);
		venda.calcularValorDeVenda(TipoPagamento.DINHEIRO);
		venda.calcularValorDeVenda(TipoPagamento.CREDITO);
		venda.calcularValorDeVenda(TipoPagamento.DEBITO);
		venda.calcularValorDeVenda(TipoPagamento.BOLETO);

	}
}
