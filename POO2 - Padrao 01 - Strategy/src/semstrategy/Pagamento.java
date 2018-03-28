package semstrategy;

public class Pagamento {
	void calcularJuros(float valor, String tipoDePagamento) {
		if (tipoDePagamento.equals("DINHEIRO")) {
			System.out.println(valor * 1.05);
		} else if (tipoDePagamento.equals("DEBITO")) {
			System.out.println(valor * 1.1);
		} else if (tipoDePagamento.equals("CREDITO_A_VISTA")) {
			System.out.println(valor * 1.2);
		} else if (tipoDePagamento.equals("CREDITO_PARCELADO")) {
			System.out.println(valor * 1.3);
		} else if (tipoDePagamento.equals("CREDITO_PAGSEGURO")) {
			System.out.println(valor * 1.3);
		}
	}
}