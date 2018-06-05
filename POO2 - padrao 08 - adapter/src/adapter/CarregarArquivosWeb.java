package adapter;

public class CarregarArquivosWeb implements CarregarArquivos {

	@Override
	public void carregarImagem() {
		System.out.println("carregando imagem da web");
	}

	@Override
	public void carregarSom() {
		System.out.println("carregando som da web");
	}

}
