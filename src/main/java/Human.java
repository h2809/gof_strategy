// context
public class Human {

	public String name;
	public int height = -1;
	public int weight = -1;
	public int age = -1;

	// strategy
	private Comparator comparator = null;

	public Human(String name, int height, int weight, int age, Comparator comparator) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.comparator = comparator;
	}

    public int compare(Human h1,Human h2){
    	// 委譲
    	return this.comparator.compare(h1,h2);
    }

}
