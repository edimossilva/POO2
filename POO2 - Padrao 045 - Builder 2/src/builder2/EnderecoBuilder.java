package builder2;

import sembuilder.Endereco;

public class EnderecoBuilder {
	private Endereco endereco = new Endereco();

	private boolean isValid() {
		int cont = 0;
		if (endereco.getBairro() != null) {
			cont++;
		}
		if (endereco.getRua() != null) {
			cont++;
		}
		if (endereco.getComplemento() != null) {
			cont++;
		}
		if (endereco.getCidade() != null) {
			cont++;
		}
		return cont > 1;
	}

	public EnderecoBuilder rua(String rua) {
		endereco.setRua(rua);
		return this;
	}

	public EnderecoBuilder bairro(String bairro) {
		endereco.setBairro(bairro);
		return this;
	}

	public EnderecoBuilder cidade(String cidade) {
		endereco.setCidade(cidade);
		return this;
	}

	public EnderecoBuilder complemento(String complemento) {
		endereco.setComplemento(complemento);
		return this;
	}

	public Endereco build() {
		if (isValid()) {
			return endereco;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Endereco endereco = new EnderecoBuilder().bairro("bairro").cidade("cidade").build();
	}
}
