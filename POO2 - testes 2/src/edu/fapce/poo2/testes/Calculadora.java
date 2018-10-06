package edu.fapce.poo2.testes;

public class Calculadora {
	public int somar(int a, int b) {
		return a + b;
	}

	public int fatorial(int a) {
		int fat = 1;
		boolean isNegativo = false;
		if (a < 0) {
			a = a * -1;
			isNegativo = true;
		}
		for (int i = 1; i <= a; i++) {
			fat = fat * i;
		}
		if (isNegativo && a % 2 == 1) {
			return fat * -1;
		} else {
			return fat;
		}

	}

	public int somatorio(int a) {
		int sum = 0;
		boolean isNegativo = false;
		if (a < 0) {
			a = a * -1;
			isNegativo = true;
		}
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}
		if (isNegativo) {
			return sum * -1;
		}
		return sum;
	}

	// 1 = serah feito o fatorial do menor numero
	// 2 = se o maior numero for maior que o dobro do primeiro numero, dobre o 1
	// numero
	// 3 = se os numeros forem iguais e positivos, retorne a soma do fatoriais
	// 4 = se os numeros forem iguais e negativos, retorne a soma dos somatorios
	public int crazySoma(int a, int b) {
		return somatorio(a) + fatorial(b);
	}
}
