package semobserver;

import java.util.ArrayList;
import java.util.List;

public class Boca {
	private List<Dente> dentes = new ArrayList<Dente>();
	private int qtdPodres = 0;

	public Boca() {
		for (int i = 0; i < 32; i++) {
			getDentes().add(new Dente());
		}
	}

	public int getQtdPodres() {
		return qtdPodres;
	}

	public void setQtdPodres(int qtdPodres) {
		this.qtdPodres = qtdPodres;
	}

	private List<Dente> getDentes() {
		return dentes;
	}

	public void deixarDentePodre(int index) {
		if (!getDentes().get(index).isPodre()) {
			getDentes().get(index).setPodre(true);
			setQtdPodres(getQtdPodres() + 1);
		}
	}

	public void deixarDenteBom(int index) {
		if (getDentes().get(index).isPodre()) {
			getDentes().get(index).setPodre(false);
			setQtdPodres(getQtdPodres() - 1);
		}
		getDentes().get(index).setPodre(false);
	}
}
