package semfactory;

public class Principal {
	public static void main(String[] args) {
		BancoDeDadosTexto bdTexto = new BancoDeDadosTexto();
		bdTexto.exibirDesenhos();
		BancoDeDadosMemoria bdMemoria = new BancoDeDadosMemoria();
		bdMemoria.exibirDesenhos();
	}
}
