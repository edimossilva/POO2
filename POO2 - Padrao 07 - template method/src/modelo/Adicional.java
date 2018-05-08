package modelo;

public class Adicional {
	private String nome;
	private double valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Adicional(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
}
