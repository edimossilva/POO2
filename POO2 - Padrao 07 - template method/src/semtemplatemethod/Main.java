package semtemplatemethod;

import modelo.Adicional;
import modelo.Item;

public class Main {
	public static void main(String[] args) {
		CompraClienteComum compraClienteComum = new CompraClienteComum();
		CompraClientePremium compraClientePremium = new CompraClientePremium();
		Item item = new Item("Acai", 11.0);
		item.addAdicional(new Adicional("leite em po", 1.0));
		item.addAdicional(new Adicional("chocolate", 2.0));
		item.addAdicional(new Adicional("nutela", 3.0));
		
		compraClienteComum.exibeValorCompra(item);
		compraClientePremium.exibeValorCompra(item);
	}
}
