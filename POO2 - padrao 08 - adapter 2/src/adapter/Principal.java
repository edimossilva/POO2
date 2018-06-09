package adapter;

public class Principal {
	public static void main(String[] args) {
		Deslocavel deslocavel = new DeslocavelAdapter();
		deslocavel.irParaAFaculdade();
		deslocavel.irParaAAcademia();
	}
}
