package Study_Of_Polymorphism;

public class Poly2 extends Study_Of_Poly{

	public static void main(String[] args) {
		Poly2 p1=new Poly2();
		p1.add();
		p1.add(20, 80);
		
		Study_Of_Poly p3=new Study_Of_Poly();
		p3.add();
		p3.add(30, 10);
		
	}
	public void add() {
		int a=10;
		int b=30;
		int sum = a+b;
		System.out.println("Addition is:"+sum);
	}
	public void add(int x, int y) {
		int a=x;
		int b=y;
		int sum = a+b;
		System.out.println("Addition :"+sum);
	}

}
