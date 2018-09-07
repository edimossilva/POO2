package semstrategy;

public class Venda {

	private double valor;

	public double getValor() {
		return valor;
	}

	public Venda(double valor) {
		this.valor = valor;
	}

	public void calcularValorDeVenda(TipoPagamento dinheiro) {
		if (dinheiro == TipoPagamento.DINHEIRO) {
			System.out.println(getValor() * 0.90);
		} else if (dinheiro.equals(TipoPagamento.DEBITO)) {
			System.out.println(getValor());
		} else if (dinheiro.equals(TipoPagamento.CREDITO)) {
			System.out.println(getValor() * 1.05);
		} else if (dinheiro.equals(TipoPagamento.BOLETO)) {
			System.out.println(getValor() * 0.95);
		}
	}

}
