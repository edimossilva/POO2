package observer;

public class EnviadorDeSMS implements VendaObserver{

	private void enviarSms(Venda venda) {
		System.out.println("enviar sms da venda " + venda.getValor());
	}

	@Override
	public void reacao(Venda venda) {
		enviarSms(venda);
	}

}
