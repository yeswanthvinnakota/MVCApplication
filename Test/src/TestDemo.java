
public class TestDemo extends Demo {
	
	public TestDemo(){
		super();
		System.out.println("i'm from TestDemo default constructor");
	}
	
	public TestDemo(int a) {
		super(10);
		System.out.println("im from TestDemo single parameterized constructor");
		
	}
	
	public static void main(String[] args) {
		TestDemo obj1 = new TestDemo();
		TestDemo obj2 = new TestDemo(10);
	}

}
