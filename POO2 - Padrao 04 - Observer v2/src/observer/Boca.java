package observer;

import java.util.ArrayList;
import java.util.List;

public class Boca implements ObservadorDente {
	private List<Dente> dentes = new ArrayList<Dente>();
	private int qtdPodres = 0;

	public Boca() {
		for (int i = 0; i < 32; i++) {
			getDentes().add(new Dente(this));
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

	public void setDentePodre(int i) {
		getDentes().get(i).tornarPodre();
	}

	public void setDenteBom(int i) {
		getDentes().get(i).tornarBom();
	}

	@Override
	public void aumentarQtdDentesPodres() {
		setQtdPodres(getQtdPodres() + 1);
	}

	@Override
	public void diminuirQtdDentesPodres() {
		setQtdPodres(getQtdPodres() - 1);
	}
}
