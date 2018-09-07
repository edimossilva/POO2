package generics;

import java.util.ArrayList;
import java.util.List;

public class ListaObject {
	private List<Object> minhaLista = new ArrayList<Object>();

	public void addFinal(Object t) {
		minhaLista.add(t);
	}

	public void addInicio(Object t) {
		minhaLista.add(0, t);
	}

	public void addMeio(Object t) {
		int indexMeio = minhaLista.size() / 2;
		minhaLista.add(indexMeio, t);
	}
	public Object retornarPrimeiro() {
		return minhaLista.get(0);
	}
	public void exibir() {
		System.out.println("imprimindo");
		for (Object t : minhaLista) {
			System.out.print(t);
		}
	}
}
