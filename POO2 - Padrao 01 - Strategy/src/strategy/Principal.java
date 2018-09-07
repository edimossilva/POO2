package strategy;

public class Principal {
	public static void main(String[] args) {
		VendaStrategy vendaStrategy = new VendaStrategy(100);
		vendaStrategy.calcularValorVenda(new VendaAVista());
		vendaStrategy.calcularValorVenda(new VendaCredito());
	}
}
