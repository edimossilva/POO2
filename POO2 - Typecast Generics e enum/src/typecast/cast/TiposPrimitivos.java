package typecast.cast;

public class TiposPrimitivos {
	public static void main(String[] args) {
		exemploCoersao();
		exemploConversaoExplicitaDandoCerto();
		exemploConversaoExplicitaDandoErrado();

	}

	private static void exemploConversaoExplicitaDandoErrado() {
		System.out.println("exemploConversaoExplicitaDandoErrado");
		int numInt = Integer.MAX_VALUE;
		long numLong = Long.MAX_VALUE;
		System.out.println("int " + numInt);
		System.out.println("long " + numLong);
		numInt = (int) numLong;
		System.out.println("int guarando valor que veio do long " + numInt);

	}

	private static void exemploConversaoExplicitaDandoCerto() {
		System.out.println("exemploConversaoExplicitaDandoCerto");
		int numInt = Integer.MAX_VALUE;
		long numLong = 84;
		System.out.println("int " + numInt);
		System.out.println("long " + numLong);
		numInt = (int) numLong;
		System.out.println("int guarando valor que veio do long " + numInt);

	}

	private static void exemploCoersao() {
		System.out.println("exemploCoersao");
		int numInt = Integer.MAX_VALUE;
		long numLong = Long.MAX_VALUE;
		System.out.println("int " + numInt);
		System.out.println("long " + numLong);
		numLong = numInt;
		System.out.println("long guarando valor que veio do int " + numLong);
	}
}
