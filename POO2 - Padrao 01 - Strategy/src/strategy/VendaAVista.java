package strategy;

public class VendaAVista implements TipoDeVenda {

	@Override
	public void calcularValorVenda(double valor) {
		System.out.println(valor * 0.9);
	}

}
