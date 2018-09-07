package semobserver;

public class Principal {
	public static void main(String[] args) {
		Boca boca = new Boca();
		boca.deixarDentePodre(1);
		boca.deixarDentePodre(10);
		boca.deixarDentePodre(25);
		boca.deixarDenteBom(10);

		System.out.println(boca.getQtdPodres());
	}
}
