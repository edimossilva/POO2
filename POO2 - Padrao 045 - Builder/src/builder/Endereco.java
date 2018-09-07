package builder;

public class Endereco {
	private String rua, bairro, cidade, complemento;
	private int numero, cep;

	public String getBairro() {
		return bairro;
	}

	public Endereco setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public String getCidade() {
		return cidade;
	}

	public Endereco setCidade(String cidade) {
		this.cidade = cidade;
		return this;
	}

	public String getComplemento() {
		return complemento;
	}

	public Endereco setComplemento(String complemento) {
		this.complemento = complemento;
		return this;
	}

	public int getNumero() {
		return numero;
	}

	public Endereco setNumero(int numero) {
		this.numero = numero;
		return this;
	}

	public int getCep() {
		return cep;
	}

	public Endereco setCep(int cep) {
		this.cep = cep;
		return this;
	}

	public String getRua() {
		return rua;
	}

	public Endereco setRua(String rua) {
		this.rua = rua;
		return this;
	}

	public static Endereco builder() {
		return new Endereco();
	}
}
