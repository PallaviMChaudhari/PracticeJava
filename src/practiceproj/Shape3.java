package practiceproj;
import java.util.Scanner;

public class Shape3 {

	public static void main(String[] args) {
		System.out.println("Enetr the number of triangle row :");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
	     for(int i=1;i<=a;i++) {
	    	 
	    	 for(int j=a;j>=i;j--) {
	    		 if(j>i) {
	    			 System.out.print(" ");
	    		 }
	    		 else { 
	    			 for(int p=1;p<=i;p++) {
	    				 System.out.print("*");
	    				 System.out.print(" ");
	    			 }
	    		 }
	    	
	    	 }
	    	 System.out.println();
	     }
	     input.close();
	}
}
