package edu.fapce.poo2.testes;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculadoraTeste extends TestCase {
	@Test
	public void testSomar() {
		int a = 10;
		int b = 8;

		int resultado = new Calculadora().somar(a, b);

		assertEquals(18, resultado);
	}

	@Test
	public void testFatorialPositivo() {
		int a = 2;
		int b = 3;
		Calculadora calculadora = new Calculadora();

		int resultadoA = calculadora.fatorial(a);
		int resultadoB = calculadora.fatorial(b);

		assertEquals(2, resultadoA);
		assertEquals(6, resultadoB);
	}
	@Test
	public void testFatorialNegativo() {
		int a = -2;
		int b = -3;
		Calculadora calculadora = new Calculadora();

		int resultadoA = calculadora.fatorial(a);
		int resultadoB = calculadora.fatorial(b);

		assertEquals(2, resultadoA);
		assertEquals(-6, resultadoB);
	}

	@Test
	public void testSomatorioPositivo() {
		int a = 2;
		int b = 3;

		Calculadora calculadora = new Calculadora();

		int resultadoA = calculadora.somatorio(a);
		int resultadoB = calculadora.somatorio(b);

		assertEquals(3, resultadoA);
		assertEquals(6, resultadoB);
	}

	@Test
	public void testSomatorioNegativo() {
		int a = -2;
		int b = -3;

		Calculadora calculadora = new Calculadora();

		int resultadoA = calculadora.somatorio(a);
		int resultadoB = calculadora.somatorio(b);

		assertEquals(-3, resultadoA);
		assertEquals(-6, resultadoB);
	}
}
