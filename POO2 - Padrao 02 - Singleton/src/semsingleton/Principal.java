package semsingleton;

public class Principal {
	public static void main(String[] args) {

		Conexao conexao1 = new Conexao();
		conexao1.conectar();
		conexao1.desconectar();

		Conexao conexao2 = new Conexao();
		conexao2.conectar();
		conexao2.desconectar();

	}
}
