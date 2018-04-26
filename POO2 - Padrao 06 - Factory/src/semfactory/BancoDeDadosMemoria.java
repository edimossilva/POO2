package semfactory;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosMemoria {
	private List<String> desenhos = new ArrayList<String>();

	public BancoDeDadosMemoria() {
		desenhos.add("Naruto");
		desenhos.add("One Piece");
		desenhos.add("Swoard art online");
	}

	
	public void exibirDesenhos() {
		System.out.println("\nDesenhos - bdMemoria");
		desenhos.forEach(System.out::println);
	}
}
