package adapter;

public class DeslocavelAdapter extends DeslocavelByTopiq {
	private DeslocavelByBike deslocavelByBike = new DeslocavelByBike();

	@Override
	public void irParaAFaculdade() {
		deslocavelByBike.irParaAFaculdade();
	}
}
