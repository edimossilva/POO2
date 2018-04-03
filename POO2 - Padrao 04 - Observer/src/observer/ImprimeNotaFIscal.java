package observer;

public class ImprimeNotaFIscal implements VendaObserver {

	public void imprimir(Venda venda) {
		System.out.println("imprimindo venda " + venda.getValor());
	}

	@Override
	public void reacao(Venda venda) {
		imprimir(venda);
	}

}
