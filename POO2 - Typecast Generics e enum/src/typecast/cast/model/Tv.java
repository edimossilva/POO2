package typecast.cast.model;

public class Tv {
	private String nome;

	public String getNome() {
		return nome;
	}

	public Tv(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return getNome();
	}
}
