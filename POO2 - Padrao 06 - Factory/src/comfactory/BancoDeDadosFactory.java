package comfactory;

public class BancoDeDadosFactory {
	public BancoDeDados getBancoDeDados(String tipo) {
		if (tipo.equals("texto")) {
			return new BancoDeDadosTexto();
		} else if (tipo.equals("memoria")) {
			return new BancoDeDadosMemoria();
		}
		return null;
	}
}
