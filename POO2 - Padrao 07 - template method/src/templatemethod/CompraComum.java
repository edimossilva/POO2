package templatemethod;

import java.util.List;

import modelo.Adicional;
import modelo.Item;

public class CompraComum extends Compra {
	
	@Override
	protected double calculaValorAdicionais(double d, List<Adicional> adicionais) {
		double soma = 0;
		for (Adicional adicional : adicionais) {
			soma += (adicional.getValor() * d);
		}
		return soma;
	}

	@Override
	protected boolean naoAtingiuQtdMinima(Item item) {
		return item.getValor() < 10;
	}

	@Override
	protected void colocarDescontos() {
		valorDescontoMinimo = 1.0;
		valorDescontoMaximo = 0.9;
	}

}
