package singleton;

import java.util.Date;

public class ConexaoDB {
	private static ConexaoDB conexaoDB;

	private ConexaoDB() {
		System.out.println("Criou uma conexaoDB" + new Date());
	}

	public static synchronized ConexaoDB getInstance() {
		if (conexaoDB == null) {
			conexaoDB = new ConexaoDB();
		}
		return conexaoDB;
	}
}
