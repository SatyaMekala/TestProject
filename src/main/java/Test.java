
public class Test {

	private int x = 10;
	
	
	
	public Test(){
		
		System.out.println("default contructor");
		
	}
	
public Test(int a){
		
		System.out.println("argument type contructor");
		
	}
	
public void add() {
	System.out.println("No arg method");
}

public void add(int a) {
	System.out.println("No arg method");
}
public void add(int a, int b) {
	System.out.println("No arg method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new Test();

	}

}
