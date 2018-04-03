package semobserver;

public class EnviadorDeEmail {

	public void enviarEmail(Venda venda) {
		System.out.println("Enviando emial " + venda.getValor());
	}

}
