package singleton;

public class ConexaoDB {
	private static ConexaoDB INSTANCIA;

	private ConexaoDB() {
	}

	public static ConexaoDB getInstance() {
		if (INSTANCIA == null) {
			System.out.println("Criou conexao");
			INSTANCIA = new ConexaoDB();
		}
		return INSTANCIA;
	}

	public void conectar() {
		System.out.println("Conectando com o DB");
	}

	public void desconectar() {
		System.out.println("Desconectando com o DB");
	}
}
