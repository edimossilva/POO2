package calculadoramaluca;

public class Calculadora {
	public int soma(int a, int b) {
		if (a == b) {
			return a * b;
		} else if (a < b) {
			return b + b + 1;
		} else if (isPrimo(a) && isPrimo(b)) {
			return a + b - 2;
		}
		return a + b + 2;
	}

	public boolean isPrimo(int a) {
		int qtdDividores = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				qtdDividores++;
			}
		}
		if (qtdDividores <= 3) {
			return true;
		}
		return false;
	}
}
