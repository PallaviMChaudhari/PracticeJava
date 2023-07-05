package methods;

import java.util.Scanner;

public class MyOperation {

	public static void main(String[] args) {
		int a, b;
		System.out.println("operations perform : ");
		System.out.println("Addition perform");
	    Scanner input = new Scanner(System.in);
	    System.out.print("eneter the A :");
	    a=input.nextInt();
	    System.out.print("enter the B :");
	    b=input.nextInt();
	    //Static method call from same class
		Addition(a, b);
		//object creating of same class
		MyOperation op =new MyOperation();
		//Non static method call from same class
		op.Substraction(a, b);
		//Static method call from different class
		Opperation.Multiplication(a,b);
		//object create of different class
		Opperation pp = new Opperation();
		//Non Static method call from different class
		pp.Division(a, b);
		input.close();
		
	}
	
	public static void Addition(int a, int b) {
	    int c;
	    c=a+b;
	    System.out.println("Addtion :"+c); 
	    
	}
	
	public void Substraction(int a, int b ) {
		int f;
		f=a-b;
		System.out.println("Substraction :"+f);
		
	}
	 

}
