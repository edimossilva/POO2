package strategy;

public class VendaCredito implements TipoDeVenda {

	@Override
	public void calcularValorVenda(double valor) {
		System.out.println(valor * 1.1);
	}

}
