package singleton;

public class Principal {
	public static void main(String[] args) {
		ConexaoDB conexaoDB = ConexaoDB.getInstance();
		ConexaoDB conexaoDB2 = ConexaoDB.getInstance();
	}
}
