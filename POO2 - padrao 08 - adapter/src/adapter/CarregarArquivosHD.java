package adapter;

public class CarregarArquivosHD implements CarregarArquivos{

	@Override
	public void carregarImagem() {
		System.out.println("carregando imagem do hd");
	}

	@Override
	public void carregarSom() {
		System.out.println("carregando som do hd");
	}
	
}
