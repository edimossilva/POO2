package typecast.instanceofegetclass;

public class InstanceOfEgetclass {
	public static void main(String[] args) {
		Object a = "palavara";
		if (a.getClass() == String.class) {
			System.out.println("getclass 1");
		}
		if (a instanceof String) {
			System.out.println("instanceof 1");
		}
		if (a.getClass() == Object.class) {
			System.out.println("getclass 2");
		}
		if (a instanceof Object) {
			System.out.println("instanceof 2");
		}
	}
}
