package observer;

public class Dente {
	private boolean podre;
	private ObservadorDente observadorDente;

	public Dente(ObservadorDente observadorDente) {
		this.observadorDente = observadorDente;
	}

	public boolean isPodre() {
		return podre;
	}

	public void tornarPodre() {
		if (!isPodre()) {
			setPodre(true);
			observadorDente.aumentarQtdDentesPodres();
		}
	}

	public void tornarBom() {
		if (isPodre()) {
			setPodre(false);
			observadorDente.diminuirQtdDentesPodres();
		}
	}

	private void setPodre(boolean podre) {
		this.podre = podre;
	}
}
