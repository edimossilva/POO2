package generics;

public class Principal {
	public static void main(String[] args) {
		ListaGenerica<Integer> listaGenerica = new ListaGenerica<Integer>();
		listaGenerica.addFinal(1);
		listaGenerica.addFinal(2);
		listaGenerica.addFinal(3);
		listaGenerica.addFinal(4);
		listaGenerica.addMeio(9);
		listaGenerica.exibir();
		Integer num1 = listaGenerica.retornarPrimeiro();
		System.out.println(num1);
		System.out.println("\n");
		
		ListaObject listaObject = new ListaObject();
		listaObject.addFinal(1);
		listaObject.addFinal(2);
		listaObject.addFinal(3);
		listaObject.addFinal(4);
		listaObject.addInicio("trap");
		
		listaObject.addMeio(9);
		listaObject.exibir();
		num1 = (Integer)listaObject.retornarPrimeiro();
		System.out.println(num1);

	}
}
