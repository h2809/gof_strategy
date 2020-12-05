
public class Main {

	public static void main(String[] args) {
		Human h1 = new Human("Yoshida", 173, 65, 47, new WeightComparator());
		Human h2 = new Human("Tada", 169, 83, 42, new HeightComparator());

		System.out.println(h1.compare(h1, h2));
		System.out.println(h2.compare(h1, h2));
	}

}
