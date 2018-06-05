package mvc.visao;

public class VisaoConsole extends Visao {

	@Override
	protected void exibirOpcoesMenu() {
		exibir("MENU");
		exibir("0 - sair");
		exibir("1 - criar pessoa");
		exibir("2 - listar pessoas");
	}

	@Override
	protected int getNumeroDigitado() {
		String numeroString = scanner.nextLine();
		return Integer.parseInt(numeroString);
	}

	@Override
	protected String getString(String mensagem) {
		exibir(mensagem);
		return scanner.nextLine();
	}

	@Override
	protected void exibir(String mensagem) {
		System.out.println(mensagem);
	}

}
