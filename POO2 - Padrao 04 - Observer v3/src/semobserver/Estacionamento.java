package semobserver;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private int qtdVagasLivres;
	private List<Vaga> vagas = new ArrayList<Vaga>();

	public Estacionamento(int qtdVagasLivres) {

		setQtdVagasLivres(qtdVagasLivres);

		for (int i = 0; i < getQtdVagasLivres(); i++) {
			getVagas().add(new Vaga());
		}
	}

	public int getQtdVagasLivres() {

		return qtdVagasLivres;
	}

	private void setQtdVagasLivres(int qtdVagasLivres) {
		this.qtdVagasLivres = qtdVagasLivres;
	}

	private List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagaOcupada(int i) {
		if (getVaga(i).isDesocupada()) {
			decrementarVaga(1);
			getVaga(i).ocupar();
		}
	}

	private Vaga getVaga(int i) {
		return getVagas().get(i);
	}

	private void decrementarVaga(int i) {
		setQtdVagasLivres(getQtdVagasLivres() - i);
	}

}
