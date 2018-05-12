
public abstract class Treinador {
	private Time time;

	public void instruirTime() {
		if (getTime().isPerdendo()) {
			atitudePerdendo();
		} else if (getTime().isEmpatando()) {
			atitudeEmpatando();
		} else {
			atitudeVencendo();
		}
	}

	protected abstract void atitudePerdendo();

	protected abstract void atitudeEmpatando();

	protected abstract void atitudeVencendo();

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
}
