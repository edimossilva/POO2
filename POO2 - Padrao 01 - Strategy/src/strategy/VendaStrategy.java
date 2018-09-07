package strategy;

public class VendaStrategy {
	private double valor;

	public double getValor() {
		return valor;
	}

	public VendaStrategy(double valor) {
		this.valor = valor;
	}

	public void calcularValorVenda(TipoDeVenda tipoDeVenda) {
		tipoDeVenda.calcularValorVenda(getValor());
	}
}
