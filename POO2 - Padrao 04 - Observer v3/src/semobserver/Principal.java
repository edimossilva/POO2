package semobserver;

public class Principal {
	public static void main(String[] args) {
		Estacionamento estacionamento = new Estacionamento(100);
		estacionamento.setVagaOcupada(0);
		estacionamento.setVagaOcupada(10);
		estacionamento.setVagaOcupada(20);
		estacionamento.setVagaOcupada(30);
		System.out.println(estacionamento.getQtdVagasLivres());
	}
}
