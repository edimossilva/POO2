package semobserver;

public class Vaga {
	private boolean ocupada = false;

	public boolean isOcupada() {
		return ocupada;
	}

	private void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public void ocupar() {
		setOcupada(true);
	}

	public boolean isDesocupada() {
		return !isOcupada();
	}

}
