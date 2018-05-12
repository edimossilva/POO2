
public class Time {
	private String nome;
	private STATUS_JOGO status = STATUS_JOGO.EMPATANDO;

	public Time(STATUS_JOGO status) {
		setStatus(status);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public STATUS_JOGO getStatus() {
		return status;
	}

	public void setStatus(STATUS_JOGO status) {
		this.status = status;
	}

	public boolean isPerdendo() {
		return getStatus().equals(STATUS_JOGO.PERDENDO);
	}

	public boolean isEmpatando() {
		return getStatus().equals(STATUS_JOGO.EMPATANDO);
	}

}
