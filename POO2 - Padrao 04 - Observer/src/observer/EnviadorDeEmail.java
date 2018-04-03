package observer;

public class EnviadorDeEmail implements VendaObserver {

	private void enviarEmail(Venda venda) {
		System.out.println("Enviando emial " + venda.getValor());
	}

	@Override
	public void reacao(Venda venda) {
		enviarEmail(venda);
	}

}
