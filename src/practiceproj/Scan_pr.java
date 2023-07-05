package practiceproj;
import java.util.Scanner;
public class Scan_pr {

	public static void main(String[] args) {
		int a,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number 1:");
		a= input.nextInt();
		System.out.println("enter the number2:"+a);
	    b= input.nextInt();
	    int c = a+b;
	    System.out.println("addition:"+c);
	    input.close();

	}

}
