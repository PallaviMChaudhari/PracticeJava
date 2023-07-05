package Study_Of_Polymorphism;

public class Study_Of_Poly {

	public static void main(String[] args) {
		
		Study_Of_Poly p=new Study_Of_Poly();
		p.add();
		p.add(40, 50);
		p.add(10, 20, 30);

	}
	
	public void add() {
		int a=20;
		int b=10;
		int sum = a+b;
		System.out.println("Addition :"+sum);
	}
	public void add(int x, int y) {
		int a=x;
		int b=y;
		int sum = a+b;
		System.out.println("Addition :"+sum);
	}
	public void add(int x, int y, int z) {
		int a=x;
		int b=y;
		int c=z;
		int sum = a+b+c;
		System.out.println("Addition :"+sum);
	}
	

}
