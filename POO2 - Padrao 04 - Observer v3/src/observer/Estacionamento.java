package observer;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento implements ObservadorDeVaga {
	private int qtdVagasLivres;
	private List<Vaga> vagas = new ArrayList<Vaga>();

	public Estacionamento(int qtdVagasLivres) {

		setQtdVagasLivres(qtdVagasLivres);

		for (int i = 0; i < getQtdVagasLivres(); i++) {
			getVagas().add(new Vaga(this));
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
		getVaga(i).ocupar();
	}

	public void setVagaLivre(int i) {
		getVaga(i).desocupar();
	}

	private Vaga getVaga(int i) {
		return getVagas().get(i);
	}

	@Override
	public void decrementaQtdVagasLivres() {
		setQtdVagasLivres(getQtdVagasLivres() - 1);
	}

	@Override
	public void incrementarVaga() {
		setQtdVagasLivres(getQtdVagasLivres() + 1);
	}

}
