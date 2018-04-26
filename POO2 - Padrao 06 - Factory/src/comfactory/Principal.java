package comfactory;

public class Principal {
	public static void main(String[] args) {
		BancoDeDadosFactory bancoDeDadosFactory = new BancoDeDadosFactory();
		BancoDeDados bd1 = bancoDeDadosFactory.getBancoDeDados("texto");
		bd1.exibirDesenhos();
		BancoDeDados bd2 = bancoDeDadosFactory.getBancoDeDados("memoria");
		bd2.exibirDesenhos();
	
	}
}
