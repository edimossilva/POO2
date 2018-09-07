package generics;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
	private List<T> minhaLista = new ArrayList<T>();

	public void addFinal(T t) {
		minhaLista.add(t);
	}

	public void addInicio(T t) {
		minhaLista.add(0, t);
	}

	public void addMeio(T t) {
		int indexMeio = minhaLista.size() / 2;
		minhaLista.add(indexMeio, t);
	}

	public T retornarPrimeiro() {
		return minhaLista.get(0);
	}

	public void exibir() {
		System.out.println("imprimindo");
		for (T t : minhaLista) {
			System.out.print(t);
		}
	}
}
