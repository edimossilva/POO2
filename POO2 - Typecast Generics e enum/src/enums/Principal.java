package enums;

public class Principal {

	public static void main(String[] args) {
		ExibidorDeMensagem exibidorDeMensagem = new ExibidorDeMensagem();
		exibidorDeMensagem.exibirMensagem(1);
		exibidorDeMensagem.exibirMensagem(2);
		exibidorDeMensagem.exibirMensagem(3);
		exibidorDeMensagem.exibirMensagem(5);
		exibidorDeMensagem.exibirMensagem2(CodigoEmpresa.CODIGO_ACERTO);
		exibidorDeMensagem.exibirMensagem2(CodigoEmpresa.CODIGO_ERRO);
		exibidorDeMensagem.exibirMensagem2(CodigoEmpresa.CODIGO_ERRO);

		
	}
}
