package templatemethod;

import java.util.List;

import modelo.Adicional;
import modelo.Item;

public class CompraPremium extends Compra {

	@Override
	protected double calculaValorAdicionais(double i, List<Adicional> adicionais) {
		double soma = 0;
		for (Adicional adicional : adicionais) {
			soma += (adicional.getValor() * i);
		}
		if (adicionais.size() > 2) {
			return soma * 0.5;
		}
		return soma;
	}

	@Override
	protected boolean naoAtingiuQtdMinima(Item item) {
		return item.getValor() < 8;
	}
	@Override
	protected void colocarDescontos() {
		valorDescontoMinimo = 0.8;
		valorDescontoMaximo = 0.5;
	}

}
