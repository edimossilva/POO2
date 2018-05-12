
public class TreinadorIgor extends Treinador {

	private void taFazendoJusAoSalario() {
		System.out.println("Eh pra isso que vcs estao aqui");

	}

	private void aMediaTambemEhFracasso() {
		System.out.println(" Isso nao eh bonito pra nossa cara");
	}

	private void ensinarAJogar() {
		System.out.println("Olha pra mim e aprende");
	}

	@Override
	protected void atitudePerdendo() {
		ensinarAJogar();
	}

	@Override
	protected void atitudeEmpatando() {
		aMediaTambemEhFracasso();
	}

	@Override
	protected void atitudeVencendo() {
		taFazendoJusAoSalario();
	}
}
