
public class Main {
	public static void main(String[] args) {
		Treinador igor = new TreinadorIgor();
		Treinador wallyson = new TreinandorWallyson();
		igor.setTime(new Time(STATUS_JOGO.EMPATANDO));
		wallyson.setTime(new Time(STATUS_JOGO.EMPATANDO));

		igor.instruirTime();

		wallyson.instruirTime();
	}
}
