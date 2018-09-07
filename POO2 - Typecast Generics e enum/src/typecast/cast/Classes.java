package typecast.cast;

import typecast.cast.model.Tv;

public class Classes {
	public static void main(String[] args) {
		// exemploUpCastingDandoCerto();
		// exemploDownCastingDandoCerto();
		exemploDownCastingDandoErrado();
	}

	private static void exemploDownCastingDandoErrado() {
		System.out.println("exemploDownCastingDandoCerto");
		Object obj = "minha string";

		Tv tv = (Tv) obj;

		System.out.println(tv);

	}

	public static void exemploDownCastingDandoCerto() {
		System.out.println("exemploDownCastingDandoCerto");
		Object obj = new Tv("nova tv");

		Tv tv = (Tv) obj;

		System.out.println(tv);
	}

	public static void exemploUpCastingDandoCerto() {
		System.out.println("exemploUpCastingDandoCerto");
		Object obj = new Tv("minhatv");
		System.out.println(obj);
	}
}
