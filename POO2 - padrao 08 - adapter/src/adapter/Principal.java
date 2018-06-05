package adapter;

public class Principal {
	public static void main(String[] args) {
		CarregarArquivos carregarArquivos = new CarregarArquivosAdapter();
		carregarArquivos.carregarImagem();
		carregarArquivos.carregarSom();
	}
}
