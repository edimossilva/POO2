package strategy.modelo;

public class Conta {
	private float valor;
	private int quantidade;
	private String nome;

	public Conta(float valor, int quantidade, String nome) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
