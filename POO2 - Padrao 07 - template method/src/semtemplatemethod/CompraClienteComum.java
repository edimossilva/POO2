package semtemplatemethod;

import java.util.List;

import modelo.Adicional;
import modelo.Item;

public class CompraClienteComum {
	private double calcularPreco(Item item) {
		double totalAdicionais = 0;
		if (item.getValor() < 10) {
			totalAdicionais = calculaValorAdicionais(1.0, item.getAdicionais());
		} else {
			totalAdicionais = calculaValorAdicionais(0.9, item.getAdicionais());
		}
		return item.getValor() + totalAdicionais;
	}

	private double calculaValorAdicionais(double i, List<Adicional> adicionais) {
		double soma = 0;
		for (Adicional adicional : adicionais) {
			soma += (adicional.getValor() * i);
		}
		return soma;
	}

	public void exibeValorCompra(Item item) {
		System.out.println(calcularPreco(item));
	}
}
