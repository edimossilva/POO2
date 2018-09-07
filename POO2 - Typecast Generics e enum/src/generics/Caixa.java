package generics;

public class Caixa<T> {
	private T objeto;

	public Caixa(T objeto) {
		setObjeto(objeto);
	}

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public static void main(String[] args) {
		Caixa<String> caixa = new Caixa<String>("oi");
		Caixa<Integer> caixa2 = new Caixa<Integer>(1);
		String a = caixa.getObjeto();
		Integer b = caixa2.getObjeto();
		System.out.println(a);
		System.out.println(b);
	}
}
