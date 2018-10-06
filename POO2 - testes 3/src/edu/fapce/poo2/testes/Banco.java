package edu.fapce.poo2.testes;

public class Banco {
	private int saldo;
	private int porcentagemTransferencia;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getPorcentagemTransferencia() {
		return porcentagemTransferencia;
	}

	public void setPorcentagemTransferencia(int porcentagemTransferencia) {
		this.porcentagemTransferencia = porcentagemTransferencia;
	}

	public void transfere(Pessoa pessoa1, Pessoa pessoa2, int valor) {
		int valorDesconto = (valor / 100) * getPorcentagemTransferencia();
		if (pessoa1.getSaldo() < valor + valorDesconto) {
			throw new IllegalArgumentException("liseira detectada exception");
		} else {
			System.out.println(valorDesconto);
			pessoa1.decrementa(valor + valorDesconto);
			pessoa2.incrementa(valor);
			incrementa(valorDesconto);
			pessoa1.exibirSaldo();
			pessoa2.exibirSaldo();
			exibirSaldo();
		}
	}

	private void incrementa(int valorDesconto) {
		saldo += valorDesconto;
	}

	private void exibirSaldo() {
		System.out.println("Saldo do banco: " + getSaldo());
	}

}
