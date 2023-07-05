package methods;

import java.util.*;

public class Opperation {

	public static void main(String[] args) {
		int g,h;
		System.out.print("enetr the a :");
		 Scanner ip=new Scanner(System.in);
		 g=ip.nextInt();
		 System.out.print("enter the b :");
		 h=ip.nextInt();
		 Multiplication(g,h);
		 ip.close();
		  
		
	}
	
	public static void Multiplication(int g , int h) {
		int i;
		 
		 i=g*h;
		 System.out.println("Multiplication :"+i);
		
	}
	
	public void Division(int g ,int h) {
		int div;
		div=g/h;
		System.out.println("DIvision :"+div);
		
		
	}

}
