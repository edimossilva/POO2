package adapter;

public class DeslocavelByBike implements Deslocavel {

	@Override
	public void irParaAFaculdade() {
		System.out.println("Indo para a faculdade de bike :)");
	}

	@Override
	public void irParaAAcademia() {
		System.out.println("indo para a academia de bike");
	}

}
