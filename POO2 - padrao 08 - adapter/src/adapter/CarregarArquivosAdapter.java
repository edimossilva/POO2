package adapter;

public class CarregarArquivosAdapter extends CarregarArquivosHD {
	CarregarArquivosWeb carregarArquivosWeb = new CarregarArquivosWeb();

	@Override
	public void carregarImagem() {
		carregarArquivosWeb.carregarImagem();
	}
	
}

