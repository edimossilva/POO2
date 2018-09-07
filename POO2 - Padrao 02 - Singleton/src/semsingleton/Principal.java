package semsingleton;

public class Principal {
	static ConexaoDB conexaoDB;

	public static void main(String[] args) {
		ConexaoDB conexaoDB2 = getInstancia();
		ConexaoDB conexaoDB3 = getInstancia();
		System.out.println(conexaoDB2);
		System.out.println(conexaoDB3);
	}

	private static ConexaoDB getInstancia() {
		if (conexaoDB == null) {
			conexaoDB = new ConexaoDB();
			return conexaoDB;
		}
		return conexaoDB;
	}

}
