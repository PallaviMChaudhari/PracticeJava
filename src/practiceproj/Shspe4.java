package practiceproj;

import java.util.Scanner;

public class Shspe4 {

	public static void main(String[] args) {
		System.out.println("Enetr the any odd number row for Dimond :");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p=n;
		for(int i=1;i<=n;i++) {        //7
		
		     for(int j=1;j<=p;j++) {
		    	 System.out.print(" ");
		     }
	    	  
	        for(int k=1;k<=i;k++) {
	        	System.out.print("* ");
	
	        }
	        System.out.println();
	        p--;
		}
		 input.close();
	}

}
