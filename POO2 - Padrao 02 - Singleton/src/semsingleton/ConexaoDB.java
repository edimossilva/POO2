package semsingleton;

public class ConexaoDB {
	private static int contador = 0;
	private boolean conexao = false;

	public ConexaoDB() {
		if (contador >= 1) {
			return;
		}

		contador++;
		conexao = true;
		System.out.println("conectou");
	}

	public boolean isConexao() {
		return conexao;
	}

}
