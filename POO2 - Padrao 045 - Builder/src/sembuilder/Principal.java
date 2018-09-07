package sembuilder;

public class Principal {
	public static void main(String[] args) {
		String rua = "rua da fap";
		String bairro = "bairro da fap";
		String cidade = "cidade da fap";
		String complemento = "complemento da fap";
		int numero = 1900;
		int cep = 342659481;
		Endereco endereco = new Endereco(rua, bairro, cidade, complemento, numero, cep);
		endereco = Endereco.builder().bairro("novo bairro").rua("nova rua").build();
		System.out.println(endereco);
	}
}
