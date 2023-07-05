package accessSp;

public class Test1 {

	public static void main(String[] args) {
		demo();  // calling public method
		
		
		Test1 t1=new Test1();
		t1.demo2();    //calling default method
		t1.demo3();    //calling private method
		t1.demo1(); // calling protected method
		

	}
	
	public static void demo() {
		System.out.println("public method");
	}
	protected void demo1() {
		System.out.println("Protected method");
	}
	void demo2() {
		System.out.println("Default method");
	}
	private void demo3() {
		System.out.println("Private method");
	}

}
