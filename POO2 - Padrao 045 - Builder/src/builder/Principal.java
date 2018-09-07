package builder;

public class Principal {
	public static void main(String[] args) {
		String rua = "rua da fap";
		String bairro = "bairro da fap";
		String cidade = "cidade da fap";
		String complemento = "complemento da fap";
		int numero = 1900;
		int cep = 342659481;
		Endereco endereco = Endereco.builder().setBairro(bairro).setCep(cep).setCidade(cidade)
				.setComplemento(complemento).setNumero(numero);
		endereco.setRua("nova rua").setNumero(1190);
		endereco.setComplemento("novo complemento").setBairro("novo bairro");
		System.out.println(endereco.getRua());
//		loombok
	}
}
