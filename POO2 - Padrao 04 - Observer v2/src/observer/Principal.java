package observer;

public class Principal {
	public static void main(String[] args) {
		Boca boca = new Boca();
		boca.setDentePodre(0);
		System.out.println(boca.getQtdPodres());

		boca.setDentePodre(10);
		System.out.println(boca.getQtdPodres());

		boca.setDentePodre(20);
		System.out.println(boca.getQtdPodres());

		boca.setDenteBom(20);
		System.out.println(boca.getQtdPodres());
	}
}
