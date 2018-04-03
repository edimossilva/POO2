package observer;

public class Principal {
	public static void main(String[] args) {
		Venda venda = new Venda();
		venda.setNomeLoja("Loja do Isaac");
		venda.setValor(1500);
		
		venda.addObservador(new ImprimeNotaFIscal());
		venda.addObservador(new EnviadorDeSMS());
		venda.addObservador(new EnviadorDeEmail());
		
		venda.finalizarVenda();
	}
}
