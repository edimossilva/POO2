package templatemethod;

import java.util.List;

import modelo.Adicional;
import modelo.Item;

public abstract class Compra {
	protected double valorDescontoMinimo;
	protected double valorDescontoMaximo;
	
	protected double calcularPreco(Item item) {
		double totalAdicionais = 0;
		colocarDescontos();
		if (naoAtingiuQtdMinima(item)) {
			totalAdicionais = calculaValorAdicionais(valorDescontoMinimo, item.getAdicionais());
		} else {
			totalAdicionais = calculaValorAdicionais(valorDescontoMaximo, item.getAdicionais());
		}
		return item.getValor() + totalAdicionais;
	}

	protected abstract double calculaValorAdicionais(double d, List<Adicional> adicionais);

	protected abstract boolean naoAtingiuQtdMinima(Item item);
	protected abstract void colocarDescontos();

	public void exibeValorCompra(Item item) {
		System.out.println(calcularPreco(item));
	}
	
}
