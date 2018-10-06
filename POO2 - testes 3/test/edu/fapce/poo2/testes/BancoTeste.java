package edu.fapce.poo2.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BancoTeste {

	@Test
	public void transfereTeste() {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Natali");
		pessoa1.setSaldo(1000);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Julius");
		pessoa2.setSaldo(2000);

		Banco bb = new Banco();
		bb.setSaldo(10000);
		bb.setPorcentagemTransferencia(1);
		int valor = 100;

		bb.transfere(pessoa1, pessoa2, valor);

		assertEquals(899, pessoa1.getSaldo());
		assertEquals(2100, pessoa2.getSaldo());
		assertEquals(10001, bb.getSaldo());
	}

	@Test(expected = IllegalArgumentException.class)
	public void transfereTeste2() {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Natali");
		pessoa1.setSaldo(1000);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Julius");
		pessoa2.setSaldo(2000);

		Banco bb = new Banco();
		bb.setSaldo(10000);
		bb.setPorcentagemTransferencia(1);
		int valor = 1000;

		bb.transfere(pessoa1, pessoa2, valor);

		assertEquals(1000, pessoa1.getSaldo());
		assertEquals(2000, pessoa2.getSaldo());
		assertEquals(10000, bb.getSaldo());
	}
}
