package practiceproj;
import java.util.Scanner;
public class Shape2 {

	public static void main(String[] args) {
		System.out.println("enter the no: ");
		Scanner input = new Scanner(System.in);
		int A= input.nextInt();
		System.out.println("Number is:"+A);
		for( int i=A;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
      input.close();
	}

}
