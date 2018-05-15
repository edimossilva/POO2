
public abstract class Treinador {
	private Time time;

	public void instruirTime() {
		if (getTime().isPerdendo()) {
			atitudePerdendo();
		} else if (getTime().isEmpatando()) {
			atitudeEmpatando();
		} else if (getTime().isPerdendoDeGoleada()) {
			atitudePerdendoDeGoleada();
		} else {
			atitudeVencendo();
		}
	}

	private void ficarIrritado() {
		System.out.println("Treinador irritado!!!");
	}

	private void ficarEstressado() {
		System.out.println("Treinador estressado!!!");
	}

	protected abstract void atitudePerdendo();

	protected void atitudePerdendoDeGoleada() {
		ficarIrritado();
		ficarEstressado();
	}
	

	protected abstract void atitudeEmpatando();

	protected abstract void atitudeVencendo();

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
}
