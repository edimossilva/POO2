package enums;

public class ExibidorDeMensagem {
	public void exibirMensagem(int codigoDaEmpresa) {
		if (codigoDaEmpresa == CodigosDaEmpresa.CODIGO_ACERTO) {
			System.out.println("acertou :)");
		}
		if (codigoDaEmpresa == CodigosDaEmpresa.CODIGO_DUVIDA) {
			System.out.println("duvidou =z");
		}
		if (codigoDaEmpresa == CodigosDaEmpresa.CODIGO_ERRO) {
			System.out.println("erRrou =x");
		}
		if (codigoDaEmpresa == CodigosDaEmpresa.CODIGO_PRIORIDADE) {
			System.out.println("Prioridade !!!");
		}
	}

	public void exibirMensagem2(CodigoEmpresa ce) {
		if (ce == CodigoEmpresa.CODIGO_ACERTO) {
			System.out.println("acertou :)");
		}
		if (ce == CodigoEmpresa.CODIGO_DUVIDA) {
			System.out.println("duvidou =z");
		}
		if (ce == CodigoEmpresa.CODIGO_ERRO) {
			System.out.println("erRrou =x");
		}
		if (ce == CodigoEmpresa.CODIGO_PRIORIDADE) {
			System.out.println("Prioridade !!!");
		}
	}
}
