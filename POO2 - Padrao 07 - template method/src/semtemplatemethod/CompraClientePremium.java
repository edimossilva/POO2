package semtemplatemethod;

import java.util.List;

import modelo.Adicional;
import modelo.Item;

public class CompraClientePremium {
	private double calcularPreco(Item item) {
		double totalAdicionais = 0;
		if (item.getValor() < 8) {
			totalAdicionais = calculaValorAdicionais(0.8, item.getAdicionais());
		} else {
			totalAdicionais = calculaValorAdicionais(0.5, item.getAdicionais());
		}
		return item.getValor() + totalAdicionais;
	}

	private double calculaValorAdicionais(double i, List<Adicional> adicionais) {
		double soma = 0;
		for (Adicional adicional : adicionais) {
			soma += (adicional.getValor() * i);
		}
		if (adicionais.size() > 2) {
			return soma * 0.5;
		}
		return soma;
	}

	public void exibeValorCompra(Item item) {
		System.out.println(calcularPreco(item));
	}
}
