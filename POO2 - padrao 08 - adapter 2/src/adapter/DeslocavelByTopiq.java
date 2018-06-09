package adapter;

public class DeslocavelByTopiq implements Deslocavel {

	@Override
	public void irParaAFaculdade() {
		System.out.println("indo de topiq");
	}

	@Override
	public void irParaAAcademia() {
		System.out.println("indo para a academia de topiq");
	}

}
