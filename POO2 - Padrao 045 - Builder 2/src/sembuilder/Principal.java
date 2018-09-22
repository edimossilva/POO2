package sembuilder;

public class Principal {
	public static void main(String[] args) {
		String rua = "rua da fap";
		String bairro = "bairro da fap";
		String cidade = "cidade da fap";
		String complemento = "complemento da fap";
		int numero = 1900;
		int cep = 342659481;
		Endereco endereco = new Endereco(bairro, rua,complemento);
		endereco = Endereco.builder().bairro("novo bairro").rua("nova rua").complemento("complemento").build();
		Endereco endereco2 = new Endereco(bairro, rua, cidade);
		endereco2 = Endereco.builder().bairro("novo bairro").rua("nova rua").cidade("complemento").build();
		
		System.out.println(endereco);
	}
}
