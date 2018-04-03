package semobserver;

public class Venda {
	private float valor;
	private String nomeLoja;
	
	public void finalizarVenda() {
		new EnviadorDeEmail().enviarEmail(this);
		new EnviadorDeSMS().enviarSms(this);
		new ImprimeNotaFIscal().imprimir(this);
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
}
