package comfactory;

public class Principal {
	public static void main(String[] args) {
		BancoDeDadosFactory bancoDeDadosFactory = new BancoDeDadosFactory();
		BancoDeDados bd1 = bancoDeDadosFactory.getBancoDeDados("memoria");
		bd1.exibirDesenhos();

		BancoDeDados bd2 = bancoDeDadosFactory.getBancoDeDados("texto");
		bd2.exibirDesenhos();

		if (bd2 instanceof BancoDeDadosTexto) {
			BancoDeDadosTexto bdText = (BancoDeDadosTexto)bd2;
			bdText.salvaDuplicado();
		}
	}
}
