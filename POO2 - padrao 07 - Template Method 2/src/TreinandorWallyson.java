
public class TreinandorWallyson extends Treinador {

	private void gritoDosVencedores() {
		System.out.println("Winner Winner, chicken for dinner!!!!");
	}

	private void gritoDeGuerraParaSairDoEmpate() {
		System.out.println("Ah Ah Ah, nao vim aqui para empatar!!");
	}

	private void gritoDeGuerra() {
		System.out.println("Eh eh Eh, to aqui para vencer!!!");
	}

	@Override
	protected void atitudePerdendo() {
		gritoDeGuerra();
	}

	@Override
	protected void atitudeEmpatando() {
		gritoDeGuerraParaSairDoEmpate();
	}

	@Override
	protected void atitudeVencendo() {
		gritoDosVencedores();
	}
}
