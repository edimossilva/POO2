
public class Main {
	public static void main(String[] args) {
		Treinador igor = new TreinadorIgor();
		Treinador wallyson = new TreinandorWallyson();
		igor.setTime(new Time(STATUS_JOGO.PERDENDO_DE_GOLEADA));
		wallyson.setTime(new Time(STATUS_JOGO.PERDENDO_DE_GOLEADA));

		igor.instruirTime();

		wallyson.instruirTime();
	}
}
