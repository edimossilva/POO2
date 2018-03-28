package semstrategy;

public class Principal {
	public static void main(String[] args) {
		Pagamento pagamento = new Pagamento();
		pagamento.calcularJuros(100, "DINHEIRO");
		pagamento.calcularJuros(100, "DEBITO");
		pagamento.calcularJuros(100, "CREDITO_A_VISTA");
		pagamento.calcularJuros(100, "CREDITO_PARCELADO");
		pagamento.calcularJuros(100, "CREDITO_PAGSEGURO");

	}
}
