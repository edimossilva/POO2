package semsingleton;

public class Conexao {
	private static int QTD_INSTANCIAS = 0;

	public Conexao() {
		if (QTD_INSTANCIAS == 0) {
			QTD_INSTANCIAS++;
		} else {
			throw new IllegalArgumentException("so eh possivel ter 1 insancia da classe conexao");
		}
	}

	public void conectar() {
		System.out.println("Conectando com o DB");
	}

	public void desconectar() {
		System.out.println("Desconectando com o DB");
	}
}
