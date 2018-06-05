package mvc.visao;

import javax.swing.JOptionPane;

public class VisaoGUI extends Visao {

	@Override
	protected String getString(String mensagem) {
		return JOptionPane.showInputDialog(mensagem, null);
	}

	@Override
	protected int getNumeroDigitado() {
		String numeroString = JOptionPane.showInputDialog("", null);
		return Integer.parseInt(numeroString);
	}

	@Override
	protected void exibirOpcoesMenu() {
		String mensagem = "MENU \n 0 - sair \n 1 - criar pessoa \n 2 - listar pessoas";
		exibir(mensagem);
	}

	@Override
	protected void exibir(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Error", JOptionPane.ERROR_MESSAGE);
	}

}
