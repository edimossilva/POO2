package templatemethod;

import modelo.Adicional;
import modelo.Item;

public class Main {
	public static void main(String[] args) {
		CompraComum compraComum = new CompraComum();
		CompraPremium compraPremium = new CompraPremium();
		Item item = new Item("Acai", 11.0);
		item.addAdicional(new Adicional("leite em po", 1.0));
		item.addAdicional(new Adicional("chocolate", 2.0));
		item.addAdicional(new Adicional("nutela", 3.0));

		compraComum.exibeValorCompra(item);
		compraPremium.exibeValorCompra(item);
	}
}
