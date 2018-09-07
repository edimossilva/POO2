package observer;

public class Vaga {
	private boolean ocupada = false;
	private ObservadorDeVaga observadorDeVaga;

	public Vaga(ObservadorDeVaga observadorDeVaga) {
		setObservadorDeVaga(observadorDeVaga);
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public boolean isDesocupada() {
		return !isOcupada();
	}

	private void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public void ocupar() {
		if (isDesocupada()) {
			setOcupada(true);
			getObservadorDeVaga().decrementaQtdVagasLivres();
		}
	}

	public void desocupar() {
		if (isOcupada()) {
			setOcupada(false);
			getObservadorDeVaga().incrementarVaga();
		}
	}

	public ObservadorDeVaga getObservadorDeVaga() {
		return observadorDeVaga;
	}

	public void setObservadorDeVaga(ObservadorDeVaga observadorDeVaga) {
		this.observadorDeVaga = observadorDeVaga;
	}

}
