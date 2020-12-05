// context
public class MyClass{
	// strategy
	private Comparator comparator = null;

    public MyClass(Comparator comparator){
    	this.comparator = comparator;
    }

    public int compare(Human h1,Human h2){
    	// 委譲
    	return this.comparator.compare(h1,h2);
    }

}
