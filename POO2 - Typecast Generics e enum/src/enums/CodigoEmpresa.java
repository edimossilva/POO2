package enums;

public enum CodigoEmpresa {
	CODIGO_ERRO(400), CODIGO_ACERTO(200), CODIGO_DUVIDA(300), CODIGO_PRIORIDADE(800);

	private int num;

	private CodigoEmpresa(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public static void main(String[] args) {
		System.out.println(CodigoEmpresa.CODIGO_ACERTO.getNum());
	}
}
