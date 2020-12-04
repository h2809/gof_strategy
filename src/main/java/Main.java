
public class Main {

	public static void main(String[] args) {
		Human h1 = new Human("Yoshida", 173, 65, 47);
		Human h2 = new Human("Tada", 169, 83, 42);
		MyClass myClass = new MyClass(new WeightComparator());

		if ("Yoshida".equals(h1.name)) {
			myClass = new MyClass(new HeightComparator());
		}

		System.out.println(myClass.compare(h1, h2));
	}

}
