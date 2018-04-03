package calculadoramaluca;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
	@Test
	public void testSoma1() {
		int a = 10;
		int b = 8;
		int resultado = new Calculadora().soma(a, b);
		assertEquals(20, resultado);
	}

	@Test
	public void testSoma2() {
		int a = 3;
		int b = 3;
		int resultado = new Calculadora().soma(a, b);
		assertEquals(9, resultado);
	}

	@Test
	public void testSoma3() {
		int a = 1;
		int b = 6;
		int resultado = new Calculadora().soma(a, b);
		assertEquals(13, resultado);
	}

	@Test
	public void testSoma4() {
		int a = 4;
		int b = 3;
		int resultado = new Calculadora().soma(a, b);
		assertEquals(5, resultado);
	}

	@Test
	public void testisPrimo() {
		Calculadora c = new Calculadora();
		//menores que 3
		assertEquals(true, c.isPrimo(3));
		assertEquals(true, c.isPrimo(5));
		
		//igual 3
		assertEquals(true, c.isPrimo(4));
		assertEquals(true, c.isPrimo(9));
		
		// maiores que 3
		assertEquals(false, c.isPrimo(15));
		assertEquals(false, c.isPrimo(12));
	}

}
